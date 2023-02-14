import java.util.Scanner;
/*



      Cheatdode after game start Enter
              <Death Lotus>


  
  
levels - change stats variable of enemy
timer for combat damage
    -input math question

difficulty option
class otion
*/
public class loopingGame{
    //defining global variable
    private static Scanner scan = new Scanner (System.in);
    public static int levels=1;
    public static boolean gamePass= true;
    public static boolean goBack=false;
    
    public static void main(String[] args){
        do {
            setUp();
            while (gamePass==true)
            {    
                game();
            }

        } while (playAgain());
    }
    //stats vaible for player
    //after game complete stats stay the same for next level
    //till game game reset
    public static int playerHP=100;
    public static int playerMP=100 ;
    public static int playerArmor= 12;
    public static int playerAD= 20 ;
    public static int playerAP= 20;
    public static int gold=0;
    
    //difficulty variable
    public static int difficulty=1;
    
    //class variable
    public static int classType;
    
    
    private static void setUp(){
        //definif input variable
        
        String playerInput, inputChoice2, inputClass;// input choice2 is to check for cheat
        char inputChoice, inputDifficulty;
        
        sopl("Welcome to CompSci Legend");
        sopl("You will be fighting with mutiple opponent to becomes the ultimate legend!!!");
        sopl("Anyways goodluck!!!!!");
        sopl("====================");
        sopl("");
        
        //check for difficulty
        do{
            sopl("pick your difficulty from 1-3:");
            playerInput = scan.nextLine();//check for difficulty
            inputDifficulty = playerInput.toUpperCase().charAt(0);
        }while(!checkValidDifficulty(inputDifficulty));
        
        //check for class
        String coption=("MAGE   TANK    FIGHTER    MARKSMAN");
        
        do{
            sopl(coption);
            sopl("");
            sopl("Mage: extra Mana regen, extra ability power");
            sopl("Tank: extra HP regen, extra HP");
            sopl("Fighter: extra HP, extra ATK, attack drain enemy HP");
            sopl("Marksman: extra ATK, attack reduce enemy armor");
            sopl("");
            sopl("pick your class:");
            playerInput = scan.nextLine();//check for class
            inputClass = playerInput.substring(0).toUpperCase();
        }while(!checkValidClass(inputClass));
        
    }
    private static void game(){
        //game variable
        //enemy stats
        int enemyHP=100 * levels * difficulty;
        int enemyMP=100, enemyMPNeed=80 - 20 * levels;
        int enemyArmour= 10 * levels * difficulty/2;
        int enemyAD=15 * levels * difficulty/2, enemyMinAD=5 * levels + difficulty;

        //items variable
        int longSword=0, faerieCharm=0, rejuvenationBead=0, clothArmor=0, amplifyingTome=0,bloodThirster=0;
        
        //increasae stats equations
        playerArmor += clothArmor*3;
        playerAD += longSword*3 +bloodThirster*5;
        playerAP += amplifyingTome*5;
        
        //timer variable for questions
        double timeInSeconds;
        long timeStart, timeEnd, timePass;
        
        //definif input variable
        String playerInput, inputChoice2;// input choice2 is to check for cheat
        char inputChoice;
        
        //definining in game variable
        int damageBonus=0;
        int drainHP =0;
        //==========================================================

        while(playerHP>0 && enemyHP>0 &&levels<=4){
            goBack=false;// make sure goBack is false so enemy can still have turn
            
            sopl("Player: " + Math.max(playerHP,0) + "hp, Enemy: " + Math.max(0,enemyHP) + "hp");
            sopl("Player Mana: "+ playerMP+ "");
            sopl("Player Gold: "+ gold + "g");
            String options = "Possible moves: (F)ight  (S)kill  (P)shop";
            String soption = "Possible skills : (A)ncient Power(60MP)   (D)ragon Claw(40MP)   (H)eal(20MP)   (G)ear Up(40MP)    (<)go back";
            String ioption = "Items in store: (L)ong Sword(100g)  (F)aerieCharm(200g)  (R)ejuvenationBead(150g)    (C)loth armor(100g)   (A)mplifyingTome(100g)  (B)lood Thirster(300g)";
            
            do {
                sopl(options);
                sopl("Enter your choice: ");  
                playerInput = scan.nextLine(); // Get user input, find first char as capital letter

                inputChoice = playerInput.toUpperCase().charAt(0);//check for normal input
                inputChoice2 = playerInput.toUpperCase();//check for cheat
                sopl("====================");
                sopl("");
                } 
                while (!checkValidInput(inputChoice, playerMP,inputChoice2));
            
            //player otions
            if (inputChoice == 'F'){               
                //define number generating variable
                int randomOperation;
                String operator;
                int num1, num2;
                int answer;
                
                sopl("you will require to do a math question to after you press enter.");
                sopl("the faster you answer the more damage you do. Good luck :)");
                String pause = scan.nextLine();
                
                randomOperation = (int)(Math.random() * 4);            
                if(randomOperation == 0){ //addition
                    operator = " + ";
                    num1 = (int)(Math.random() * 100) + 1;
                    num2 = (int)(Math.random() * 100 * difficulty) + 1;
                    answer = num1 + num2;
                }
                else if(randomOperation == 1){ //subtraction
                    operator = " - ";
                    num1 = (int)(Math.random() * 100) + 1;
                    num2 = (int)(Math.random() * 100 * difficulty) + 1;
                    answer = num1 - num2;
                }
                else if (randomOperation == 2){ //multiplication
                    operator = " * ";
                    num1 = (int)(Math.random() * 12) + 1;
                    num2 = (int)(Math.random() * 20 * difficulty) + 1;
                    answer = num1 * num2;
                }
                else{ //division
                    operator = " / ";
                    num1 = (int)(Math.random() * 12) + 1;
                    num2 = (int)(Math.random() * 30 * difficulty) + 1;
                    answer = num1 * num2;
                    
                    int hold = num1;
                    num1 = answer;
                    answer = hold;
                }
                System.out.print(num1 + operator + num2 + " = "); //print out math equation
                timeStart = System.nanoTime();
                playerInput = scan.nextLine();
                if(playerInput.equals("" + answer)){ //auto attack only if the player inputs the correct answer
                    timeEnd = System.nanoTime();
                    timePass = (timeEnd - timeStart)/1000000000;
                    if(timePass>0){
                        damageBonus= 20-(int)timePass;
                    }
                    else{
                        damageBonus= 0; //if pass time limit no bonus damage
                    }
                    
                    //correct answer
                }

                //damage calculation
                
                int damage=0;
                if(classType==4){//marksman special
                    damage= Math.max (playerAD + damageBonus - (int)(enemyArmour*0.75), (int)(playerAD/3.0));
                    enemyHP = Math.max (0, enemyHP - damage);
                }
                else{
                    damage= Math.max (playerAD + damageBonus - enemyArmour, (int)(playerAD/3.0));
                    enemyHP = Math.max (0, enemyHP - damage);
                }
                
                if(bloodThirster>=1){// blood thirster special
                    drainHP = (int)(damage*0.75)*bloodThirster;
                    playerHP+= drainHP;
                    sopl("Player hits Enemy for " + damage + " damage"); 
                    sopl("player drained " + drainHP + "HP from enemy");
                }
                else{           
                    sopl("Player hits Enemy for " + damage + " damage");     
                }
                if(classType==3){//fighter special
                    drainHP = (int)(damage*0.75);
                    playerHP+= drainHP;
                    sopl("Player hits Enemy for " + damage + " damage"); 
                    sopl("player drained " + drainHP + "HP from enemy");
                }
                if (drainHP> 0 ){
                    sopl("player drained " + drainHP + "HP from enemy");
                }
            }
            else if(inputChoice == 'S')//player pick Skill
            {
                do{
                   sopl(soption);
                   sopl("");
                   sopl("Ancient Power: Increase armour");
                   sopl("Dragon Claw: Deal damage ignoring armour");
                   sopl("Heal: Regain health");
                   sopl("Gear Up: Increase AD(attack damage)");
                   sopl("");
                   sopl("Enter your choice: ");
                   playerInput = scan.nextLine();
                   inputChoice = playerInput.toUpperCase().charAt(0);
                } while(!checkValidSkills(inputChoice));
                //making the skills option
                if(inputChoice =='A'){//Ancient Power
                    if(classType==2){
                        playerArmor += 7;
                        playerHP += playerArmor;
                        sopl("player is bless by the ancient power of tank, Player increase "+ playerArmor+ " HP");
                    }
                    else if(classType==3){
                        playerArmor += 5;
                        playerArmor += playerArmor/2; 
                        sopl("player is bless by the ancient power of fighter, Player increase "+ playerArmor/2+ " HP");
                    }
                    else{
                        playerArmor += 3;
                    }
                    playerMP -= 60;
                    sopl("With the Power of Ancient, Player armor is now "+ playerArmor);
                }
                else if(inputChoice =='D'){//dragon dance
                    int damage = playerAD+10+playerAP/4;
                    playerMP= playerMP-40;
                    enemyHP = enemyHP - damage;
                    if (enemyHP< 0){//overkill bonus
                        sopl("Player sliced the ememy in half");  
                    }
                    else if(enemyHP>0)
                    sopl("Player slashed the enemy for "+ damage+ " damage");
                }
                else if(inputChoice =='H'){//heal
                    playerHP += 10+playerAP;
                    playerMP -= 20;
                    sopl("Player gain "+ (playerHP+10)+" HP from heal");

                }
                else if(inputChoice =='G'){//gear up
                    if(classType==3){
                        playerAD+=6;
                    }
                    else if(classType==4){
                        playerAD+=8;
                    }
                    else{
                        playerAD+= 4;
                    }
                    playerMP-= 40;
                    sopl("Player AD is now " + playerAD);
                }
            }
            else if(inputChoice=='P'){//(L)ong Sword(100g)  (F)aerieCharm(200)  (R)ejuvenationBead(150)    (C)loth armor(100g)   (A)mplifyingTome(100g)  (B)lood Thirster(300g)
                do{//store
                    sopl(ioption);
                    sopl("Long Sword: Increase ATK");
                    sopl("Faerie Charm: Increase Mana regen");
                    sopl("Rejuvenation Bead: Increase HP regen");
                    sopl("Cloth Armor: Increase armor");
                    sopl("Amplifying Tome: Player ablility Power Increase");
                    sopl("Blood Thirster: Drain enemy HP as player attack, Increase ATK");
                    sopl("");
                    sopl("Enter your Choice:");
                    playerInput = scan.nextLine();
                    inputChoice = playerInput.toUpperCase().charAt(0);
                }while(!checkValidItem(inputChoice));
                if(inputChoice =='L' && gold >= 100){
                    longSword +=1;
                    gold -= 100;
                }
                else if (inputChoice == 'F'&& gold >= 150){
                    faerieCharm +=1;
                    gold -= 150;
                }
                else if (inputChoice == 'R'&& gold >= 150){
                    rejuvenationBead += 1;
                    gold -= 150;
                }
                else if (inputChoice == 'C'&& gold >= 100){
                    clothArmor += 1;
                    gold -= 100;
                }
                else if (inputChoice == 'A'&& gold >= 100){
                    amplifyingTome += 1;
                    gold -= 100;
                }
                else if (inputChoice == 'B'&& gold >= 200){
                    bloodThirster += 1;
                    gold -= 200;
                }                
            }
            
            if (inputChoice2.equals("DEATH LOTUS")){//cheat code
                int damage= enemyHP;
                enemyHP= enemyHP - damage;
                sopl("player execute enemy");
            }

            //enemy option
            
            if (enemyHP>0 && goBack==false){
                if(enemyMP>=enemyMPNeed){//if mana is enough able to act mutiple action
                    int enemyChoice = (int)(Math.random() * 3);//random number generating
                    
                    //fight option
                    if (enemyChoice == 0){
                        int damage = Math.max (enemyAD + (int)(Math.random()*4) - playerArmor, enemyMinAD);
                        playerHP -= damage;
                        System.out.println("Enemy hits Player for " + damage + " damage");
                    }
                    
                    //skill attack
                    //heals
                    
                    else if (enemyChoice == 1){
                        enemyMP = enemyMP - enemyMPNeed;
                        int healNum = Math.max(40,enemyHP/5);
                        enemyHP= enemyHP+ healNum;
                        sopl("enemy healed for "+ healNum + " HP");
                    }
                    
                    //meteoroid strike
                    //clear out whole mana bar
                    
                    else if (enemyChoice == 2){
                        enemyMP = enemyMP - enemyMP;
                        int damage = Math.max (playerHP/2- playerArmor, enemyMinAD*2);
                        playerHP -= damage;
                        sopl("enemy used meteoroid strike");
                        sopl("enemy summon a meteoroid and deal "+damage+" damage!!!");
                    }
                }
                else{
                    int damage = Math.max (enemyAD + (int)(Math.random()*4) - playerArmor, enemyMinAD);
                    playerHP -= damage;
                    System.out.println("Enemy hits Player for " + damage + " damage");
                }
                //adding seperation and increase mana per turn
                sopl("====================");
                sopl("");
                enemyMP= enemyMP+10;
                
                if(classType== 1){ //mage bonus on mana regen
                    playerMP= playerMP+20 + faerieCharm*10;
                }
                else{//rejuvenationBead=0
                    playerMP= playerMP + 10 + faerieCharm*10;
                }
                
                if(rejuvenationBead>=1)//adding HP regen if have rejuvenation Bead
                {
                    playerHP+= rejuvenationBead*15;
                }
                if(classType==2){// tank special HP Regen
                    playerHP+= playerHP/10;
                }
            }
            if(enemyHP<=0){
                gold+=25*levels;
            }
            gold+=25;
        }
        if (playerHP>0 && enemyHP<=0){
            sopl("player have defeated the enemy!!");
            sopl("");
            nextLevel();
            gamePass=true;
        }
        else if(playerHP>0 && levels>4){
            sopl("Congratulation!!! you beat the final enemy");
            sopl("you are now the new Ultimate Compsci legend !!");
        }
        else{
            sopl("player have been defeated by the enemy, try harder next time :(");
            sopl("");
            gamePass=false;
        }
    }
    
    //checking Valid Input with primary option
    private static boolean checkValidInput (char userChoice, int playerMP, String cheat)
    {    
        if (userChoice == 'F'){
            return true;
        } 
        else if (userChoice == 'S' && playerMP >= 20){//checking do player have minium mana for skills
            return true;
        }
        else if (cheat.equals("DEATH LOTUS")){//check cheat
            return true;
        }   
        else if (userChoice == 'S' && playerMP < 20){
            sopl("Not enough Mana");
        }
        else if(userChoice == 'P'){
            return true;
        }
        return false;
    
    }   
    
    //checking valid input for skills option
    private static boolean checkValidSkills(char userChoice){
        if(userChoice=='A')//checking mana
        {
            if(playerMP<60){
                sopl("Not enough Mana");
                return false;
            }
            return true;
        }
        else if(userChoice=='D'||userChoice=='G'){
            if(playerMP<40){
                sopl("Not enough Mana");
                return false;
            }
            return true;
        }
        else if(userChoice=='H'){
                if(playerMP<20){
                sopl("Not enough Mana");
                return false;
            }
            return true;
        }        
        else if(userChoice=='<'){
            goBack=true;
            sopl("====================");
            sopl("");
            return true;
        }
        return false;
    }
    
    //checking Valid difficulty input
    private static boolean checkValidDifficulty(char userChoice){
        if(userChoice=='1'){
            difficulty= 1;
            return true;
        }
        else if (userChoice=='2'){
            difficulty= 2;
            return true;
        }
        else if (userChoice=='3'){
            difficulty= 3;
            return true;
        }
        return false;
    }
    
    //check Valid Class input
        private static boolean checkValidClass(String userChoice){
        if(userChoice.equals("MAGE")){
            classType=1;
            playerAP=40;
            return true;
        }
        else if (userChoice.equals("TANK")){
            classType=2;
            playerHP=300;
            playerArmor=20;
            return true;
        }
        else if (userChoice.equals("FIGHTER")){
            classType=3;
            playerHP=200;
            playerAD=30;
            playerArmor=15;
            return true;
        }
        else if (userChoice.equals("MARKSMAN")){
            classType=4;
            playerAD=40;
            return true;
        }
        return false;
    }
    
    //check Valid item input
    private static boolean checkValidItem(char userChoice){//(L)ong Sword(100g)  (F)aerieCharm(200)  (R)ejuvenationBead(150)    (C)loth armor(100g)   (A)mplifyingTome(100g)  (B)lood Thirster(300g)
        goBack=true;//set go back as always true when in store
        if(userChoice=='L'){
            if(gold<100){
                sopl("Not enough gold");
                return false;
            }
            return true;
        }
        else if (userChoice=='F'){
            if(gold<200){
                sopl("Not enough gold");
                return false;
            }
            return true;
        }
        else if (userChoice=='R'){
            if(gold<200){
                sopl("Not enough gold");
                return false;
            }
            return true;
        }
        else if (userChoice=='R'){
            if(gold<150){
                sopl("Not enough gold");
                return false;
            }
            return true;
        }
        else if (userChoice=='C'){
            if(gold<100){
                sopl("Not enough gold");
                return false;
            }
            return true;
        }
        else if (userChoice=='A'){
            if(gold<100){
                sopl("Not enough gold");
                return false;
            }
            return true;
        }
        else if (userChoice=='B'){
            if(gold<300){
                sopl("Not enough gold");
                return false;
            }
            return true;
        }
        else if(userChoice=='<'){
            sopl("====================");
            sopl("");
            return true;
        }
        return false;
    }
    
    //check play valid play again input
    private static boolean playAgain() {
        System.out.println("Would you like to play again? (Y/N)");
        String answer = scan.nextLine();
        char result = answer.toUpperCase().charAt(0);
        if(result=='Y'){
            //reset player's stats variable after restart
            playerHP=100;
            playerMP=100 ;
            playerArmor= 12;
            playerAD= 20 ;
            
            return true;
        }
        return false;
    }
    
    private static void sopl (String input){
        System.out.println(input);        
    }
    
    //if want to move to next level
    private static boolean nextLevel(){
        System.out.println("Would you like to move up a level (Y/N)");
        String answer = scan.nextLine();
        char result = answer.toUpperCase().charAt(0);
        if (result=='Y'){
            levels+=1;
            return true;
        }
        else{
            gamePass = false;
            return false;
        }
    }
}

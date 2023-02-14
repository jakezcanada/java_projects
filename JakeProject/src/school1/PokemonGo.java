package school1;

import java.util.Scanner;

public class PokemonGo {
	public static void pikachu() {
		System.out.println("" + 
				"Character: Pikachu\r\n" + 
				"Species: Mouse\r\n" + 
				"Type: Electric\r\n" + 
				"Ability: Static\r\n" + 
				"Weakness: Ground\r\n" + 
				"Evolutions: Pichu, Pikachu, Raichu");
	}
	
	public static void tauros() {
		System.out.println("" + 
				"Character: Tauros\r\n" + 
				"Species: Bull\r\n" + 
				"Type: Normal\r\n" + 
				"Ability: Intimidate, Anger Point, Sheer Force\r\n" + 
				"Weakness: Fighting\r\n" + 
				"Evolutions: Tauros");
	}
	
	public static void magikarp() {
		System.out.println("" + 
				"Character: Magikarp\r\n" + 
				"Species: Fish\r\n" + 
				"Type: Water\r\n" + 
				"Ability: Swift Swim, Rattled\r\n" + 
				"Weakness: Electric, Grass\r\n" + 
				"Evolutions: Magikarp, Gyarados");
	}
	
	public static void lapras() {
		System.out.println("" + 
				"Character: Lapras\r\n" + 
				"Species: Plesiosaur\r\n" + 
				"Type: Water, Ice\r\n" + 
				"Ability: Water Absorb, Shell Armor, Hydration\\r\\n" +
				"Weakness: Fighting, Electric, Grass, Rock\r\n" + 
				"Evolutions: Lapras");
	}
	
	public static void ditto() {
		System.out.println("" + 
				"Character: Ditto\r\n" + 
				"Species: ???\r\n" + 
				"Type: Normal\r\n" + 
				"Ability: Limber, Imposter\r\n" + 
				"Weakness: Fighting\r\n" + 
				"Evolutions: Ditto");
	}
	
	public static void omanyte() {
		System.out.println("" + 
				"Character: Omanyte\r\n" + 
				"Species: Snail\r\n" + 
				"Type: Rock, Water\r\n" + 
				"Ability: Swift Swim, Shell Armor, Weak Armor\r\n" + 
				"Weakness: Fighting, Electric, Grass, Ground\r\n" + 
				"Evolutions: Omanyte, Omastar");
	}
	
	public static void aerodactyl() {
		System.out.println("" + 
				"Character: Aerodactyl\r\n" + 
				"Species: Pterodactyl\r\n" + 
				"Type: Rock, Flying\r\n" + 
				"Ability: Rock Head, Pressure, Unnerve, Tough Claws\r\n" + 
				"Weakness: Ice, Steel, Water, Electric, Rock\r\n" + 
				"Evolutions: Aerodactyl");
	}
	
	public static void snorlax() {
		System.out.println("" + 
				"Character: Snorlax\r\n" + 
				"Species: Bear?\r\n" + 
				"Type: Normal\r\n" + 
				"Ability: Immunity, Thick Fat, Gluttony\r\n" + 
				"Weakness: Fighting\r\n" + 
				"Evolutions: Snorlax");
	}
	
	public static void mew() {
		System.out.println("" + 
				"Character: Mew\r\n" + 
				"Species: Embryo\r\n" + 
				"Type: Psychic\r\n" + 
				"Ability: Synchronize\r\n" + 
				"Weakness: Bug, Ghost, Dark\r\n" + 
				"Evolutions: Mew");
	}
	
	public static void jynx() {
		System.out.println("" + 
				"Character: Jynx\r\n" + 
				"Species: Human-like\r\n" + 
				"Type: Ice, Psychic\r\n" + 
				"Ability: Oblivious, Forewarn, Dry Skin\r\n" + 
				"Weakness: Bug, Ghost, Dark, Fire, Steel, Rock\r\n" + 
				"Evolutions: Smoochum, Jynx");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 1;
		String in = "";
		System.out.println("Choose from the following list of pokemon:");
		System.out.println("	1. Pikachu");
		System.out.println("	2. Tauros");
		System.out.println("	3. Magikarp");
		System.out.println("	4. Lapras");
		System.out.println("	5. Ditto");
		System.out.println("	6. Omanyte");
		System.out.println("	7. Aerodactyl");
		System.out.println("	8. Snorlax");
		System.out.println("	9. Mew");
		System.out.println("	10. Jynx");
		System.out.println("	11. Exit");
		
		while(!in.equals("N")) {
			if(count<=10) {
				System.out.println(count);
				if(count==1) {
					pikachu();
				}else if(count==2) {
					tauros();
				}else if(count==3) {
					magikarp();
				}else if(count==4) {
					lapras();
				}else if(count==5) {
					ditto();
				}else if(count==6) {
					omanyte();
				}else if(count==7) {
					aerodactyl();
				}else if(count==8) {
					snorlax();
				}else if(count==9) {
					mew();
				}else if(count==10) {
					jynx();
				}
			}else {
				System.out.println("You've reached the end of the list!");
				break;
			}
			System.out.println("Would you like to see another pokemon Y/N?");
			in = sc.next();
			while(!(in.equals("Y") || in.equals("N"))) {
				System.out.println("Would you like to see another pokemon Y/N?");
				in = sc.next();
			}
			count++;
		}
		System.out.println("Goodbye.");
	}

}

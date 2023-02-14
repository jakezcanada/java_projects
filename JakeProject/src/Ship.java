import java.util.Scanner;

public class Ship {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		for(char myChar:input.toCharArray()){
			
		}
		String ship = "BFTLC";
		for(int i=0;i<input.length();i++){
			char c = input.charAt(i);
			if(input.indexOf("B") != -1  ){
				ship.replaceAll(c+"", "");
			}
		}
		
		if(input.indexOf("B") != -1){
			ship = ship.replaceAll("B", "");
		}
		if(input.indexOf("F") != -1){
			ship = ship.replaceAll("F", "");
		}
		if(input.indexOf("T") != -1){
			ship = ship.replaceAll("T", "");
		}
		if(input.indexOf("L") != -1){
			ship = ship.replaceAll("L", "");
		}
		if(input.indexOf("C") != -1){
			ship = ship.replaceAll("C", "");
		}
		if(ship.equals("")){
			System.out.println("NO MISSING PARTS");
		}else{
			System.out.println(ship);
		}
	}
}

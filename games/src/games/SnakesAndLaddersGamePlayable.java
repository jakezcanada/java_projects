package games;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SnakesAndLaddersGamePlayable {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Remember: you are rolling a 12 sided cube :)");
		int in1 = sc.nextInt();
		int place = 1 + in1;
		if(place==9){
			place=34;
			System.out.println("Yay!You found a ladder! :)");
		}else if(place==40){
			place=64;
			System.out.println("Yay!You found a ladder! :)");
		}else if (place==67){
			place=86;
			System.out.println("Yay!You found a ladder! :)");
		}else if(place==90){
			place=48;
			System.out.println("Oh no!A snake ate you! :(");
		}else if(place==54){
			place=19;
			System.out.println("Oh no!A snake ate you! :(");
		}else if(place==99){
			place=77 ;
			System.out.println("Oh no!A snake ate you! :(");
		}
		System.out.println("You are now on square " + place);
		boolean toggle = false;
		if(in1 == 0){
			System.out.println("You Quit!");
		}else{
		while(!toggle){
			int in2 = sc.nextInt();
			place += in2;
			if((place>100) || (in2>12 || in2<1)){
				place-=in2;
			}
			if(place==9){
				place=34;
				System.out.println("Yay!You found a ladder! :)");
			}else if(place==40){
				place=64;
				System.out.println("Yay!You found a ladder! :)");
			}else if (place==67){
				place=86;
				System.out.println("Yay!You found a ladder! :)");
			}else if(place==90){
				place=48;
				System.out.println("Oh no!A snake ate you! :(");
			}else if(place==54){
				place=19;
				System.out.println("Oh no!A snake ate you! :(");
			}else if(place==99){
				place=77 ;
				System.out.println("Oh no!A snake ate you! :(");
			}
			System.out.println("You are now on square " + place);
			if(in2 == 0){
				System.out.println("You Quit!");
				toggle = true;
			}else if(place==100){
				System.out.println("You Win!");
				toggle = true;
			}
		}
/*		for(int i = 0; i<myList.size(); i++){
			System.out.println(myList.get(i));
		}*/
		}
	}
}

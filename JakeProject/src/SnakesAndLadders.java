import java.util.*;

public class SnakesAndLadders {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		List<String> myList = new ArrayList<String>();
		int in1 = sc.nextInt();
		int place = 1 + in1;
		if(place==9){
			place=34;
		}else if(place==40){
			place=64;
		}else if (place==54){
			place=19;
		}else if(place==90){
			place=48;
		}else if(place==67){
			place=86;
		}else if(place==99){
			place=77 ;
		}
		myList.add("You are now on square " + place);
		boolean toggle = false;
		if(in1 == 0){
			System.out.println("You Quit!");
		}else{
		while(!toggle){
			int in2 = sc.nextInt();
			place += in2;
			if((place>100) || (in2>12 || in2<2)){
				place-=in2;
			}
			if(place==9){
				place=34;
			}else if(place==40){
				place=64;
			}else if (place==54){
				place=19;
			}else if(place==90){
				place=48;
			}else if(place==67){
				place=86;
			}else if(place==99){
				place=77 ;
			}
			myList.add("You are now on square " + place);
			if(in2 == 0){
				myList.add("You Quit!");
				toggle = true;
			}else if(place==100){
				myList.add("You Win!");
				toggle = true;
			}
		}
		for(int i = 0; i<myList.size(); i++){
			System.out.println(myList.get(i));
		}
		}
	}
}

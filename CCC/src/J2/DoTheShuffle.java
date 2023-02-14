package J2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DoTheShuffle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> songs = new ArrayList<String>();
		
		songs.add("A");		
		songs.add("B");		
		songs.add("C");		
		songs.add("D");		
		songs.add("E");		
	
		boolean looper = true;
		while(looper) {
			int button = sc.nextInt();
			int pressCount = sc.nextInt();
			switch(button) {
			case 1:
				pressCount = pressCount%5;
				for(int i = 0; i<pressCount; i++) {
					songs.add(songs.get(0));
					songs.remove(0);
				}
				break;
			case 2:
				pressCount = pressCount%5;
				for(int i = 0; i<pressCount; i++) {
					songs.add(0, songs.get(songs.size()-1));
					songs.remove(songs.size() - 1);
				}				
				break;
			case 3:
				if(pressCount%2!=0) {
					Collections.swap(songs, 0, 1);
				}
				break;
			case 4:
				for(int i = 0; i<songs.size(); i++) {
					System.out.print(songs.get(i));
					if(i!=songs.size()-1) {
						System.out.print(" ");
					}
				}
				looper = false;
				break;	
			}
		}

	}

}

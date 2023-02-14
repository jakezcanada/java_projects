package testing2;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class TestSodukuOptimizer {

	public static void main(String[] args) {
		generate();
	}
	public static boolean trueOrFalse(int randomNum, int i, int j, int rowNum1, int rowNum2, int rowNum3, int colNum1, int colNum2, int colNum3, Set<Integer> boxSet, Set<Integer> columnSet1, Set<Integer> columnSet2, Set<Integer> columnSet3, Set<Integer> rowSet1, Set<Integer> rowSet2, Set<Integer> rowSet3){                                                                                                                          
		boolean togg = false;
		if(boxSet.contains(randomNum)){
			togg = true;
		}
		if(j==colNum1){
			if(columnSet1.contains(randomNum)){
				togg = true;
			}
		}else if(j==colNum2){
			if(columnSet2.contains(randomNum)){
				togg = true;
			}
		}else if(j==colNum3){
			if(columnSet3.contains(randomNum)){
				togg = true;
			}
		}
		if(i==rowNum1){
			if(rowSet1.contains(randomNum)){
				togg = true;
			}
		}else if(i==rowNum2){
			if(rowSet2.contains(randomNum)){
				togg = true;
			}
		}else if(i==rowNum3){
			if(rowSet3.contains(randomNum)){
				togg = true;
			}
		}
		if(!togg){
			boxSet.add(randomNum);
			if(j==colNum1){
				columnSet1.add(randomNum);
			}else if(j==colNum2){
				columnSet2.add(randomNum);
			}else if(j==colNum3){
				columnSet3.add(randomNum);
			}
			if(i==rowNum1){
				rowSet1.add(randomNum);
			}else if(i==rowNum2){
				rowSet2.add(randomNum);
			}else if(i==rowNum3){
				rowSet3.add(randomNum);
			}
		}
		return togg;
	}
	public static void generate() {
		int[][] numbers = new int[9][9];
		boolean equals = false;
		int loopCounter = 0;
		while(true){
			loopCounter++;
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					numbers[i][j] = 0;
				}
			}
			Set<Integer> row1 = new LinkedHashSet<Integer>();
			Set<Integer> row2 = new LinkedHashSet<Integer>();
			Set<Integer> row3 = new LinkedHashSet<Integer>();
			Set<Integer> row4 = new LinkedHashSet<Integer>();
			Set<Integer> row5 = new LinkedHashSet<Integer>();
			Set<Integer> row6 = new LinkedHashSet<Integer>();
			Set<Integer> row7 = new LinkedHashSet<Integer>();
			Set<Integer> row8 = new LinkedHashSet<Integer>();
			Set<Integer> row9 = new LinkedHashSet<Integer>();
			
			Set<Integer> col1 = new LinkedHashSet<Integer>();
			Set<Integer> col2 = new LinkedHashSet<Integer>();
			Set<Integer> col3 = new LinkedHashSet<Integer>();
			Set<Integer> col4 = new LinkedHashSet<Integer>();
			Set<Integer> col5 = new LinkedHashSet<Integer>();
			Set<Integer> col6 = new LinkedHashSet<Integer>();
			Set<Integer> col7 = new LinkedHashSet<Integer>();
			Set<Integer> col8 = new LinkedHashSet<Integer>();
			Set<Integer> col9 = new LinkedHashSet<Integer>();
			
			Set<Integer> box1 = new LinkedHashSet<Integer>();
			Set<Integer> box2 = new LinkedHashSet<Integer>();
			Set<Integer> box3 = new LinkedHashSet<Integer>();
			Set<Integer> box4 = new LinkedHashSet<Integer>();
			Set<Integer> box5 = new LinkedHashSet<Integer>();
			Set<Integer> box6 = new LinkedHashSet<Integer>();
			Set<Integer> box7 = new LinkedHashSet<Integer>();
			Set<Integer> box8 = new LinkedHashSet<Integer>();
			Set<Integer> box9 = new LinkedHashSet<Integer>();
			
			Random rand;
			int randHelper = 9;
			boolean toggle = false;
			final boolean foreverLooper = false;
			for (int i = 0; i < 9; i++) {
				int counter = 0;
				for (int j = 0; j < 9; j++) {
					int randomNum = ThreadLocalRandom.current().nextInt(1, 9 + 1);
					counter = 0;
					while(!foreverLooper){
						randomNum = ThreadLocalRandom.current().nextInt(1, 9 + 1);
						if(i<=2 && j<=2){
									toggle = trueOrFalse(randomNum, i, j, 0, 1, 2, 0, 1, 2, box1, col1, col2, col3, row1, row2, row3);
						}else if(i<=2 && j>=3 && j<=5){
									toggle = trueOrFalse(randomNum, i, j, 0, 1, 2, 3, 4, 5, box2, col4, col5, col6, row1, row2, row3);
						}else if(i<=2 && j>=6){
									toggle = trueOrFalse(randomNum, i, j, 0, 1, 2, 6, 7, 8, box3, col7, col8, col9, row1, row2, row3);
						}else if(i>=3 && i<=5 && j<=2){
									toggle = trueOrFalse(randomNum, i, j, 3, 4, 5, 0, 1, 2, box4, col1, col2, col3, row4, row5, row6);
						}else if(i>=3 && i<=5 && j>=3 && j<=5){
									toggle = trueOrFalse(randomNum, i, j, 3, 4, 5, 3, 4, 5, box5, col4, col5, col6, row4, row5, row6);
						}else if(i>=3 && i<=5 && j>=6){
									toggle = trueOrFalse(randomNum, i, j, 3, 4, 5, 6, 7, 8, box6, col7, col8, col9, row4, row5, row6);
						}else if(i>=6 && j<=2){
									toggle = trueOrFalse(randomNum, i, j, 6, 7, 8, 0, 1, 2, box7, col1, col2, col3, row7, row8, row9);	
						}else if(i>=6 && j>=3 && j<=5){
									toggle = trueOrFalse(randomNum, i, j, 6, 7, 8, 3, 4, 5, box8, col4, col5, col6, row7, row8, row9);
						}else if(i>=6 && j>=6){
									toggle = trueOrFalse(randomNum, i, j, 6, 7, 8, 6, 7, 8, box9, col7, col8, col9, row7, row8, row9);
						}
						if(toggle==false){
							break;
						}
						if(counter>=100){
							break;
						}
						toggle = false;
						counter++;
					}
					numbers[i][j] = randomNum;
					if(counter>=100){
						break;
					}
				}
				if(counter>=100){
					break;
				}
			}
			if(!toggle){
				break;
			}
		}
		for (int j = 0; j < 9; j++) {
			for (int i = 0; i < 9; i++) {
				System.out.print(numbers[j][i] + " ");
			}
			System.out.println();
		}
		System.out.println("runs : " + loopCounter);
	}
}	
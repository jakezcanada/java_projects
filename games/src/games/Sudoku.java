package games;

import javax.swing.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;

public class Sudoku extends JFrame {
	public static int[][] numbers = new int[9][9];
	public static final int NumOfHoles = 20;
	public static Set<Integer> box1 = new LinkedHashSet<Integer>();
	public static Set<Integer> box2 = new LinkedHashSet<Integer>();
	public static Set<Integer> box3 = new LinkedHashSet<Integer>();
	public static Set<Integer> box4 = new LinkedHashSet<Integer>();
	public static Set<Integer> box5 = new LinkedHashSet<Integer>();
	public static Set<Integer> box6 = new LinkedHashSet<Integer>();
	public static Set<Integer> box7 = new LinkedHashSet<Integer>();
	public static Set<Integer> box8 = new LinkedHashSet<Integer>();
	public static Set<Integer> box9 = new LinkedHashSet<Integer>();
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
			
			box1 = new LinkedHashSet<Integer>();
			box2 = new LinkedHashSet<Integer>();
			box3 = new LinkedHashSet<Integer>();
			box4 = new LinkedHashSet<Integer>();
			box5 = new LinkedHashSet<Integer>();
			box6 = new LinkedHashSet<Integer>();
			box7 = new LinkedHashSet<Integer>();
			box8 = new LinkedHashSet<Integer>();
			box9 = new LinkedHashSet<Integer>();
			
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
	}
	public int[] toInt(Set<Integer> set) {
		  int[] a = new int[9];
		  int i = 0;
		  for (Integer val : set){ a[i++] = val;}
		  return a;
	}
  public Sudoku() {
    super("Sudoku");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JPanel paneTopLeft = new JPanel();
    JPanel paneTopMiddle = new JPanel();
    JPanel paneTopRight = new JPanel();
    JPanel paneCenterLeft = new JPanel();
    JPanel paneCenter = new JPanel();
    JPanel paneCenterRight = new JPanel();
    JPanel paneBottomLeft = new JPanel();
    JPanel paneBottomMiddle = new JPanel();
    JPanel paneBottomRight = new JPanel();
    int[] arr1 = toInt(Sudoku.box1);
    int[] arr2 = toInt(Sudoku.box2);
    int[] arr3 = toInt(Sudoku.box3);
    int[] arr4 = toInt(Sudoku.box4);
    int[] arr5 = toInt(Sudoku.box5);
    int[] arr6 = toInt(Sudoku.box6);
    int[] arr7 = toInt(Sudoku.box7);
    int[] arr8 = toInt(Sudoku.box8);
    int[] arr9 = toInt(Sudoku.box9);
	List<Integer> setListRow = new ArrayList<Integer>();
	List<Integer> setListCol = new ArrayList<Integer>();
	List<int[]> arrList = new ArrayList<int[]>();
	arrList.add(arr1);
	arrList.add(arr2);
	arrList.add(arr3);
	arrList.add(arr4);
	arrList.add(arr5);
	arrList.add(arr6);
	arrList.add(arr7);
	arrList.add(arr8);
	arrList.add(arr9);
	for(int i = 0; i<=NumOfHoles; i++){
		int randomNum1 = ThreadLocalRandom.current().nextInt(0, 8+1);
		int randomNum2 = ThreadLocalRandom.current().nextInt(0, 8+1);
		setListRow.add(arrList.get(randomNum1)[randomNum2]);
		arrList.get(randomNum1)[randomNum2] = 0; 
	}
    this.setLayout(new GridLayout(3,3));
    BorderMaker.gbc.gridx = 0;
    BorderMaker.gbc.gridy = 0;
    BorderMaker.gbc.gridheight = 150;
    BorderMaker.gbc.gridwidth = 150;
    makePanel(paneTopLeft, arr1);
    makePanel(paneTopMiddle, arr2);
    makePanel(paneTopRight, arr3);
    makePanel(paneCenterLeft, arr4);
    makePanel(paneCenter, arr5);
    makePanel(paneCenterRight, arr6);
    makePanel(paneBottomLeft, arr7);
    makePanel(paneBottomMiddle, arr8);
    makePanel(paneBottomRight, arr9);
    this.setSize(450,450);
    this.setVisible(true);
  }
  public void makePanel(JPanel j, int[] arr){
	    ((JComponent) j).setBorder(BorderFactory.createEmptyBorder(3,3,3,3));
	    j.setLayout(new GridLayout(3,3));
	    j.setBackground(Color.black);
	    for(int i = 0; i<9; i++){
	    	JTextField b3 = new JTextField("");
	    	JTextField b1 = new JTextField(arr[i]+"");
	    	if(arr[i]==0){
	    		j.add(b3);
	    	}else{
	    		j.add(b1);
	    	}
	    }
	    j.setSize(150, 150);
	    this.add(j,BorderMaker.gbc);
	    this.setVisible(true);
  }
  public static void main(String args[]) {
	  generate();
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Sudoku();
        new BorderMaker();
      }
    });
  }
}
class BorderMaker extends JPanel{
	public static GridBagConstraints gbc = new GridBagConstraints();
	public static Dimension d = new Dimension();
	public BorderMaker() {
		  setBorder(BorderFactory.createLineBorder(Color.black));
		  d.setSize(30, 30);
	}
	public void paintComponent(Graphics g) {
		
		
	}
}
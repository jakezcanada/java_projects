import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class KeepOnTruckin {
	public static int[][][] visited;
	public static int count = 0;
	public static int min = 0;
	public static int max = 0;
	public static boolean foundCombo = false;
	public static boolean goingBack = false;
	public static List<Integer> myList = new ArrayList<Integer>();
	public static List<List<Integer>> resultList = new ArrayList<List<Integer>>();List<List<Integer>> firstElementMatched = new ArrayList<List<Integer>>();
List<List<Integer>> secondElementMatched = new ArrayList<List<Integer>>();
	public static List<List<Integer>> listList = new ArrayList<List<Integer>>();
/*	public static int pi(int minDist, int maxDist, int min, int pos){
			if(minDist==maxDist){
				visited[minDist][maxDist][min] = 1;
				
			}else if(minDist==1 && pos == myList.size()-1){
				visited[minDist][maxDist][min] = 1;
				
			}else{
				int t = 0;
				for(int i = min; i<(minDist/maxDist)+1; i++){
					t = t + pi(minDist-i, maxDist-1, i, pos);
					pos++;
					min++; 
				}
				visited[minDist][maxDist][min] = t;
			}
		return visited[minDist][maxDist][min];
		
	}*/
/*	public static void findCombos(int pos){
		if(foundCombo){
			foundCombo = false;
			count++;
		}
		for(int i = 1; i<myList.size(); i++){
			if(goingBack && i==1){
				pos--;
			}else if(pos+i>myList.size()){
				pos--;
				goingBack = true;
			}else if(Math.abs(myList.get(pos)-myList.get(pos+i))< max && Math.abs(myList.get(pos)-myList.get(pos+i))>min && pos+i<=myList.size()){
				pos= pos+i;
			}else{
				return;
			}
			if(pos==myList.size()-1){	
				foundCombo=true;
			}
			System.out.println(pos + " *");
			findCombos(pos);
		}

	}*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 	
		int minDist = sc.nextInt();
		int maxDist = sc.nextInt();
		min = minDist;
		max = maxDist;
		int numOfMotels = sc.nextInt();
		for(int i = 0; i<numOfMotels; i++){
			int motel = sc.nextInt();
			myList.add(motel);
		}
		myList.add(7000);
		myList.add(6010);
		myList.add(5990);
		myList.add(5030);
		myList.add(4970);
		myList.add(4060);
		myList.add(3930);
		myList.add(3060);
		myList.add(2940);
		myList.add(2030);
		myList.add(1970);
		myList.add(1010);
		myList.add(990);
		myList.add(0);
		Collections.sort(myList);
/*		visited= new int[minDist+1][maxDist+1][numOfMotels+1];
	    for (int[][] square : visited) {
	        for (int[] line : square) {
	            Arrays.fill(line, 0);
	        }
	    }*/
		List<Integer> initial = new ArrayList<Integer>();
		initial.add(0);
		listList.add(initial);
		boolean stop = false;
	    for(int i = 1; i<myList.size(); i++){
	    	//int[] arrOfNum = new ArrayList<Integer>();
	    	for(int j = i; j<myList.size(); j++){
	    		int difference = myList.get(j) - myList.get(i-1);
	    		//System.out.print(difference + " ");
	    		if(difference <= max && difference >= min){ 
	    			//int[] arrOfNum = new int[2];
	    			if(j!=i){
	    				int counter = 0;
		    			for(List<Integer> arr : listList){
		    				if(arr.get(arr.size()-1) == myList.get(i-1)){
		    					listList.get(counter).add(myList.get(j));
		    				}
	/*	    				if(myList.get(j)==3930){
		    					int fhweianfsj = 0;
		    				}*/
		    				counter++;
		    			}
	    			}else{
		    			int counter = 0;
		    			for(List<Integer> arr : listList){
		    				if(arr.get(arr.size()-1) == myList.get(i-1)){
		    					listList.get(counter).add(myList.get(j));
		    				}
	/*	    				if(myList.get(j)==3930){
		    					int fhweianfsj = 0;
		    				}*/
		    				counter++;
		    			}
	    			}
	    			//System.out.println(Arrays.toString(arrOfNum));
	    			//listList.add(arrOfNum);
	    			
	    		}else{
	    			//System.out.println("skip");
	    		}
	    	}
	    	//listList.add(arrOfNum);
	    }
	    for(int i = 1; i<myList.size(); i++){//loops through every number
	    	List<List<Integer>> firstElementMatched = new ArrayList<List<Integer>>();
	    	List<List<Integer>> lastElementMatched = new ArrayList<List<Integer>>();
	    	List<List<Integer>> result = new ArrayList<List<Integer>>();
	    	for(int j = 0; j<listList.size(); j++){//finds things to add to first matched
 				if(listList.get(j).get(0) == myList.get(i)){
 					firstElementMatched.add(listList.get(j));
 				}
 			}
	    	listList.removeAll(firstElementMatched);
	    	for(int j = 0; j<listList.size(); j++){//finds things to add to second matched
 				if(listList.get(j).get(listList.get(j).size()-1) == myList.get(i)){
 					lastElementMatched.add(listList.get(j));
 				}
 			}
	    	listList.removeAll(lastElementMatched);
	    	for(int j = 0; j<firstElementMatched.size(); j++){
	    		for(int k = 0; k<lastElementMatched.size(); k++){
	    	    	List<Integer> tmp = new ArrayList<Integer>();
	    	    	tmp.addAll(lastElementMatched.get(k));
	    	    	tmp.add(firstElementMatched.get(j).get(1));
	    	    	listList.add(tmp);
	    		}
	    	}
	    	
		}
/*	    for(int i = 0; i<listList.size(); i++){
	    	int find = listList.get(i)[1];
	    	for(int j = 0; j<listList.size(); j++){
	    		int target = listList.get(i)[0];
	    		if(find == target){
	    			
	    		}
	    	}
	    }*/
	    
	    System.out.println(count);
	}

}

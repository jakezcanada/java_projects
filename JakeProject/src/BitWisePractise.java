import java.util.*;

public class BitWisePractise {
	private static int THREE_DIMENTION = 3;
	private static int handle3D(int[] arr){
		List<Integer> myList = new ArrayList<Integer>();
		int num = 8;
		for (int i = 0; i < num; i++) {
			int corner = arr[i];
			int temp = findPotency1(corner, arr);
			myList.add(temp);
		}
		int s12 = myList.get(0) + myList.get(1);
		int s13 = myList.get(0) + myList.get(2);
		int s15 = myList.get(0) + myList.get(4);
		int s24 = myList.get(1) + myList.get(3);
		int s26 = myList.get(1) + myList.get(5);
		int s34 = myList.get(2) + myList.get(3);
		int s37 = myList.get(2) + myList.get(6);
		int s48 = myList.get(3) + myList.get(7);
		int s57 = myList.get(4) + myList.get(6);
		int s56 = myList.get(4) + myList.get(5);
		int s68 = myList.get(5) + myList.get(7);
		int s78 = myList.get(6) + myList.get(7);
		List<Integer> finalList = new ArrayList<Integer>();
		finalList.add(s12);
		finalList.add(s13);
		finalList.add(s15);
		finalList.add(s24);
		finalList.add(s26);
		finalList.add(s34);
		finalList.add(s37);
		finalList.add(s48);
		finalList.add(s57);
		finalList.add(s56);
		finalList.add(s68);
		finalList.add(s78);
		Collections.sort(finalList);
		int a = finalList.size();
		int output = finalList.get(a - 1);
		return output;
	}
	private static int handle2D(int[] arr){
		List<Integer> myList = new ArrayList<Integer>();
		int num = 4;
		for (int i = 0; i < num; i++) {
			int corner = arr[i];
			int temp = findPotency2(corner, arr);
			myList.add(temp);
		}
		int s12 = myList.get(1) + myList.get(0);
		int s13 = myList.get(2) + myList.get(0);
		int s24 = myList.get(1) + myList.get(3);
		int s34 = myList.get(2) + myList.get(3);
		List<Integer> finalList = new ArrayList<Integer>();
		finalList.add(s12);
		finalList.add(s13);
		finalList.add(s24);
		finalList.add(s34);
		Collections.sort(finalList);
		int a = finalList.size();
		int output = finalList.get(a - 1);
		return output;
	}
	private static int findPotency1(int corner, int[] cornerArr) {
		int potency = 0;
		if (corner == cornerArr[0]) {
			potency = cornerArr[1] + cornerArr[2] + cornerArr[4];
		} else if (corner == cornerArr[1]) {
			potency = cornerArr[0] + cornerArr[3] + cornerArr[5];
		} else if (corner == cornerArr[2]) {
			potency = cornerArr[0] + cornerArr[3] + cornerArr[6];
		} else if (corner == cornerArr[3]) {
			potency = cornerArr[1] + cornerArr[2] + cornerArr[7];
		} else if (corner == cornerArr[4]) {
			potency = cornerArr[0] + cornerArr[5] + cornerArr[6];
		} else if (corner == cornerArr[5]) {
			potency = cornerArr[1] + cornerArr[4] + cornerArr[7];
		} else if (corner == cornerArr[6]) {
			potency = cornerArr[2] + cornerArr[4] + cornerArr[7];
		} else {
			potency = cornerArr[3] + cornerArr[5] + cornerArr[6];
		}
		return potency;
	}
	private static int findPotency2(int corner, int[] cornerArr) {
		int potency = 0;
		if (corner == cornerArr[1]) {
			potency = cornerArr[0] + cornerArr[3];
		} else if (corner == cornerArr[2]) {
			potency = cornerArr[0] + cornerArr[3];
		}else{
			potency = cornerArr[1] + cornerArr[2];
		}
		return potency;
	}

	private static int adder(int a, int b) {
		int sum = a + b;
		return sum;
	}

	private static int getLineNumber(int dimension) {
		int outcome = 0;
		if (dimension == THREE_DIMENTION) {
			outcome = 8;
		} else {
			outcome = 4;
		}
		return outcome;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		boolean EOF = false;
		List<Integer> jakeList = new ArrayList<Integer>();
		int j = 0;
		while(!EOF){
			if (!sc.hasNextLine()){
				break;
			}
			String myNum =sc.nextLine();
			if(myNum.equals("")){
				EOF = true;
			}else{
				int weightOfCorner = Integer.parseInt(myNum);
				jakeList.add(weightOfCorner);
				j++;
			}
		}
		int num = 0;
		while(!jakeList.isEmpty()){
			if(jakeList.get(0)==3){
				jakeList.remove(0);
				int[] arr = {jakeList.get(0),jakeList.get(1),jakeList.get(2),jakeList.get(3),jakeList.get(4),jakeList.get(5),jakeList.get(6),jakeList.get(7)};
				jakeList.remove(0);
				jakeList.remove(0);
				jakeList.remove(0);
				jakeList.remove(0);
				jakeList.remove(0);
				jakeList.remove(0);
				jakeList.remove(0);
				jakeList.remove(0);
				num = handle3D(arr);
				System.out.println(num);
			}else{
				jakeList.remove(0);
				int[] arr = {jakeList.get(0),jakeList.get(1),jakeList.get(2),jakeList.get(3)};
				jakeList.remove(0);
				jakeList.remove(0);
				jakeList.remove(0);
				jakeList.remove(0);
				num = handle2D(arr);
				System.out.println(num);
			}
		}
		
	}
}

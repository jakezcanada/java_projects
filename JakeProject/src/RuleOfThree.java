import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RuleOfThree {
	public static List<String> substitutions1 = new ArrayList<String>();
	public static List<String> substitutions2 = new ArrayList<String>();
	public static int maxDepth;
	public static int depth = 0;
	//brute find all possible answers, add numbers to  
	public static String findMatch(String start, int passedNum) {
		String result = start;
		int num = passedNum;
		if(depth == maxDepth) {
			depth--;
			return result + num;
		}
		for(int i = 0; i<3; i++) {
			if(start.contains(substitutions1.get(i))) {
				//get index of substitutions1.get(i) and replace with substitutions2.get(i)
				return findMatch(start, num);
			}
		}
		depth = depth - 1;
		return result + num;
	}
	public static void main(String[] args) {
		//only 3 substitution rules
		Scanner sc = new Scanner(System.in);
		String a1 = sc.next();
		String a2 = sc.next();
		String b1 = sc.next();
		String b2 = sc.next();
		String c1 = sc.next();
		String c2 = sc.next();
		substitutions1.add(a1);
		substitutions1.add(b1);
		substitutions1.add(c1);
		substitutions2.add(a2);
		substitutions2.add(b2);
		substitutions2.add(c2);
		maxDepth = sc.nextInt();
		String startingStr = sc.next();
		String endingStr = sc.next();
	}
}

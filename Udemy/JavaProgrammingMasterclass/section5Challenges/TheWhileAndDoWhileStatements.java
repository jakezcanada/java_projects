package section5Challenges;

public class TheWhileAndDoWhileStatements {

	public static boolean isEvenNumber(int num) {
		if(num % 2 == 0) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int number = 4;
		int finishNumber = 20;
		int count = 0;
		while(number <= finishNumber) {
			number++;
			if(!isEvenNumber(number)) {
				continue;
			}else {
				count++;
			}
			
			System.out.println("Even number " + number);
			if(count==5) {
				break;
			}
		}
		System.out.println(count);
	}

}

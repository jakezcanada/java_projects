package section5Challenges;

public class Sum3And5Challenge {

	public static void main(String[] args) {
		int sum = 0;
		int count = 0;
		for(int i = 1; i<1001; i++) {
			if(i%15==0) {
				count++;
				sum += i;
				System.out.println(i);
				if(count==5) {
					break;
				}
			}
		}
		System.out.println(sum);
	}

}

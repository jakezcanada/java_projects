package J2;

import java.util.Scanner;

public class SilentAuction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int bid = -1;
		String name = "";
		for(int i = 0; i<n; i++) {
			String tName = sc.next();
			int tBid = sc.nextInt();
			if(tBid>bid) {
				name = tName;
				bid = tBid;
			}
		}
		System.out.println(name);
	}

}

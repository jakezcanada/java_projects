package J4;

import java.util.Scanner;

public class ArrangingBooks {
	public static int[] searchArrLMS(int[] L, String Lstring, Boolean M) {
		if(M) {
			L[0] = Lstring.replaceAll("[^L]", "").length();
			L[1] = Lstring.replaceAll("[^M]", "").length();
			L[2] = Lstring.length()-L[0]-L[1];
		}else {
			L[0] = Lstring.replaceAll("[^L]", "").length();
			L[1] = Lstring.length()-L[0];
		}
		return L;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.next();
		int Ls = in.replaceAll("[^L]", "").length();
		int Ss = in.replaceAll("[^S]", "").length();
		int Ms = in.length()-Ls-Ss;
		if(Ms==0) {
			String Lstring = in.substring(0,Ls);
			System.out.print(Lstring.replaceAll("L", "").length());
		}else if(in.length()>1000){
			String Lstring = in.substring(0,Ls);
			int moves = 0;
			int[] L = searchArrLMS(new int[3], Lstring, true);
			String Mstring = in.substring(Ls,Ls+Ms);
			int[] M = searchArrLMS(new int[3], Mstring, true);
			String Sstring = in.substring(Ls+Ms,Ls+Ms+Ss);
			int[] S = searchArrLMS(new int[3], Sstring, true);
//			int t1 = M[0] - Math.abs(M[0]-L[1]); 
//			int t2 = S[0] - Math.abs(S[0]-L[2]);
//			int t3 = M[2] - Math.abs(M[2]-S[1]);
			int t1 = M[0] - M[0] - L[1];
			int t2 = S[0] - S[0] - L[2];
			int t3 = M[2] - M[2] - S[1];
			moves += t1 + t2 + t3;
			System.out.print(Math.abs(moves));
		}else {
			String Lstring = in.substring(0,Ls);
			int moves = 0;
			int[] L = searchArrLMS(new int[3], Lstring, true);
			String Mstring = in.substring(Ls,Ls+Ms);
			int[] M = searchArrLMS(new int[3], Mstring, true);
			String Sstring = in.substring(Ls+Ms,Ls+Ms+Ss);
			int[] S = searchArrLMS(new int[3], Sstring, true);
			int t1 = L[1] > M[0] ? M[0] : L[1];
			int t2 = L[2] > S[0] ? S[0] : L[2];
			int t3 = S[1] > M[2] ? M[2] : S[1];
			L[1] -= t1;
			L[2] -= t2;
			int t4 = (L[1] + L[2])*2;
			moves += t1 + t2 + t3;
			System.out.print(Math.abs(moves)+t4);
		}
	}
}

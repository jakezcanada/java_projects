
public class test3 {
	public static long gcm(long a, long b) {
	    return b == 0 ? a : gcm(b, a % b); // Not bad for one line of code :)
	}
	public static long GCD(long a, long b){
		   if (b==0) return a;
		   return GCD(b,a%b);
	}
	public static String asFraction(long a, long b) {
	    long gcm = GCD(a, b);
	    return (a / gcm) + "/" + (b / gcm);
	}

	public static void main(String[] args) {
	    System.out.println(GCD(60000, 10000)); //  "1/2"
	    System.out.println(asFraction(17, 3));     //  "17/3"
	    System.out.println(asFraction(462, 1071)); //  "22/51"
	}
}

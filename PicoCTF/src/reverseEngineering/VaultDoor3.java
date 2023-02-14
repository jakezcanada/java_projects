package reverseEngineering;

public class VaultDoor3 {

	public static void main(String[] args) {
		String a = "jU5t_a_sna_3lpm16g84c_u_4_m0r846";
		String b[] = a.split("");
		String result[] = new String[32];
		int i;
        for (i = 0; i<8; i++) {
            result[i] = b[i];
        }
        for (i = 8; i<16; i++) {
            result[i] = b[23-i];
        }
        for (i = 16; i<32; i+=2) {
        	result[i] = b[46-i];
        }
        for (i = 31; i>=17; i-=2) {
        	result[i] = b[i];
        }
		for(i = 0; i<32;i++) {
			System.out.print(result[i]);
		}
	} 
}
// picoCTF{jU5t_a_s1mpl3_an4rm4uc86680___4g}
//	public static void main(String args[]) {
//        VaultDoor3 vaultDoor = new VaultDoor3();
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter vault password: ");
//        String userInput = scanner.next();
//	String input = userInput.substring("picoCTF{".length(),userInput.length()-1);
//	if (vaultDoor.checkPassword(input)) {
//	    System.out.println("Access granted.");
//	} else {
//	    System.out.println("Access denied!");
//        }
//    }
//
//    // Our security monitoring team has noticed some intrusions on some of the
//    // less secure doors. Dr. Evil has asked me specifically to build a stronger
//    // vault door to protect his Doomsday plans. I just *know* this door will
//    // keep all of those nosy agents out of our business. Mwa ha!
//    //
//    // -Minion #2671
//    public boolean checkPassword(String password) {
//        if (password.length() != 32) {
//        	System.out.println(password.length());
//            return false;
//        }
//        char[] buffer = new char[32];
//        int i;
//        for (i=0; i<8; i++) {
//            buffer[i] = password.charAt(i);
//        }
//        for (; i<16; i++) {
//            buffer[i] = password.charAt(23-i);
//        }
//        for (; i<32; i+=2) {
//            buffer[i] = password.charAt(46-i);
//            System.out.println(password.charAt(46-i));
//        }
//        for (i=31; i>=17; i-=2) {
//            buffer[i] = password.charAt(i);
//        }
//        String s = new String(buffer);
//        System.out.println(s);
//        return s.equals("jU5t_a_sna_3lpm16g84c_u_4_m0r846");
//    }
//
//}

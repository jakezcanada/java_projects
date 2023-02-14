
public class testIndexOf {

	public static void main(String[] args) {
		String tester = "BANANANANANANAS";
		System.out.println(tester.indexOf("ANA"));
		System.out.println(tester.substring(tester.indexOf("ANA"),tester.indexOf("ANA")+3));
	}

}

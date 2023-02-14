import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Seed1 {
	   public static String missingParts = "";
	   public static void checkForPart(String part, List<String> parts) {
		   if(!parts.contains(part)) {
			   missingParts = missingParts + part;
		   }
	   }
	   public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		   String archangel = sc.next();
		   List<String> parts = Arrays.asList(archangel.split(""));
		   checkForPart("B", parts);
		   checkForPart("F", parts);
		   checkForPart("T", parts);
		   checkForPart("L", parts);
		   checkForPart("C", parts);
		   if(missingParts.length() == 0) {
			   System.out.println("NO MISSING PARTS");
		   }else {
			   System.out.println(missingParts);
		   }
	   }
}

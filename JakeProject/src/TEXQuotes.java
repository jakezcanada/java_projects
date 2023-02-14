import java.util.Scanner;

public class TEXQuotes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner fileScanner = new Scanner(System.in);
		String result = "";
		boolean toggle = false;
		while (fileScanner.hasNextLine()) {
		  String line = fileScanner.nextLine();

		  Scanner lineScanner = new Scanner(line);
		  while (lineScanner.hasNext()) {
		    String token = lineScanner.next();
		    if(token.indexOf("\"")!=-1){
		    	for(int i = 0; i<token.length(); i++){
		    		char ch = token.charAt(i);
		    		if(ch=='"' && !toggle){
		    			result = result + "``" + token.substring(1);
		    			toggle = true;
		    		}
		    		if(ch=='"' && toggle){
		    			
		    			toggle = false;
		    		}
		    		result = result+ch;
		    	}
		    }
		  }
		  lineScanner.close();
		  // you're at the end of the line here. Do what you have to do.
		}
		fileScanner.close();
	}

}

package condenseTextFiles;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MergeText {
    public static void main(String[] args) throws IOException {
        StringBuilder output = new StringBuilder();
        try (Scanner sc1 = new Scanner((new File("G:\\My Drive\\JavaProject2\\CCC\\src\\condenseTextFiles\\result.txt")));
             Scanner sc2 = new Scanner((new File("G:\\My Drive\\JavaProject2\\CCC\\src\\condenseTextFiles\\nouns.txt")))) {

            while (sc1.hasNext() || sc2.hasNext()) {
                String s1 = (sc1.hasNext() ? sc1.next() : "");
                String s2 = (sc2.hasNext() ? sc2.next() : "");
                if(!s1.equals("")){
                    output.append(s1);
                    output.append("\n");
                }
                if(!s2.equals("")){
                    output.append(s2);
                    output.append("\n");
                }
            }
        }
        try (PrintWriter pw = new PrintWriter(new File("G:\\My Drive\\JavaProject2\\CCC\\src\\condenseTextFiles\\allWords.txt"))) {
            pw.write(output.toString());
        }
    }
}
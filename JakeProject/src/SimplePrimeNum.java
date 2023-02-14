import java.util.Scanner;

public class SimplePrimeNum {
	public static void main(String[] args)
	{    
	    int j = 2;
	    int result = 0;
	    int number = 0;
	    Scanner reader = new Scanner(System.in);
	    number = reader.nextInt();
	    while (j <= number / 2)
	    {
	        if (number % j == 0)
	        {
	           result = 1;
	        }
	        j++;
	    }
	    if (result == 1)
	    {
	        System.out.println("NO");
	    }
	    else
	    {
	        System.out.println("YES");
	    }
	}
}

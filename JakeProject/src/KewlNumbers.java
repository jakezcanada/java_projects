import java.io.*;
import java.util.*;
import java.lang.*;

public class KewlNumbers {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int low = sc.nextInt();
        int high = sc.nextInt();
        int num = high/4;
        for(int i = 0; i<=num; i++){
        	int a = i*i*i*i*i*i;
        	if(a>high){
        		break;
        	}
        	if(a>=low){
        		count++;
        	}
        	
        }
        System.out.println(count);
    }
}
package J2;
import java.util.Scanner;
public class PicturePerfect {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = -1;
		while(n!=0){
			n = sc.nextInt();
			if(n == 1) {
				System.out.println("Minimum perimeter is 4 with dimensions 1 x 1");
			}else if(n != 0){
				int height = 0;
				int width = 0;
				int perimeter = Integer.MAX_VALUE;
				for(int i = n/2; i>0; i--){
					for(int j = 1; j<n/i+1; j++) {
						if(i*j == n && i+i+j+j < perimeter) {
							height = i;
							width = j;
							perimeter = i+i+j+j;
						}
					}
				}
				System.out.println("Minimum perimeter is " + perimeter +  " with dimensions " + height + " x " + width);
			}
		}
	}

}

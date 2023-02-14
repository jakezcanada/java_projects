
public class TwoDimensionArrayExample {

	public static void main(String[] args) {
		int[][] num = new int[3][2];
		int[] b = new int[2];
		int c = 8;
		for(int row = 0; row<3; row++){
			for(int col = 0; col<2; col++){
				num[row][col] = -1;
			}
		}
		b[0]=1;
		b[1]=1;
		num[0] = b;
		for(int row = 0; row<3; row++){
			for(int col = 0; col<2; col++){
				System.out.print(num[row][col] + " ");
			}
			System.out.println("");
		}
	}

}

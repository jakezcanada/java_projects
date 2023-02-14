import java.util.*;

public class ArraySorting {
	static int[] mergeTwo(int[] list1, int[] list2){
		int n1 = list1.length;
		int n2 = list2.length;
		int[] list3 = new int[n1+n2];
		int x1 = 0;
		int x2 = 0;
		int x3 = 0;
		while(x1<n1 && x2<n2){
			if(list1[x1] <= list2[x2]){
				
			}else{
				list3[x3++] = list2[x2++];
			}
		}
		while(x1<n1){ list3[x3++] = list1[x1++]; }
		while(x2<n2){ list3[x3++] = list2[x2++]; }
		return list3;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s1 = sc.nextInt();
		int[] l1 = new int[s1-1];
		for(int i = 0; i<s1; i++){
			l1[i] = sc.nextInt();
		}
		int s2 = sc.nextInt();
		int[] l2 = new int[s2-1];
		for(int i = 0; i<s2; i++){
			l2[i] = sc.nextInt();
		}
		int[] list3 = mergeTwo( l1 , l2);
		System.out.println(list3);
	}

}

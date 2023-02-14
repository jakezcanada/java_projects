package J5;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;
public class PieDayAttempt1 {
	public static int count = 0;
	public static Set<String> myList = new HashSet<String>();
	public static BigInteger factorial(int number) { BigInteger factorial = BigInteger.ONE; for (int i = number; i > 0; i--) { factorial = factorial.multiply(BigInteger.valueOf(i)); } return factorial; }
	
	public static void findCombos2(int[] arr, int boundary, int total){
		int sum = 0;

		outer:for(int i1 = 0; i1<arr.length; i1++){
			
			for(int i2 = 1; i2<boundary; i2++){
				arr[i1] = i2;
				
				for(int i = 0; i<arr.length; i++){
					sum += arr[i];
				}
				if(sum == total){
					int[] goodArr = arr.clone();
					Arrays.sort(goodArr);
					String result = Arrays.toString(goodArr);
					myList.add(result);
					count++;
				}
				
				if(sum>total){
					arr[i1] =1;
					continue outer;
				}
			}
			
			
		}
	}
	public static int findCombos(int[] arr, int boundary, int total){
			int sum = 0;
			if(arr[arr.length-1] == boundary){
				return count;
			}
			for(int j = 0; j<arr.length; j++){
				if(arr[j] > boundary && j!=arr.length-1){
					arr[j+1] += 1;
					arr[j] = 1;
				}
				sum += arr[j];
/*				if(sum<total){
					arr[j]++;
					//j--;
				}
				 if(sum>total){
					 arr[j] =1;
						break;
				}*/
					if(sum == total){
						//List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
						//Collections.sort(list);
						//String str = Arrays.toString(list.toArray());
						//myList.add(arr);
						int[] goodArr = arr.clone();
						Arrays.sort(goodArr);
						String result = Arrays.toString(goodArr);
						myList.add(result);
						count++;
					}
			}
/*			if(sum == total){
				//List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
				//Collections.sort(list);
				//String str = Arrays.toString(list.toArray());
				//myList.add(arr);
				int[] goodArr = arr.clone();
				Arrays.sort(goodArr);
				String result = Arrays.toString(goodArr);
				myList.add(result);
				count++;
			}*/
			//System.out.println(Arrays.toString(arr));

			arr[0]++;
		return findCombos(arr, boundary, total);
	}
	/*public static int[] calculate(int[] arr, int boundary, int total,int people){
		
		for(int i = 0; i<arr.length-1; i++){
			int sum = 0;
			arr[i] = arr[i]-1;
			System.out.println(Arrays.toString(arr));
			for(int j = 0; j<arr.length; j++){
				sum = sum + arr[j];
			}
			if(sum == total){
				//myList.add(arr.clone());
				
				if(arr.length<people)
				{
					int[] temp = new int[people];
					for(int j = 0; j<arr.length; j++){
						temp[j] = arr[j];
					}
					Arrays.fill(temp, arr.length,people, 1);
					myList.add(temp);
				}else{
					myList.add(arr.clone());
				}
				
				
				
			}
			arr[i+1] = arr[i+1]+1;
			System.out.println(Arrays.toString(arr));
			sum = 0;
			for(int j = 0; j<arr.length; j++){
				sum = sum + arr[j];
			}
			if(sum == total){
				if(arr.length<people)
				{
					int[] temp = new int[people];
					for(int j = 0; j<arr.length; j++){
						temp[j] = arr[j];
					}
					Arrays.fill(temp, arr.length,people, 1);
					myList.add(temp);
				}else{
					myList.add(arr.clone());
				}
				
			}
			if(arr[0] <= boundary){
				return arr;
			}
		}
		return calculate(arr,boundary,total,people);
	}*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int slices = sc.nextInt();
		int people = sc.nextInt();
		int counter = 0;
		int boundary = slices - (people-1);
		int[] arr = new int[people];
		Arrays.fill(arr, 1);
		boolean toggle = true;

		if(slices == people){
			System.out.println("1");
		}else if(people == 1){
			System.out.println("1");
		}else{
			/*for(int i = 2; i <= people; i++){
				int[] finderArr = new int[i];
				int boundary = (int) (slices-(people-i)-1)/i;
				//if(i==2){
					Arrays.fill(finderArr, 1);
					finderArr[0] = slices-(people-i)-1;
				}else{
					Arrays.fill(finderArr, 2);
					finderArr[0] = slices-(people-i)-2;
				}
				if(boundary*i!=(slices-(people-i)-1)){boundary++;}
				finderArr[0] = slices-(people-i)-1;
				int total = slices-(people-i);
				if(i==2){
					int[] temp = new int[people];
					temp[0]=finderArr[0];
					temp[1]=finderArr[1];
					if(people>2){Arrays.fill(temp, 2,people, 1);}
					myList.add(temp.clone());
				}
				calculate(finderArr, boundary,total,people);
			}
			for(int[] list:myList){
				System.out.println("");
				System.out.println(Arrays.toString(list));
			}
			System.out.println(myList.size());//+"###"+ Arrays.toString(myList.toArray()));
			BigInteger k = factorial(people-1);
			BigInteger n = factorial(slices-1);
			BigInteger k2 = factorial(slices-people);
					BigInteger result = n.divide((k.multiply(k2)));
			System.out.println(result.intValue());*/
			findCombos(arr,boundary,slices);
			for(String list:myList){
				System.out.println("");
				System.out.println(list);
			}
		}
	}
}

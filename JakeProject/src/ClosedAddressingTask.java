import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Random;

public class ClosedAddressingTask {

	public static void main(String[] args) {
		Random random = new Random();
		int[] arr = random.ints(10,0,10).toArray();
		
		long startTime = System.nanoTime();
		List<List<Integer>> s = new ArrayList<>();
		while(s.size() < 10) s.add(new ArrayList<>());
		for(int i = 0; i<arr.length; i++) {
			int n = arr[i];
			s.get(n).add(n);
		}
		long endTime   = System.nanoTime();
		double totalSeconds = endTime - startTime;
		System.out.println(totalSeconds+"/1,000,000,000");
	}

}


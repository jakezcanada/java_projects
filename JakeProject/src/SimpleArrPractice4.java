import java.util.*;

public class SimpleArrPractice4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		List<Double> myList = new ArrayList<Double>();
		List<Double> positive = new ArrayList<Double>();
		List<Double> negative = new ArrayList<Double>();
		double pCounter = 0;
		double nCounter = 0;
		for(int i = 0; i<a; i++){
			double input = sc.nextDouble();
			myList.add(input);
		}
		for(int i = 0; i<a; i++){
			double num = myList.get(i);
			if(num>0){
				pCounter++;
				positive.add(num);
			}else{
				nCounter++;
				negative.add(num);
			}
		}
		if(pCounter == nCounter){
			String str = myList.toString().replace("[", "").replace("]", "").replace(",", "").replace(".0", "").trim();
			System.out.println(str);
		}else if(pCounter > nCounter){
			String str = positive.toString().replace("[", "").replace("]", "").replace(",", "").replace(".0", "").trim();
			System.out.println(str);
		}else{
			String str = negative.toString().replace("[", "").replace("]", "").replace(",", "").replace(".0", "").trim();
			System.out.println(str);
		}
	}

}

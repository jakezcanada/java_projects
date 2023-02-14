import java.util.*;

public class ArrPractice4 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		List<Double> positive = new ArrayList<Double>();
		List<Double> negative = new ArrayList<Double>();
		int looper = sc.nextInt();
		for(int i = 0; i<looper; i++){
			double num = sc.nextInt();
			if(num >= 0 ){
				positive.add(num);
			}else{
				negative.add(num);
			}
		}
		if(positive.size() > negative.size()){
			String str = positive.toString().replace(",","").replace("[","").replace("]","").trim();
			System.out.println(str);
		}else{
			String str = negative.toString().replace(",","").replace("[","").replace("]","").trim();
			System.out.println(str);
		}
	}
}

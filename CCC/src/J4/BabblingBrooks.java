package J4;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BabblingBrooks {
	public static void split (List<Double> streams,int splitter) {
		Scanner sc = new Scanner(System.in);
		Double splitAmount = sc.nextDouble()/100;
		Double stream = streams.get(splitter-1);
		Double leftFork = stream*splitAmount;
		Double rightFork = stream*(1-splitAmount);
		streams.remove(splitter-1);//remove initial value
		streams.add(splitter-1,leftFork);//add left fork
		streams.add(splitter,rightFork);//add right fork

	}
	public static void join (List<Double> streams,int joiner) {
		Double stream = streams.get(joiner-1);
		Double newStream = stream + streams.get(joiner);
		streams.remove(joiner);
		streams.remove(joiner-1);
		streams.add(joiner-1,newStream);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOfStreams = sc.nextInt();
		List<Double> streams = new ArrayList<Double>();
		for(int i = 0; i<numOfStreams; i++) {
			Double flow = sc.nextDouble();
			streams.add(flow);
		}
		int input = 0;
		while(input!=77) {
			input = sc.nextInt();
			if(input == 77) {
				break;
			}else if(input == 99) {
				int num = sc.nextInt();
				split(streams,num);
			}else if(input == 88) {
				int num = sc.nextInt();
				join(streams,num);
			}
		}
		for(int i = 0; i<=streams.size()-1; i++) {//print out list
			String stream = streams.get(i) + "";
			stream = stream.substring(0,stream.indexOf("."));
			if(i==streams.size()-1) {
				System.out.print(stream);
			}else {
				System.out.print(stream + " ");
			}
		}
	}

}

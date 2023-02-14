package S3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TheGenevaConfection {
	//try alternating the input into 2 lists and check element previous to it
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i = 0; i<t; i++){
			int n = Integer.parseInt(br.readLine());
			List<Integer> mountainTop = new ArrayList<Integer>();
			List<Integer> branch = new ArrayList<Integer>();
			String answ = "Y";
			boolean possible = true;
			for(int j = 0; j<n; j++){
				mountainTop.add(Integer.parseInt(br.readLine()));
			}
			for(int nextNumber = 1; nextNumber<=n; nextNumber++){
				if(mountainTop.size()<2){
					break;
				}
				if(mountainTop.contains(nextNumber)){
					int s = mountainTop.size();
					for(int j = 0; j<s; j++){
						if(mountainTop.get(mountainTop.size()-1) == nextNumber){
							mountainTop.remove(mountainTop.size()-1);
							break;
						}else{
							branch.add(mountainTop.remove(mountainTop.size()-1));
							if(branch.size() > 1 && (branch.get(branch.size()-2) < branch.get(branch.size()-1) || branch.get(branch.size()-1) < mountainTop.get(mountainTop.size()-1))){
								answ = "N";
								break;
							}
						}
					}
					if(answ.equals("N")){
						break;
					}
				}else if(branch.size() != 0 && branch.get(branch.size()-1) == nextNumber){
					branch.remove(branch.size()-1);
				}else{
					answ = "N";
					break;
				}
			}
			System.out.println(answ);
		}
	}
}
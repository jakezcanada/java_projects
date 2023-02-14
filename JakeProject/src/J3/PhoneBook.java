package J3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Map<String,String> phonebook = new HashMap<String,String>();
		Map<String,Integer> calls = new HashMap<String,Integer>();
		for (int i = 0; i < n; i++) {
			String[] in = br.readLine().split(" ");
			phonebook.put(in[1], in[0]);
			calls.put(in[0], 0);
		}
		int fav = 0;
		String favKey = "";
		int d = Integer.parseInt(br.readLine());
		for (int i = 0; i < d; i++) {
			String key = br.readLine();
			calls.put(phonebook.get(key), calls.get(phonebook.get(key))+1);
			if(calls.get(phonebook.get(key)) == fav){
				if(Integer.parseInt(favKey) > Integer.parseInt(key)){
					fav = calls.get(phonebook.get(key));
					favKey = key;
				}
			}else if(calls.get(phonebook.get(key)) > fav){
				fav = calls.get(phonebook.get(key));
				favKey = key;
			}
		}
		System.out.println(phonebook.get(favKey));
	}
}

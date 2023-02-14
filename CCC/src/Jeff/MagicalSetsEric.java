package Jeff;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://pastebin.com/fXGTmpuQ
public class MagicalSetsEric {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int Q = Integer.parseInt(st.nextToken());
		long[] mask = new long[N];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int S = Integer.parseInt(st.nextToken());
			for (int j = 0; j < S; j++) {
				int x = Integer.parseInt(st.nextToken());
				mask[i] |= ((long)1<<(x+30));
			}
		}
		for (int i = 0; i < Q; i++) {
			st = new StringTokenizer(br.readLine());
			int M = Integer.parseInt(st.nextToken());
			long cur = 0;
			for (int j = 0; j < M; j++) {
				int x = Integer.parseInt(st.nextToken()) - 1;
				cur ^= mask[x];
			}
			int count = 0;
			String ans = "";
			for (int j = -30; j <= 30; j++) {
				if ((cur & ((long)1 << (j+30))) != 0) {
					ans += j + " ";
					count++;
				}
			}
			System.out.println(count + " " + ans);
		}
	}
}

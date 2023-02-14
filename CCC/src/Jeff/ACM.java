package Jeff;

//https://dmoj.ca/problem/coci14c7p3

//For the final question, there are a total of 6 orderings for them to split the tasks
//for each ordering, we can use dp
//represent each person by their indexes in the input: 0,1,2
//let the current ordering be a,b,c where 0<=a,b,c<=2 and a,b,c are distinct
//a will be first, b will be second, and c will be third
//let dp[last][i] be the minimum score if the previous task was done by person last and i tasks need to be done in total
//the answer is dp[a][1] + input[a][0]
//the base bases is that if i == n, if last == c, return 0 otherwise return INF
//the transition is that dp[last][i] = dp[last][i+1] and if last != c, we can switch people: dp[next][i+1] + input[next][i]
//https://pastebin.com/bXBHF4Vn

public class ACM {
	public static void main(String[] args) {

	}
}

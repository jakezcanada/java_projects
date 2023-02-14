package Jeff;

//For the second question, observe that for your friend to minimize your score, they are also trying to maximize their score
//In other words, you are both trying to maximize the difference between the two scores
//we can perform interval dp for this question
//let dp[l][r] = the maximum difference in score the current player can get if the stones left are stones from index l to r
//the base case is if l == r, dp[l][r] = a[l]
//otherwise, you can either choose the first stone or the second stone: dp[l][r] = max(a[l] - dp[l+1][r], a[r] - dp[l][r-1])
//we subtract dp when we are transitioning because the next turn is the other persons turn
//https://pastebin.com/FX90kQ2v
//https://dmoj.ca/problem/dp1p2

public class AGame {
	public static void main(String[] args) {

	}
}

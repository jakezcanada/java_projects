package Jeff;

//The final question is tree dp
//We keep track of 2 dp arrays
//dp_black[i] = the number of ways vertices can be painted for the subtree at node i where the i is painted black
//dp_white[i] is the same thing for coloring the current node in white
//for this dp, you dont care about the ancestors
//the base case is that if i is a leaf node, dp_black[i] = 1 and dp_white[i] = 1
//if you paint a vertex black, the next one must be white, so dp_black[i] = sum(dp_white[j]) for all children j of i
//if you paint a vertex white, you can paint the children any color, so dp_white[i] = sum(dp_black[j] + dp_white[j]) for all children j of i
//https://pastebin.com/kSvW7cFE
//https://dmoj.ca/problem/dpp

public class IndependentSet {
	public static void main(String[] args) {

	}
}

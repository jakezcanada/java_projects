import java.util.*;

public class AssigningPartners {
	private static int getPOSByVal(List myList, String val) {
		int pos = -1;
		for (int i = 0; i < myList.size(); i++) {
			if (myList.get(i).equals(val)) {
				pos = i;
				break;
			}
		}
		return pos;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOfNames = sc.nextInt();
		boolean toggle = false;
		boolean toggle2 = false;
		List<String> myList1 = new ArrayList<String>();
		List<String> myList2 = new ArrayList<String>();
		for (int i = 0; i < numOfNames; i++) {
			String a = sc.next();
			myList1.add(a);
		}
		for (int i = 0; i < numOfNames; i++) {
			String a = sc.next();
			myList2.add(a);
		}
		if (numOfNames % 2 != 0) {
			System.out.println("bad");
		} else {
			for (int i = 0; i < myList1.size(); i++) {
				String checker = myList1.get(i);
				String checker2 = myList2.get(i);
				if (checker == checker2) {
					toggle2 = true;
				}
			}
			if (toggle2 == true) {
				System.out.println("bad");
			} else {
				while (!myList1.isEmpty() && !myList2.isEmpty()) {
					String firstPos1 = myList1.get(0);
					String firstPos2 = myList2.get(0);
					int search1 = getPOSByVal(myList1, firstPos2);
					int search2 = getPOSByVal(myList2, firstPos1);
					if (search1 == search2) {
						myList1.remove(search1);
						myList2.remove(search2);
						myList1.remove(firstPos1);
						myList2.remove(firstPos2);
					} else if (toggle == false) {
						toggle = true;
						break;
					}
				}
				if (toggle == true) {
					System.out.println("bad");
				} else {
					System.out.println("good");
				}
			}
		}
	}
}
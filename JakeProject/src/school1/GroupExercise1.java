package school1;

public class GroupExercise1 {

	public static void main(String[] args) {
		for(int i = 10; i<100; i++) {
			for(int j = i; j<100; j++) {
				// check for duplicate loop
				for(int k = 1; k<10; k++) {
					if((i+"").contains((k+"")) && (j+"").contains((k+"")) ) {
						int i2 = Integer.parseInt(((i+"").replaceFirst((k+""), "")));
						int j2 = Integer.parseInt(((j+"").replaceFirst((k+""), "")));
						if(j != 0 && j2 != 0) {
							double fraction1 = ((double) i)/((double) j);
							double fraction2 = ((double) i2)/((double) j2);
							// check
							if(fraction1 == fraction2 && fraction1 != 1) {
								// print
								System.out.println("Pair found:");
								System.out.println(i + "/" + j);
								System.out.println(i2 + "/" + j2);
								break;
							}
						}
					}
				}
				
			}
		}
	}

}

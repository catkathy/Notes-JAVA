public class Diamond {
	public static void main(String[] args) {

    /*
	  *
	 ***
	*****
	 ***
	  *
	 */
		int totalLevel1 = 10;


		for(int i = 1; i <= totalLevel1; i++) {
			for(int k = 1; k <= totalLevel1 - i; k++ ) {
				System.out.print(" ");
			}
			for(int j = 1; j <= 2*i - 1; j++) {
				if(j == 1 || j == 2*i - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}

			System.out.println("");
		}

		int totalLevel2 = 9;

		for(int a = 1; a <= totalLevel2; a++) {
			for(int b = 1; b <= a; b++) {
				System.out.print(" ");
			}
			for(int c = 1; c <= 2*totalLevel2 - 2*a+1; c++) {
				if (c == 1 || c == 2*totalLevel2 - 2*a+1) {

					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}
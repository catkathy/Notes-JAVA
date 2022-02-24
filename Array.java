import java.util.Scanner;
public class Array {
	public static void main(String[] args) {
		// create a double array

		double[] scores = new double[5];
		// Another way
		/*
		double scores[];
		scores = new double[5];

		*/

		//loop input
		Scanner myScanner = new Scanner(System.in);

		for (int i = 0; i < scores.length; i++){
			System.out.println("Please enter " + (i+1) + " value.");
			scores[i] = myScanner.nextDouble();
		}

		//output
		System.out.println("==Current elements:==");
		for (int i = 0; i < scores.length; i++){
			System.out.println("No. " + (i+1) + " value is " + scores[i]);	

		}

	}
}
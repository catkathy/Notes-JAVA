public class IFExercise01 {

	public static void main(String[] args) {
		// int num1 = 10;
		// int num2 = 1;
		// int sum = num1 + num2;
		// if(sum % 3 == 0 && sum % 5 == 0) {
		// 	System.out.println("Can be divided");
		// }
		// else {
		// 	System.out.println("Can't be divided by 3 and 5");
		// }

		//判断一个年份是不是闰年：能被4整除，但不能被100整除 或者 能被400整除

		int year = 2020;
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("It's a leap year");
		} else {
			System.out.println("It's not a leap year");
		}


	}
}
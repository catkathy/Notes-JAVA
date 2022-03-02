import java.util.Scanner;

public class MulForExercise {
	public static void main(String[] args) {

		//1. 计算一个班级，5个学生的成绩
		//2. 创建多个班级
		//3. 定义一个累积总分
		//4. 统计pass的人数，定义int passNum = 0；

		Scanner myScanner = new Scanner(System.in);
		double totalScore = 0;
		int passNum = 0;
		int classNum = 3; //Number of classes
		int stuNum = 5; //Student number

		for (int i = 1; i <= classNum; i++){ // i = class

			double sum = 0; //scores of one class
			for( int j = 1; j <= stuNum; j++) { // j = student
				System.out.println("Please enter the "+ j +" student's of " + i + " class's score.");
				double score = myScanner.nextDouble();
				// when > 60, passNum ++
				if (score > 60) {
					passNum ++;
				}
				sum += score;
				System.out.println("student's score is " + score);
			}
			//sum is the total score of 5 students.
			System.out.println("sum= " + sum + ", Avg= " + (sum / stuNum));
			// culmulate sum to totalScore
			totalScore += sum;
		}
		System.out.println("The total score of 3 class is " + totalScore + " and average is " + totalScore / (classNum*stuNum));
		System.out.println("Pass number = " + passNum);
		
	}


}
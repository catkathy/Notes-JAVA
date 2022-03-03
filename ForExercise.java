public class ForExercise {
	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		int start = 10;
		int end = 200;
		int t = 5; //代表倍数
		for (int i = start; i<= end; i++){
			if(i % t == 0){
				System.out.println("i=" + i);
				count++;
				sum += i;
			}
		}
		System.out.println("count=" + count);
		System.out.println("sum=" + sum);

		//为了适应更好的需求，把范围的起始值做成变量

	}
}
public class Stars {
	public static void main(String[] args) {


		/*
		1. 打印一个矩形
		*****
		*****
		*****
		*****
		*****
		2. 打印半个金字塔
		*
		**
		***
		****
		*****
		3.打印整个金字塔
		*         //1 4个空格 总层数-1
	   ***        //3 3个空格 总层数-2
	  *****       //5 2个空格
	 *******      //7 1个空格
	*********     //9 0个空格
	    4.打印空心金字塔
	    *         //1 当前行的第一个位置和最后一个位置是*
	   * *        //2 当前行的第一个位置和最后一个位置是*
	  *   *       //2 当前行的第一个位置和最后一个位置是*
	 *     *      //2 当前行的第一个位置和最后一个位置是*
	*********     //9 全部输出*
	    5. 把层数变成一个变量 int totalLevel = 5;



		*/
	
		int totalLevel = 30;

		for(int i = 1; i <= totalLevel; i++) { //i表示层数
			//输出*之前还要输出空格,对应空格=总层数-当前层
			for(int k = 1; k <= totalLevel-i; k++){
				System.out.print(" ");
			}
			//控制打印每层*的个数
			for(int j = 1; j <= 2*i-1; j++){
				//当前行的第一个位置和最后一个位置是*，最后一层全部*
				if(j == 1 || j == 2 * i - 1 || i == totalLevel) {
					System.out.print("*");
				} else { //其他情况输出空格
					System.out.print(" ");
				}
			}
			//打完一层*就要换行
			System.out.println("");

		}
		

		// int totalLevel = 30;

		// for(int i = 1; i <= totalLevel; i++) {
		// 	for(int k = 1; k <= totalLevel - i; k++){
		// 		System.out.print(" ");
		// 	}
		// 	for(int j = 1; j <= 2*i - 1; j++) {
		// 		System.out.print("*");
		// 	}
		// 	System.out.println("")


	}
}
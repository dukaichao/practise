package sb;

import java.util.Scanner;
/*
 * 自定义异常类的步骤：  自定义一个类继承Exception即可
 */
class ScoreException extends Exception{
	public ScoreException(String message) {
		super(message);
	}
}
public class Demo3_1 {
	public static void main(String [] args){
		System.out.println("请输入分数：");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		try{
			print(a);
		}catch(ScoreException e) {
			e.printStackTrace();
			
			System.out.println("请正确输入分数");
		}
		
	}
	public static void print(int a) throws ScoreException{
		
			if(a<0||a>100) {
				throw new ScoreException("分数错了");
			}
		
		System.out.println(a);
	}
}

package sb;

import java.util.Arrays;
import java.util.Scanner;

class ScoreException1 extends Exception{

	public ScoreException1(String message) {
		super(message);
	}
}
public class Demo3_3 {
	public static void main(String [] args){
		System.out.println("请输入学生数量：");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		//声明成绩数组
		int [] arr = new int[n];
		//输入学生成绩
		try{
			System.out.println("输入"+n+"个学生成绩");
			Cin(arr);
			Score(arr);
			
		}catch(ScoreException1 e) {
			e.printStackTrace();
			repair(arr);
		}
		avgScore(arr,n);
	}
	//输入成绩
	public static void Cin(int [] arr) {
		for(int i = 0;i < arr.length;i++) {
			Scanner scanner = new Scanner(System.in);
			arr[i] = scanner.nextInt();
		}
	}
	
	//判断成绩错误并修改
	public static void repair(int [] arr) {
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] < 0) {
				System.out.println("录入第"+(i+1)+"个学生分数小于0，请重新输入....");
				Scanner scanner1 = new Scanner(System.in);
				int b = scanner1.nextInt();
				arr[i] = b;
				
			}
		}
	}
	
	//错误判断
	public static void Score(int [] arr) throws ScoreException1{
		
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] < 0) {
				throw new ScoreException1("录入的学生分数存在小于0，请重新输入....");
				}
			}
		System.out.println("输入的成绩都很好");
	}
	
	//计算平均值
	public static void avgScore(int[] arr,int n) {
		int count = 0;
		for(int i = 0;i < arr.length;i++) {
			count += arr[i];
		}
		double avgscore = (double)count/n;
		System.out.println("平均分为"+avgscore);			
	}
}

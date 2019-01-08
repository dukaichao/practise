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
		System.out.println("������ѧ��������");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		//�����ɼ�����
		int [] arr = new int[n];
		//����ѧ���ɼ�
		try{
			System.out.println("����"+n+"��ѧ���ɼ�");
			Cin(arr);
			Score(arr);
			
		}catch(ScoreException1 e) {
			e.printStackTrace();
			repair(arr);
		}
		avgScore(arr,n);
	}
	//����ɼ�
	public static void Cin(int [] arr) {
		for(int i = 0;i < arr.length;i++) {
			Scanner scanner = new Scanner(System.in);
			arr[i] = scanner.nextInt();
		}
	}
	
	//�жϳɼ������޸�
	public static void repair(int [] arr) {
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] < 0) {
				System.out.println("¼���"+(i+1)+"��ѧ������С��0������������....");
				Scanner scanner1 = new Scanner(System.in);
				int b = scanner1.nextInt();
				arr[i] = b;
				
			}
		}
	}
	
	//�����ж�
	public static void Score(int [] arr) throws ScoreException1{
		
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] < 0) {
				throw new ScoreException1("¼���ѧ����������С��0������������....");
				}
			}
		System.out.println("����ĳɼ����ܺ�");
	}
	
	//����ƽ��ֵ
	public static void avgScore(int[] arr,int n) {
		int count = 0;
		for(int i = 0;i < arr.length;i++) {
			count += arr[i];
		}
		double avgscore = (double)count/n;
		System.out.println("ƽ����Ϊ"+avgscore);			
	}
}

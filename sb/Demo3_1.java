package sb;

import java.util.Scanner;
/*
 * �Զ����쳣��Ĳ��裺  �Զ���һ����̳�Exception����
 */
class ScoreException extends Exception{
	public ScoreException(String message) {
		super(message);
	}
}
public class Demo3_1 {
	public static void main(String [] args){
		System.out.println("�����������");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		try{
			print(a);
		}catch(ScoreException e) {
			e.printStackTrace();
			
			System.out.println("����ȷ�������");
		}
		
	}
	public static void print(int a) throws ScoreException{
		
			if(a<0||a>100) {
				throw new ScoreException("��������");
			}
		
		System.out.println(a);
	}
}

package sb;

import java.util.Scanner;

class isTriangleException extends Exception{
	public isTriangleException(String message) {
		super(message);
	}
}
public class Demo3_2 {
	public static void main(String[] args) {
		System.out.println("������������......");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		try {
			isTriangle(a,b,c);
		}catch(isTriangleException e) {
			System.out.println("�������������ߣ�");
			e.printStackTrace();
		}finally {
			System.out.println("�Ҿ���һ������.....");
		}
	}
	
	public static void isTriangle(int a,int b,int c) throws isTriangleException {
		if(a + b <= c||a + c <= b||b+c <= a) {
				throw new isTriangleException("���ܹ���������......");
		}
		System.out.println("���Թ��������Σ�");
	}
}

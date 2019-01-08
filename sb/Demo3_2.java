package sb;

import java.util.Scanner;

class isTriangleException extends Exception{
	public isTriangleException(String message) {
		super(message);
	}
}
public class Demo3_2 {
	public static void main(String[] args) {
		System.out.println("请输入三条边......");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		try {
			isTriangle(a,b,c);
		}catch(isTriangleException e) {
			System.out.println("重新输入三条边！");
			e.printStackTrace();
		}finally {
			System.out.println("我就是一个垃圾.....");
		}
	}
	
	public static void isTriangle(int a,int b,int c) throws isTriangleException {
		if(a + b <= c||a + c <= b||b+c <= a) {
				throw new isTriangleException("不能构成三角形......");
		}
		System.out.println("可以构成三角形！");
	}
}

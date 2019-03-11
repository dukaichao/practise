package mypratice;
/*
 	值传递:调用一个方法的时候，传递给方法的参数实际上传递变量的值。
 	值交换：交换的是两个值的地址
 	需求1：定义一个函数交换两个基本类型的值。
 	
 	
 	
 	
 */
public class Demo17 {
	public static void main(String[] args) {
		
		int a = 5;
		int b = 6;
		change(a,b);
		System.out.println("a = " +a+",b = " +b);
	}
	public static void change(int a,int b) {
		int temp = a;
		a = b;
		b = temp;
		/*System.out.println("a = " +a);
		System.out.println("b = " +b);*/
	}
}

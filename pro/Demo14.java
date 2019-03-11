package mypratice;
/*
 * final:
 * 
 * 
 * final关键字用法：
 * 	1.final关键字修饰一个基本类型的变量时，该变量不能重新赋值，初始值为最终值
 * 	2.final关键字修饰一个引用类型变量时，该变量不能重新指向新的变量
 * 	3.final关键字修饰一个函数时，不能被重写
 * 	4.final关键字修饰一个类时该类不能被继承
 */

class Circle{
	double r;
	public static final double pi = 3.14;
	public Circle(double r) {
		this.r = r;
	}
	public void getArea() {
		System.out.println("圆面积为："+r*r*pi);
		
	}
}
public class Demo14 {
	public static void main(String[] args) {
		final Circle c = new Circle(3.0);
		test(c);
		c.getArea();
		
		
	}
	public static void test(Circle c) {
		c = new Circle(5.0);
		c.getArea();
	}
}
/*验证方法3
class Circle{
	double r;
	final double pi = 3.14;
	public Circle(double r) {
		this.r = r;
	}
	public final void getArea() {
		System.out.println("圆面积为："+r*r*pi);
		
	}
}
 class Demo14 extends Circle{
	public Demo14(double r) {
		super(r);
		
	}
	public static void main(String[] args) {
		;
		Demo14 d = new Demo14(3.0);
		d.getArea();
		
		
	}
	
	 final修饰，该方法不能被重写
	 public void getArea() {
		System.out.println("我是圆");
	}
	public static void test(Circle c) {
		c = new Circle(5.0);
		c.getArea();
	}
}
*/
/*
final class Circle{
	double r;
	final double pi = 3.14;
	public Circle(double r) {
		this.r = r;
	}
	public  void getArea() {
		System.out.println("圆面积为："+r*r*pi);
		
	}
}
验证方法四;
 class Demo14 extends Circle{
	public Demo14(double r) {
		super(r);
		
	}
	public static void main(String[] args) {
		;
		Demo14 d = new Demo14(3.0);
		d.getArea();
		
		
	}
	
	// final修饰，该方法不能被重写
	 public void getArea() {
		System.out.println("我是圆");
	}
	public static void test(Circle c) {
		c = new Circle(5.0);
		c.getArea();
	}
}*/

package mypratice;
/*
 * final:
 * 
 * 
 * final�ؼ����÷���
 * 	1.final�ؼ�������һ���������͵ı���ʱ���ñ����������¸�ֵ����ʼֵΪ����ֵ
 * 	2.final�ؼ�������һ���������ͱ���ʱ���ñ�����������ָ���µı���
 * 	3.final�ؼ�������һ������ʱ�����ܱ���д
 * 	4.final�ؼ�������һ����ʱ���಻�ܱ��̳�
 */

class Circle{
	double r;
	public static final double pi = 3.14;
	public Circle(double r) {
		this.r = r;
	}
	public void getArea() {
		System.out.println("Բ���Ϊ��"+r*r*pi);
		
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
/*��֤����3
class Circle{
	double r;
	final double pi = 3.14;
	public Circle(double r) {
		this.r = r;
	}
	public final void getArea() {
		System.out.println("Բ���Ϊ��"+r*r*pi);
		
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
	
	 final���Σ��÷������ܱ���д
	 public void getArea() {
		System.out.println("����Բ");
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
		System.out.println("Բ���Ϊ��"+r*r*pi);
		
	}
}
��֤������;
 class Demo14 extends Circle{
	public Demo14(double r) {
		super(r);
		
	}
	public static void main(String[] args) {
		;
		Demo14 d = new Demo14(3.0);
		d.getArea();
		
		
	}
	
	// final���Σ��÷������ܱ���д
	 public void getArea() {
		System.out.println("����Բ");
	}
	public static void test(Circle c) {
		c = new Circle(5.0);
		c.getArea();
	}
}*/

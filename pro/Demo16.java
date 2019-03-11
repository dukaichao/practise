package mypratice;
/*
 * ��������һ��ͼ�Σ�Բ�Σ����������࣬��������ͼ�ζ���߱�����������ܳ�
 * 		�ķ�ʽ��ֻ����ÿ��ͼ�μ���ķ�ʽ��һ��
 * 
 * 
 * 
 * abstract���������¹ؼ��ֹ�ͬ����һ��������
 * 	1.private
 * 	2.static
 * 	3.final
 */
abstract class graph{
	String name;
	public graph(String name) {
		this.name = name;
		
	}
	abstract public void getArea();
	abstract public void getGirth();
}
class Circle_2 extends graph{
	double r;
	final double PI = 3.14;
	public Circle_2(String name,double r) {
		super(name);
		this.r = r;
	}
	public void getArea() {
		System.out.println(name+"�����Ϊ��"+r*r*PI);
	}
	public void getGirth() {
		System.out.println(name+"���ܳ�Ϊ��"+2*r*PI);
	}
}
class Rectangle extends graph{
	double length;
	double width;
	public Rectangle(String name,double length,double width) {
		super(name);
		this.length = length;
		this.width = width;
	}
	public void getArea() {
		System.out.println(name+"�����Ϊ��"+length*width);
	}
	public void getGirth() {
		System.out.println(name+"���ܳ�Ϊ��"+2*(width+length));
	}
}
public class Demo16 {
	public static void main(String[] args) {
		Circle_2 c = new Circle_2("Բ",3.0);
		c.getArea();
		c.getGirth();
		Rectangle r = new Rectangle("����",3.5, 2.5);
		r.getArea();
		r.getGirth();
	}
}

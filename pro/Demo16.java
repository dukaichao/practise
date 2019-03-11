package mypratice;
/*
 * 需求：描述一个图形，圆形，矩形三个类，不管哪种图形都会具备计算面积，周长
 * 		的方式，只不过每种图形计算的方式不一致
 * 
 * 
 * 
 * abstract不嫩与以下关键字共同修饰一个方法：
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
		System.out.println(name+"的面积为："+r*r*PI);
	}
	public void getGirth() {
		System.out.println(name+"的周长为："+2*r*PI);
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
		System.out.println(name+"的面积为："+length*width);
	}
	public void getGirth() {
		System.out.println(name+"的周长为："+2*(width+length));
	}
}
public class Demo16 {
	public static void main(String[] args) {
		Circle_2 c = new Circle_2("圆",3.0);
		c.getArea();
		c.getGirth();
		Rectangle r = new Rectangle("矩形",3.5, 2.5);
		r.getArea();
		r.getGirth();
	}
}

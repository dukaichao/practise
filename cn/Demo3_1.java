package cn;
/*
 	需求：创建类对象，分别设置圆半径，圆柱体的高计算并分别显示圆半径，圆面积，周长，圆柱体体积。
 */
class Circle{
	static double r;
	static final double PI = 3.14;
	public void setRadius(double r) {
		this .r = r;
	}
	public void getRadius() {
		System.out.println("圆的半径为："+r);
	}
	public void getArea() {
		System.out.println("圆的面积为："+(PI*r*r));
		
	}
	public void getGirth() {
		System.out.println("圆的周长为："+(PI*r*2));
	}
	public void show() {
		getRadius();
		getGirth();
		getArea();
	}
}
class Cylinder extends Circle{
	
	double height;
	public void setHeight(double height) {
		this.height = height;
	}
	public void getVolume() {
		System.out.println("圆柱体的体积为"+(PI*r*r*height));
		
	}
}
public class Demo3_1 {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.setRadius(3.0);
		c.getRadius();
		c.show();
		
		Cylinder c1 = new Cylinder();
		c1.setHeight(10);
		c1.getVolume();
	}
}

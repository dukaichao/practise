package cn;
/*
 	���󣺴�������󣬷ֱ�����Բ�뾶��Բ����ĸ߼��㲢�ֱ���ʾԲ�뾶��Բ������ܳ���Բ���������
 */
class Circle{
	static double r;
	static final double PI = 3.14;
	public void setRadius(double r) {
		this .r = r;
	}
	public void getRadius() {
		System.out.println("Բ�İ뾶Ϊ��"+r);
	}
	public void getArea() {
		System.out.println("Բ�����Ϊ��"+(PI*r*r));
		
	}
	public void getGirth() {
		System.out.println("Բ���ܳ�Ϊ��"+(PI*r*2));
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
		System.out.println("Բ��������Ϊ"+(PI*r*r*height));
		
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

package cn;
/*
 * ������ͳ��󷽷�
 * ���󷽷�û�з����壬ֻ������
 * ʹ��Ҫ�����£�
 * 	1.�г��󷽷�����ֻ�ܶ���Ϊ������
 * 	2.�����಻�ܱ�ʵ��������������new�ؼ��ִ�������
 * 	3.��������԰������ԣ������������������ǹ�����������new��ʵ������ֻ���������������
 * 	4.������ֻ�ܱ��̳�
 * 	5.���󷽷����뱻����ʵ��
 */
abstract class Animal_1{
	abstract public void show();    //���󷽷�
}
class Dog_1 extends Animal_1{
	public void show() {
		System.out.println("��������");
	}
	public void seeDoor() {
		System.out.println("������......");
	}
}
public class Demo16 {
	public static void main(String[] args) {
		Dog_1 d = new Dog_1();
		d.seeDoor();
		d.show();
	}
}

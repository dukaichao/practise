package cn;
/*
 * ��̬ע�����
 * 		1.��̬�Ƿ����Ķ�̬���������ԵĶ�̬����̬�������޹أ�
 * 		2.��̬������������Ҫ�������̳У�������д����������ָ���������
 * 		3.��������ָ�����������øø������õ���������д�ķ�������ʱ��̬�ͳ���
 */
class Animal{
	public void show() {
		System.out.println("��");
	}
}
class Dog extends Animal{
	public void show() {
		System.out.println("������");
	}
	public void display() {
		System.out.println("����ʱ����");
	}
}
class Cat extends Animal{
	public void show() {
		System.out.println("������");
	}
}
public class Demo512 {
	public static void main(String[] args) {
		Animal a1 = new Dog();
		Cry(a1);
		Dog d = (Dog) a1;
		d.display();
		d.show();
		a1.show();
	}
	
	static void Cry(Animal a) {
		a.show();
	}
}

package mypratice;
/*
 	instanceof�ؼ���
 	instanceof�ؼ��ֵ����ã��ж�һ�������Ƿ�����ָ��������
 	instanceof�ؼ���ʹ�õ�ǰ�᣺�жϵĶ�����ָ����������Ҫ���ڼ̳л���ʵ�ֵĹ�ϵ	
 		
 	instanceof�ؼ���ʹ�ø�ʽ��
 		����  instanceof ����
 		
 	instanceof�ؼ������ã�
 		һ����ǿ������ת��֮ǰ����ʹ�ùؼ������ж�һ�ѣ�Ȼ���ڽ���ת��
 		
 */
class Animal_2{
	String name;
	String color;
	public Animal_2(String name,String color) {
		this.name = name;
		this.color = color;
	}
}
class Dog_2 extends Animal_2{
	public Dog_2(String name,String color) {
		// TODO Auto-generated constructor stub
		super(name,color);
	}
	public void bite() {
		System.out.println(name+"ҧ��");
	}
}
class Mouse extends Animal_2{
	public Mouse(String name,String color) {
		// TODO Auto-generated constructor stub
		super(name,color);
	}
	public void bite() {
		System.out.println(name+"���������⿾�ųԣ�����");
	}
}
public class Demo19 {
	public static void main(String[] args) {
		Dog_2 d = new Dog_2("����", "��ɫ");
		System.out.println("���ǹ�����"+ (d instanceof Dog_2));
		System.out.println( "���Ƕ�������"+(d instanceof Animal_2));
		//System.out.println( "������������"+(d instanceof Mouse));  �ᱨ��
		Animal_2 a = new Animal_2("����","��ɫ");
		System.out.println("���ﶼ���ǹ�����"+ (a instanceof Dog_2));		
	}
}

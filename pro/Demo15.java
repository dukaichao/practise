package mypratice;
/*
 * ������
 * ������Ӧ�ó���:
 * 		��������һ�������ʱ�򣬷�����������ȷʵ������ĳЩ��Ϊ������������ΪĿǰ�ǲ�����ģ�
 * 	��ô���ǿ��Գ�ȡ������Ϊ�����������ǲ�ȥʵ��������Ϊ����ʱ��������Ϊ���ǳ�Ϊ������Ϊ��
 * 	���Ǿ���Ҫ������
 * ������ô���ǿ��Ҫ������һ��Ҫʵ�ֵķ���
 * 
 * ������ʹ��ϸ�ڣ�
 * 	1.���һ������û�з����壬��ô�ú�������Ҫʹ��abstract���Σ��Ѹú������γɳ���ĺ���
 * 	2.���һ������ֳ���ĺ�������ô����Ҳ������abstract����
 * 	3.���һ���ǳ�����̳��˳����࣬��ô����Ҫ�ѳ���������г��󷽷�ʵ��
 * 	4.��������Դ��ڷǳ��󷽷���Ҳ���Դ��ڳ���ķ���
 * 	5.���������û�г��󷽷�.
 * 	6.�������ǲ��ܴ��������.
 * 			���ʣ�Ϊʲô�����಻�ܴ�������
 * 				��Ϊ�������Ǵ��ڳ��󷽷��ģ�����ó����ഴ������Ļ�����ôʹ�ó�����Ķ�����ó��󷽷���û���κ�����
 * 	7.�������Ǵ��ڹ��캯���ģ��乹�캯�����ṩ�����ഴ�������ʱ���ʼ�����������
 * 
 * 
 * 
 * 
 * abstract���������¹ؼ��ֹ�ͬ����һ��������
 * 	1.private   
 * 	2.static
 * 	3.final
 * 
 * 
 */
abstract class Animal_1{
	String name;
	String color;
	public Animal_1(String name,String color) {
		this.name = name;
		this.color = color;
	}
	abstract public void run();
}
class Dog_1 extends Animal_1{
	public Dog_1(String name,String color) {
		super(name,color);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(name+"�����ȷɿ����");
		
	}
}
public class Demo15  {
	public static void main(String[] args) {
		Dog_1 d = new Dog_1("laji", "baisu");
		d.run();
	}
}

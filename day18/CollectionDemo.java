package cn.itcast.day18;
/*
 * ѧϰJava�����ֳ��ȱ�����ʽ
 * ����.length   ����   ����ֵint
 * �ַ���.length()   ����  ����ֵint
 * ����.size()   ����   ����ֵint
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
 * Collection�ӿ��еķ���
 * �������ӽӿڶ������еķ���
 * ʹ��Collection�ӿڵ�ʵ���࣬�������ʾ
 * ArrayList  implements List
 * List extends Collection
 * ������ִ����ʵ���෽������д
 */
public class CollectionDemo {
	public static void main(String[] args) {
		//function();
		//function_1();
		function_2();
	}
	
	

	/*
	 * Collection�ӿڵķ���
	 * clear()��ռ���������Ԫ��
	 */
	public static void function() {
		//�ӿڶ�̬����
		Collection<String> c = new ArrayList<String>();
		c.add("llkjhh");
		System.out.println(c.contains("llkjhh"));
		System.out.println(c);
		c.clear();
		System.out.println(c);
		System.out.println(c.isEmpty());
		}
	
	
	/*
	 * Collection�ӿڷ���
	 * Object[] toArray()  �����е�Ԫ��ת��������
	 */
	private static void function_1() {
		Collection<String> c = new ArrayList<String>();
		c.add("llkjhh");
		Object[] b = c.toArray();
		for(int i = 0;i < b.length;i++) {
		System.out.println(b[i]);
		}
	}
	
	/*
	 * Collection�ӿڵķ���
	 * remove(Object o)�Ƴ�������ָ��Ԫ��
	 * ���ķ���ֵ��Boolean��
	 * 
	 * ɾ����������������ж����ͬ�����ݣ���ɾ����һ�γ��ֵ�
	 */
	private static void function_2() {
		Collection<String> c = new ArrayList<String>();
		
		c.add("llkjhh");
		c.add("abc");
		c.add("cds");
		c.add("abc");
		Collection<String> c1 = new ArrayList<String>();
		c1.add("abc");
		c1.add("cds");
		c1.add("abc");
		c1.add("asd");
		//c.removeAll(c1);   //ɾ������
		c.retainAll(c1);     //�����������඼ɾ��
		System.out.println(c);
		/*boolean b = c.remove("abc");
		System.out.println(b);
		System.out.println(c);*/
	}
}

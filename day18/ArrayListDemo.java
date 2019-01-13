package cn.itcast.day18;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
	public static void main(String[] args) {
		/*
		 * ����ArrayList�洢int����
		 * ���ϱ������ܻ����࣬�Զ�װ��洢
		 */
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(12);
		arr.add(13);
		arr.add(14);
		arr.add(15);
		for(int i = 0;i < arr.size();i++) {
			System.out.println(arr.get(i));
		}
		
		/*
		 * 
		 */
		ArrayList<Person> arrPer = new ArrayList<Person>();
		arrPer.add(new Person("Mr.Du",21));
		arrPer.add(new Person("Mrs.Zheng",22));
		arrPer.add(new Person("Mrs.Liu",23));
		arrPer.add(new Person("Mrs.Jing",20));
		//��ʵcontains�����ڲ���������equals������
		System.out.println("�ж��Ƿ��д�Ԫ�أ�"+arrPer.contains(new Person("Mrs.Jing",20)));  
		
		ArrayList<Person> arrPer1 = new ArrayList<Person>();
		arrPer1.add(new Person("Mr.Du",21));
		arrPer1.add(new Person("Mrs.Zheng",22));
		arrPer1.add(new Person("Mrs.Liu",23));
		System.out.println("�ж�arrPer�Ƿ���arrPer1��Ԫ�أ�"+arrPer.containsAll(arrPer1));  
		
		
		
		Object [] b = arrPer1.toArray();
		for(int i = 0;i<b.length;i++) {
			Person p = (Person)b[i];  
			if(p.age == 21) {
				System.out.println(p);
			}
		}
		System.out.println("����Ԫ��Ϊ��"+Arrays.toString(b));
		
		for(int i = 0;i < arrPer.size();i++) {
			/*
			 * get()����   ȡ���Ķ���Person�Ķ���
			 * ��ӡ��һ�����󣬱������toString��������
			 */
			System.out.println(arrPer.get(i));
		}
	}
}

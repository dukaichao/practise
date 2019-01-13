package cn.itcast.day18;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
	public static void main(String[] args) {
		/*
		 * 集合ArrayList存储int类型
		 * 集合本身不接受基本类，自动装箱存储
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
		//其实contains方法内部是依赖于equals方法的
		System.out.println("判断是否含有此元素："+arrPer.contains(new Person("Mrs.Jing",20)));  
		
		ArrayList<Person> arrPer1 = new ArrayList<Person>();
		arrPer1.add(new Person("Mr.Du",21));
		arrPer1.add(new Person("Mrs.Zheng",22));
		arrPer1.add(new Person("Mrs.Liu",23));
		System.out.println("判断arrPer是否含有arrPer1的元素："+arrPer.containsAll(arrPer1));  
		
		
		
		Object [] b = arrPer1.toArray();
		for(int i = 0;i<b.length;i++) {
			Person p = (Person)b[i];  
			if(p.age == 21) {
				System.out.println(p);
			}
		}
		System.out.println("数组元素为："+Arrays.toString(b));
		
		for(int i = 0;i < arrPer.size();i++) {
			/*
			 * get()方法   取出的对象Person的对象
			 * 打印是一个对象，必须调用toString（）方法
			 */
			System.out.println(arrPer.get(i));
		}
	}
}

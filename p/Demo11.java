package mypratice;
/*
 * static关键字
 * 需求：描述一个寒大的学生类
 * 目前存在的问题是：所有的学生都是大杜帝国的，有n个学生就会有n份大杜帝国的数据内存中，
 * 	这样子会浪费内存
 * 目前方案：把“大杜帝国”这个数据移动到数据共享区中，共享这个数据给所有的Student对象即可
 * 如何才能把这个数据移动到数据共享区中共享呢？
 * 解决方案：只需要使用static修饰该数据即可
 * 静态的成员变量只会在方法区（数据共享区）之中维护一份，而非静态成员变量会在每一个对象中维护
 */
class Student1{
	String name;
	static String country = "大杜帝国";
	public Student1(String name) {
		this.name = name;
		
	}
}
public class Demo11 {
	public static void main(String[] args) {
		Student1 s1 = new Student1("Mr.du");
		Student1 s2 = new Student1("mr.du");
		s1.country = "zh";
		System.out.println("姓名："+s1.name+"国家："+s1.country);
		System.out.println("姓名："+s2.name+"国家："+s2.country);
	}
}

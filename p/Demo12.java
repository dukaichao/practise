package mypratice;
/*
 * 	static(静态\修饰符)
 * 		1.static修饰成员变量:如果有数据需要被共享给所有对象时，那么就可以使用static修饰符
 
 		2.static修饰成员函数
  	静态成员变量的访问方式：
 * 			方式一：可以使用对象进行访问。格式：对象名.变量名
 * 			方式二：可以使用类名进行访问。格式：类名.变量名
 * 			
 * 			注意：
 * 				1.非静态成员变量只能使用对象来访问，不能使用类名访问
 * 				2.千万不要为了方便访问数据而使用static修饰成员变量，只有成员变量被共享时，才用static进行修饰
 * 		static修饰成员变量的应用场景：如果一个变量要被所有对象共享使用的时候，我们用static进行修饰
 * 		2.static修饰成员函数
 * 需求：统计一个类被使用了创建对象,该类对外显示被创建的次数。
 */
class Emp{
	static int count = 0;
	String name;
	{
		count++;
	}
	public Emp(String name) {
		this.name = name;
	}
	public Emp() {
		
	}
}
public class Demo12 {
	public static void main(String[] args) {
		new Emp();
		new Emp();
		System.out.println(Emp.count);
	}
}

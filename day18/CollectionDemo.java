package cn.itcast.day18;
/*
 * 学习Java中三种长度变现形式
 * 数组.length   属性   返回值int
 * 字符串.length()   方法  返回值int
 * 集合.size()   方法   返回值int
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
 * Collection接口中的方法
 * 是所有子接口都所必有的方法
 * 使用Collection接口的实现类，程序的演示
 * ArrayList  implements List
 * List extends Collection
 * 方法的执行是实现类方法的重写
 */
public class CollectionDemo {
	public static void main(String[] args) {
		//function();
		//function_1();
		function_2();
	}
	
	

	/*
	 * Collection接口的方法
	 * clear()清空集合中所有元素
	 */
	public static void function() {
		//接口多态调用
		Collection<String> c = new ArrayList<String>();
		c.add("llkjhh");
		System.out.println(c.contains("llkjhh"));
		System.out.println(c);
		c.clear();
		System.out.println(c);
		System.out.println(c.isEmpty());
		}
	
	
	/*
	 * Collection接口方法
	 * Object[] toArray()  集合中的元素转换成数组
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
	 * Collection接口的方法
	 * remove(Object o)移除集合中指定元素
	 * 它的返回值是Boolean型
	 * 
	 * 删除：如果该容器中有多个相同的内容，则删除第一次出现的
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
		//c.removeAll(c1);   //删除交集
		c.retainAll(c1);     //除交集外其余都删除
		System.out.println(c);
		/*boolean b = c.remove("abc");
		System.out.println(b);
		System.out.println(c);*/
	}
}

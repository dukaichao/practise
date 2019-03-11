package mypratice;
/*
 * 接口
 * 
 * 接口定义格式
 * 			interface 接口名{
 * 
 * 			}
 * 	接口要注意的事项：
 * 		1.接口是一个特殊的类
 * 		2.接口中的成员变量默认修饰符为public static final,那么也就是说接口中的成员变量都是常量
 * 		3.接口中的方法都是抽象的方法，默认为：public abstract
 * 		4.接口不能创建对象.
 * 		5.接口是没有构造方法的.
 * 		6.接口是给类去实现使用的，非抽象类实现一个接口的时候，必须要把接口中所有方法实现
 * 	实现接口的格式：
 * 		class  类名  implements 接口名；
 * 
 * 接口的作用：
 * 		1.拓展功能
 * 		2.可以定义约束规范
 * 		3.程序的解耦
 * 
 * 
 * 类与接口要注意的事项：
 * 		1.非抽象类实现一个接口时，必须要把接口的所有方法都实现
 * 		2.抽象类实现一个接口时，可以实现也可以不实现接口中的方法
 * 		3.一个类可以实现多个接口
 * 
 */
//普通的铅笔类
class Pencil{
	String name;
	 public Pencil(String name) {
		 this.name = name;
	 }
	 public void write() {
		 System.out.println(name+"写啊写.......");
	 }
}
//橡皮接口
interface Eraser{
	public void remove();
}
//带橡皮的铅笔
class PencilWithEraser extends Pencil implements Eraser{

	public PencilWithEraser(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		System.out.println("涂改");
	}
	
}
public class Demo18 {
	public static void main(String[] args) {
		PencilWithEraser p = new PencilWithEraser("2B");
		p.write();
		p.remove();
	}
}

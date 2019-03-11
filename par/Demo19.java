package mypratice;
/*
 	instanceof关键字
 	instanceof关键字的作用：判断一个对象是否属于指定的类型
 	instanceof关键字使用的前提：判断的对象与指定的类别必须要存在继承或者实现的关系	
 		
 	instanceof关键字使用格式：
 		对象  instanceof 类名
 		
 	instanceof关键字作用：
 		一般做强制类型转换之前都会使用关键字先判断一把，然后在进行转换
 		
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
		System.out.println(name+"咬人");
	}
}
class Mouse extends Animal_2{
	public Mouse(String name,String color) {
		// TODO Auto-generated constructor stub
		super(name,color);
	}
	public void bite() {
		System.out.println(name+"被当成羊肉烤着吃！！！");
	}
}
public class Demo19 {
	public static void main(String[] args) {
		Dog_2 d = new Dog_2("旺财", "白色");
		System.out.println("狗是狗类吗？"+ (d instanceof Dog_2));
		System.out.println( "狗是动物类吗？"+(d instanceof Animal_2));
		//System.out.println( "狗是老鼠类吗？"+(d instanceof Mouse));  会报错
		Animal_2 a = new Animal_2("狗娃","黑色");
		System.out.println("动物都是是狗类吗？"+ (a instanceof Dog_2));		
	}
}

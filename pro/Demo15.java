package mypratice;
/*
 * 抽象类
 * 抽象类应用场景:
 * 		我们描述一类事物的时候，发现这种事物确实存在着某些行为，但是这种行为目前是不具体的，
 * 	那么我们可以抽取这种行为的声明，但是不去实现这种行为，这时候这种行为我们称为抽象行为，
 * 	我们就需要抽象类
 * 抽象类好处：强制要求子类一定要实现的方法
 * 
 * 抽象类使用细节：
 * 	1.如果一个函数没有方法体，那么该函数必须要使用abstract修饰，把该函数修饰成抽象的函数
 * 	2.如果一个类出现抽象的函数，那么该类也必须用abstract修饰
 * 	3.如果一个非抽象类继承了抽象类，那么必须要把抽象类的所有抽象方法实现
 * 	4.抽象类可以存在非抽象方法，也可以存在抽象的方法
 * 	5.抽象类可以没有抽象方法.
 * 	6.抽象类是不能创建对象的.
 * 			疑问：为什么抽象类不能创建对象
 * 				因为抽象类是存在抽象方法的，如果让抽象类创建对象的话，那么使用抽象类的对象调用抽象方法是没有任何意义
 * 	7.抽象类是存在构造函数的，其构造函数是提供给子类创建对象的时候初始化父类的属性
 * 
 * 
 * 
 * 
 * abstract不嫩与以下关键字共同修饰一个方法：
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
		System.out.println(name+"四条腿飞快的跑");
		
	}
}
public class Demo15  {
	public static void main(String[] args) {
		Dog_1 d = new Dog_1("laji", "baisu");
		d.run();
	}
}

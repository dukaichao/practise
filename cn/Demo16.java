package cn;
/*
 * 抽象类和抽象方法
 * 抽象方法没有方法体，只有声明
 * 使用要点如下：
 * 	1.有抽象方法的类只能定义为抽象类
 * 	2.抽象类不能被实例化，即不能用new关键字创建对象
 * 	3.抽象类可以包含属性，方法，构造器，但是构造器不能用new来实例化，只能用来被子类调用
 * 	4.抽象类只能被继承
 * 	5.抽象方法必须被子类实现
 */
abstract class Animal_1{
	abstract public void show();    //抽象方法
}
class Dog_1 extends Animal_1{
	public void show() {
		System.out.println("汪汪汪叫");
	}
	public void seeDoor() {
		System.out.println("看门中......");
	}
}
public class Demo16 {
	public static void main(String[] args) {
		Dog_1 d = new Dog_1();
		d.seeDoor();
		d.show();
	}
}

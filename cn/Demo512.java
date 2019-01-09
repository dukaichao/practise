package cn;
/*
 * 多态注意事项：
 * 		1.多态是方法的多态，不是属性的多态（多态与属性无关）
 * 		2.多态存在有三个必要条件：继承，方法重写，父类引用指向子类对象；
 * 		3.父类引用指向子类对象后，用该父类引用调用子类重写的方法，此时多态就出现
 */
class Animal{
	public void show() {
		System.out.println("叫");
	}
}
class Dog extends Animal{
	public void show() {
		System.out.println("汪汪汪");
	}
	public void display() {
		System.out.println("运行时类型");
	}
}
class Cat extends Animal{
	public void show() {
		System.out.println("喵喵喵");
	}
}
public class Demo512 {
	public static void main(String[] args) {
		Animal a1 = new Dog();
		Cry(a1);
		Dog d = (Dog) a1;
		d.display();
		d.show();
		a1.show();
	}
	
	static void Cry(Animal a) {
		a.show();
	}
}

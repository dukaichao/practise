package mypratice;
/*
 * 需求：使用Java定义一个人 类，人具备id，name，age三个属性，还具备一个比较年龄的方法；
 * 要求：必须要写上构造函数，构造函数也必须使用上this关键字。
 * 
 */
class Human{
	String name;
	int id;
	int age;
	public Human(String name,int id,int age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}
	public void CompareAge(Human p1) {
		if(p1.age > this.age) {
			System.out.println(p1.name+"比"+this.name+"大");
		}
		else if(p1.age < this.age) {
			System.out.println(p1.name+"比"+this.name+"小");
		}
		else
			System.out.println(p1.name+"和"+this.name+"年龄相同");
		
		
	}
}
public class Demo10 {
	public static void main(String[] args) {
		Human h1 = new Human("mr.du", 10010, 20);
		Human h2 = new Human("Mr.Du", 10011, 30);
		h1.CompareAge(h2);
		
	
	}

	

}

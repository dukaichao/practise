package mypratice;
/*
 * ����ʹ��Java����һ���� �࣬�˾߱�id��name��age�������ԣ����߱�һ���Ƚ�����ķ�����
 * Ҫ�󣺱���Ҫд�Ϲ��캯�������캯��Ҳ����ʹ����this�ؼ��֡�
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
			System.out.println(p1.name+"��"+this.name+"��");
		}
		else if(p1.age < this.age) {
			System.out.println(p1.name+"��"+this.name+"С");
		}
		else
			System.out.println(p1.name+"��"+this.name+"������ͬ");
		
		
	}
}
public class Demo10 {
	public static void main(String[] args) {
		Human h1 = new Human("mr.du", 10010, 20);
		Human h2 = new Human("Mr.Du", 10011, 30);
		h1.CompareAge(h2);
		
	
	}

	

}

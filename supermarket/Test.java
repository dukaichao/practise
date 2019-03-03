package supermarket;

import java.util.ArrayList;

class Preson{
	String name;
	int age;
	public Preson(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Preson [name=" + name + ", age=" + age + "]";
	}
	
}
public class Test {
	public static void main(String[] args) {
		ArrayList<Preson> a = new ArrayList<Preson>();
		a.add(new Preson("d",21));
		a.add(new Preson("d",23));
		a.add(new Preson("d",21));
		System.out.println(a.get(1).age);
	}
}

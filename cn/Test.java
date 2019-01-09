package cn;
class Preson{
	String name;
	int age;
	public String toString() {
		return "ĞÕÃû:"+name+",ÄêÁä£º"+age;
	}
}
public class Test {
	public static void main(String [] args) {
		Preson p = new Preson();
		p.age = 18;
		p.name = "Mr.Du";
		System.out.println(p);
		Test t = new Test();
		System.out.println(t);
	}

}

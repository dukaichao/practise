/*class Person {
	public final Student stu = new Student();
}

class Student {
	private int age;
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return this.age;
	}
	
	
}
public static void main(String[] args){
		Person p = new Person();
		p.stu.setAge(10);
		System.out.println("p.stu.age = "+p.stu.getAge());
		Student s = p.stu;
		s.setAge(12);
		System.out.println("p.stu.age = "+p.stu.getAge());
		System.out.println("s.age = "+s.getAge());
}
*/
class Person {
	public void print(){
		System.out.println("1.dew");
	}
}

class Student extends Person {
	public void print(){
		System.out.println("2.Lrd");
	}
}
public class Day8{
	
	public static void main(String[] args){
		//Student stu = new Student();
		//向上转型,自动
		Person per = new Student();
		per.print();
		//向下转型，需要强转
		Student stu = (Student) per;
		stu.print();
	}
}

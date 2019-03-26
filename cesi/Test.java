package cesi;

public class Test {
	public static void main(String[] args) {
		new Student("Tom",'m',90,88);
		new Student("Jack",'m',95,89);
		new Student("Mary",'f',92,86);
		System.out.println("name\tsex\tchinese\tenglish");
		Student.print();
	}
}

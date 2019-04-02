package dkc_pra;
abstract class Preson{
	public Preson() {//2
		this.print();
	}
	public abstract void print();
}
class Student extends Preson{
	private int num = 100;
	public Student(int num) {//1
		super();
		this.num = num;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(this.num);
	}
	
}
public class Test {
	public static void main(String[] args) {
		new Student(30);  //100
		new Student(30).print();  //100 30
	}
}

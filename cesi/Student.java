package cesi;

public class Student {
	protected String name;
	protected char sex;
	protected int chinese;
	protected int math;
	protected Student next;
	static protected Student list;
	public Student(String name, char sex, int chinese, int math) {
		super();
		this.name = name;
		this.sex = sex;
		this.chinese = chinese;
		this.math = math;
		this.next = list;
		list = this;
	}
	static void print(){
		Student friend = list;
		if(friend == null) {
			System.out.println("the list is empty");
		}else {
			do {
				System.out.println(friend.toString());
				friend = friend.next;
			}while(friend!=null);
		}
	}
	@Override
	public String toString() {
		return new String(name+"\t"+sex+"\t"+chinese+"\t"+math);
	}
	
	
}

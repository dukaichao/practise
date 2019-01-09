package cn;
public class TestEqual{
	public static void main(String [] args) {
		People p1 = new People("Mr.Du",123);
		People p2 = new People("mr.du",123);
		System.out.println(p1 == p2);     //����������������Ƿ����
		System.out.println(p1.equals(p2));   //�Ƚ����������id
		
	}
}
class People{
	String name;
	int id;
	public People(String name,int id) {
		this.id = id;
		this.name = name;
	}
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		else {
			if(obj instanceof People) {
				People c = (People) obj;
				if(c.id == this.id) {
					return true;
				}
			}
		}
		return false;
	}
}


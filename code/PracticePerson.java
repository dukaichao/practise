public class PracticePerson{
	public static void main(String[] args){
		Person p = new Person("Mr.Du","male","183****1471","Manager",21,"寒寨黄金地段大厦");
		System.out.println(p);
	}
}
class Person{
	private String name;
	private String sex;
	private String tel;
	private String post;
	private int age;
	private String address;
	public Person(String name,String sex,String tel,String post,int age,String address){
		this.name = name;
		this.sex = sex;
		this.tel = tel;
		this.post = post;
		this.age = age;
		this.address = address;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public void setSex(String sex){
		this.sex = sex;
	}
	public void setTel(String tel){
		this.tel = tel;
	}
	public void setPost(String post){
		this.post = post;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setAddress(String address){
		this.address = address;
	}
	
	public String toString(){
		return "Name: "+this.name+"\t\t"+"Post: "+this.post+"\n"+"Sex: "+this.sex+"\t\t"+"Age:"+this.age+"\n"+"Tel: "+this.tel+"\t"+"Address: "+this.address;
	}
}
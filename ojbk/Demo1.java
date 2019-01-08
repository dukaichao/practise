package ojbk;
/*
 * 创建引用类型数组
 */
class Man{
	private int age;
	private int id;
	public Man(int id,int age) {
		super();
		this.id = id;
		this.age = age;
	}
	public String toString() {
		return id+",nianl:"+age;
	}
}
public class Demo1 {
	public static void main(String[] args) {
		Man [] mans;                                  //声明引用类型数组
		mans = new Man[10];                             //给引用类型数组分配空间
		Man m1  = new Man(1,11);                       
		Man m2  = new Man(1,11);
		mans[0] = m1;                        //给引用类型数组元素赋值
		mans[1] = m2;
		System.out.println(mans[0].toString());
		
	}
}

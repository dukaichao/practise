package ojbk;
/*
 * ����������������
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
		Man [] mans;                                  //����������������
		mans = new Man[10];                             //�����������������ռ�
		Man m1  = new Man(1,11);                       
		Man m2  = new Man(1,11);
		mans[0] = m1;                        //��������������Ԫ�ظ�ֵ
		mans[1] = m2;
		System.out.println(mans[0].toString());
		
	}
}

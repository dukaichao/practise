package mypratice;
/*
 * static�ؼ���
 * ��������һ�������ѧ����
 * Ŀǰ���ڵ������ǣ����е�ѧ�����Ǵ�ŵ۹��ģ���n��ѧ���ͻ���n�ݴ�ŵ۹��������ڴ��У�
 * 	�����ӻ��˷��ڴ�
 * Ŀǰ�������ѡ���ŵ۹�����������ƶ������ݹ������У�����������ݸ����е�Student���󼴿�
 * ��β��ܰ���������ƶ������ݹ������й����أ�
 * ���������ֻ��Ҫʹ��static���θ����ݼ���
 * ��̬�ĳ�Ա����ֻ���ڷ����������ݹ�������֮��ά��һ�ݣ����Ǿ�̬��Ա��������ÿһ��������ά��
 */
class Student1{
	String name;
	static String country = "��ŵ۹�";
	public Student1(String name) {
		this.name = name;
		
	}
}
public class Demo11 {
	public static void main(String[] args) {
		Student1 s1 = new Student1("Mr.du");
		Student1 s2 = new Student1("mr.du");
		s1.country = "zh";
		System.out.println("������"+s1.name+"���ң�"+s1.country);
		System.out.println("������"+s2.name+"���ң�"+s2.country);
	}
}

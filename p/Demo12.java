package mypratice;
/*
 * 	static(��̬\���η�)
 * 		1.static���γ�Ա����:�����������Ҫ����������ж���ʱ����ô�Ϳ���ʹ��static���η�
 
 		2.static���γ�Ա����
  	��̬��Ա�����ķ��ʷ�ʽ��
 * 			��ʽһ������ʹ�ö�����з��ʡ���ʽ��������.������
 * 			��ʽ��������ʹ���������з��ʡ���ʽ������.������
 * 			
 * 			ע�⣺
 * 				1.�Ǿ�̬��Ա����ֻ��ʹ�ö��������ʣ�����ʹ����������
 * 				2.ǧ��ҪΪ�˷���������ݶ�ʹ��static���γ�Ա������ֻ�г�Ա����������ʱ������static��������
 * 		static���γ�Ա������Ӧ�ó��������һ������Ҫ�����ж�����ʹ�õ�ʱ��������static��������
 * 		2.static���γ�Ա����
 * ����ͳ��һ���౻ʹ���˴�������,���������ʾ�������Ĵ�����
 */
class Emp{
	static int count = 0;
	String name;
	{
		count++;
	}
	public Emp(String name) {
		this.name = name;
	}
	public Emp() {
		
	}
}
public class Demo12 {
	public static void main(String[] args) {
		new Emp();
		new Emp();
		System.out.println(Emp.count);
	}
}

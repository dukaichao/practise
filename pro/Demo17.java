package mypratice;
/*
 	ֵ����:����һ��������ʱ�򣬴��ݸ������Ĳ���ʵ���ϴ��ݱ�����ֵ��
 	ֵ������������������ֵ�ĵ�ַ
 	����1������һ���������������������͵�ֵ��
 	
 	
 	
 	
 */
public class Demo17 {
	public static void main(String[] args) {
		
		int a = 5;
		int b = 6;
		change(a,b);
		System.out.println("a = " +a+",b = " +b);
	}
	public static void change(int a,int b) {
		int temp = a;
		a = b;
		b = temp;
		/*System.out.println("a = " +a);
		System.out.println("b = " +b);*/
	}
}

package cn;

public class Demo13 {
	public static void main(String[] args) {
		Object obj = new String("��ŵ۹���һ��������Mr.Du");
		//obj.charAt(0);  �޷����ã���������Ϊobj��Object���ͣ�������String����
		/*   ��д����ʱ��������������ʱ���ͷ�����ֻ�ܽ���ǿ������ת����
		  ��Ȼͨ�����������ļ��  */
		String str = (String) obj;
		System.out.println(str.charAt(2));
		System.out.println(str == obj);
		if(obj instanceof String)
			System.out.println("true");
		else
			System.out.println("false");
		}
}

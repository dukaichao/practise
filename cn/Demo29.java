package cn;

public class Demo29 {
	public static void main(String[] args) {
		String s1 = "Du Kai chao ";
		String s2 = "du kai chao ";
		System.out.println("1:"+s1.charAt(1));         //�����ַ����ڶ����ַ�
		System.out.println("2:"+s2.length());			//�����ַ���ʱs2�ĳ���
		System.out.println("3:"+s1.equals(s2));			//s1,s2�ַ��������Ƿ���ȫ���
		System.out.println("4:"+s1.equalsIgnoreCase(s2));//�����Сд��s1,s2�ַ��������Ƿ���ȫ���
		System.out.println("5:"+s1.indexOf("Du"));   //�ַ����в����Ƿ���Du����ַ�����û�з���-1���ҵ�����������
		System.out.println("6:"+s1.startsWith("Mr.du"));     //�ַ����Ƿ����������ַ�����ʼ
		System.out.println("7:"+s1.toLowerCase());    //����һ���ַ�������ԭ����дȫ����ΪСд
		System.out.println("8:"+s1.toUpperCase());	//����һ���ַ�������ԭ��Сдȫ����Ϊ��д
		System.out.println("9:"+s1.substring(0,10));   //����һ���ַ�����������0������2
		System.out.println("10:"+s1.substring(0));    //�����ַ���������2��ʼ����β���ַ�
		System.out.println("11:"+s1.trim());     //����һ���ַ������ô�ɾ��ԭ���ַ����Ŀ�ͷ�ͽ�β�ո�
	}

}

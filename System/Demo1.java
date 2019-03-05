package dkc.System;

import java.util.Properties;

/*
 	System������������õ����ֶκͷ����� �����ܱ�ʵ������
 	
 	 arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 
 	 	��ָ��Դ�����е������ָ��λ�ø��Ƶ�Ŀ�������ָ��λ�á�
 	 src:Դ����
 	 srcPos��Դ�����С��
 	 dest:������
 	 destPos��������С��
 	 length��Ҫ��������Ԫ�صĸ���
 	 �����ܽ᣺src.length >= length + srcPos  &&  dest.length >= destPos + length
	
	currentTimeMillis() ���ص�ǰʱ�䣨�Ժ���Ϊ��λ��
	
	exit(int status)  ��ֹ��ǰ���е�Java�����  ���������0��ʾ�����˳�����0��ʾ�쳣�˳�
	
	gc()   ����������������

	getenv(String name) ���ݻ������������ֻ�ȡ����������ֵ��
	
	getProperties() ȷ����ǰ��ϵͳ���ԡ�
	
	getProperty(key)   ����ϵͳ����������ȡ��Ӧ������ֵ
 */
class Preson{
	String name;
	public Preson(String name) {
		this.name = name;
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println(this.name+"��������...");
	}
	
}
public class Demo1 {
	public static void main(String [] args) {
		int []srcArr = {10,12,14,16,18,20};
		int []destArr = new int[5];
		System.arraycopy(srcArr, 3, destArr, 2, 3);
		long l1 = System.currentTimeMillis();
		for(int i = 0;i < destArr.length;i++) {
				System.out.println(destArr[i]);
		}
		long l2 = System.currentTimeMillis();
		System.out.println((l2-l1));
		System.out.println("����������"+System.getenv("JAVA_HOME"));
		/*for(int i = 0 ; i < 4 ; i++) {
			new Preson("����"+i);
			System.gc();
		}
		Properties p = System.getProperties();
		p.list(System.out);*/
		String value = System.getProperty("os.name");   //����ϵͳ����������ȡ��Ӧ������ֵ
		System.out.println("��ǰϵͳ:"+value);
	}
}

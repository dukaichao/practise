package cn.itcast.other;

import java.util.Date;

/*
 	������  Date
 	after(Date when) ���Դ������Ƿ���ָ������֮��
 	true���ҽ�����Date��������ʾ��ʱ���ϸ�����when��ʾ��ʱ�� ; false����
 */
public class Demo1 {
	public static void main(String [] args) {
		Date d1 = new Date();
		long i = d1.getTime();
		System.out.println("��ǰʱ��Ϊ��"+i);
		Date d2 = new Date(i-1);
		Date d3 = new Date(i+100);
		System.out.println("d1����d2��"+d1.after(d2));
		System.out.println("d1����d2��"+d1.before(d2));
		System.out.println("d1����d2��"+d1.equals(d2));
		System.out.println("d1����d3��"+d1.after(d3));
		System.out.println("d1����d3��"+d1.before(d3));
		System.out.println("d1����d3��"+d1.equals(d3));
		System.out.println("��������"+d1.toString());
		System.out.println("��������"+d2.toString());
		System.out.println("��������"+d3.toString());
	}
}

package cn.itcast.other;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 	Calendar��
 	
 	���ڸ�ʽ����   SimpleDateFormat
 */
public class Demo2 {
	public static void main(String [] args) throws ParseException {
		/*Calendar calendar = Calendar.getInstance();
		System.out.println("��ǰ���Ϊ��"+calendar.get(Calendar.YEAR));
		System.out.println("��ǰ�·�Ϊ��"+(calendar.get(Calendar.MONTH)+1));
		System.out.println("��ǰ�շ�Ϊ��"+calendar.get(Calendar.DATE));
		System.out.println("��ǰʱΪ��"+calendar.get(Calendar.HOUR));
		System.out.println("��ǰ��Ϊ��"+calendar.get(Calendar.MINUTE));
		System.out.println("��ǰ��Ϊ��"+calendar.get(Calendar.SECOND));*/
		
		
		
		/**
		 * ���ڸ�ʽ����  SimpleDateFormate
		 * 		����1�����԰�����ת����ָ����ʽ���ַ���     format()����
		 * 		����2�����԰�һ���ַ���ת���ɶ�Ӧ������    parse()
		 * 
		 */
		Date date = new Date();
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy��MM��dd��  HH:mm:ss");
		String time = sdf.format(date);
		System.out.println("��ǰϵͳ��ʱ�䣺"+time);
		String time1 = "2018��08��28��  19:39:16";
		Date date1 = sdf.parse(time1);//ע�⣺ָ�����ַ�������Ҫ��SimpleDateFormat��ģʽҪһ��
		System.out.println("hahaha:"+date1);
		
		SimpleDateFormat SDF =new SimpleDateFormat("yyyy��MM��dd��");
		String Time = SDF.format(new Date());
		System.out.println("��ǰϵͳ��ʱ�䣺"+Time);
		String Time1 = "2018��08��28��";
		Date date2 = SDF.parse(Time1);
		System.out.println("hahaha:"+date2);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("D");  //D:��ʾһ��Ķ�����   d����ʾһ��Ķ�����
		String day = sdf1.format(new Date());
		System.out.println("һ��ĵ�"+day+"��");
	}
}

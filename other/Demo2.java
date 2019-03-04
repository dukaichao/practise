package cn.itcast.other;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 	Calendar类
 	
 	日期格式化类   SimpleDateFormat
 */
public class Demo2 {
	public static void main(String [] args) throws ParseException {
		/*Calendar calendar = Calendar.getInstance();
		System.out.println("当前年份为："+calendar.get(Calendar.YEAR));
		System.out.println("当前月份为："+(calendar.get(Calendar.MONTH)+1));
		System.out.println("当前日份为："+calendar.get(Calendar.DATE));
		System.out.println("当前时为："+calendar.get(Calendar.HOUR));
		System.out.println("当前分为："+calendar.get(Calendar.MINUTE));
		System.out.println("当前秒为："+calendar.get(Calendar.SECOND));*/
		
		
		
		/**
		 * 日期格式化类  SimpleDateFormate
		 * 		作用1：可以把日期转换成指定格式的字符串     format()方法
		 * 		作用2：可以把一个字符串转换成对应的日期    parse()
		 * 
		 */
		Date date = new Date();
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss");
		String time = sdf.format(date);
		System.out.println("当前系统的时间："+time);
		String time1 = "2018年08月28日  19:39:16";
		Date date1 = sdf.parse(time1);//注意：指定的字符串必须要与SimpleDateFormat的模式要一致
		System.out.println("hahaha:"+date1);
		
		SimpleDateFormat SDF =new SimpleDateFormat("yyyy年MM月dd日");
		String Time = SDF.format(new Date());
		System.out.println("当前系统的时间："+Time);
		String Time1 = "2018年08月28日";
		Date date2 = SDF.parse(Time1);
		System.out.println("hahaha:"+date2);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("D");  //D:表示一年的多少天   d：表示一年的多少天
		String day = sdf1.format(new Date());
		System.out.println("一年的第"+day+"天");
	}
}

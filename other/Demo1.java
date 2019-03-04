package cn.itcast.other;

import java.util.Date;

/*
 	日期类  Date
 	after(Date when) 测试此日期是否在指定日期之后
 	true当且仅当该Date对象所表示的时刻严格晚于when表示的时刻 ; false否则
 */
public class Demo1 {
	public static void main(String [] args) {
		Date d1 = new Date();
		long i = d1.getTime();
		System.out.println("当前时间为："+i);
		Date d2 = new Date(i-1);
		Date d3 = new Date(i+100);
		System.out.println("d1晚于d2："+d1.after(d2));
		System.out.println("d1早于d2："+d1.before(d2));
		System.out.println("d1等于d2："+d1.equals(d2));
		System.out.println("d1晚于d3："+d1.after(d3));
		System.out.println("d1早于d3："+d1.before(d3));
		System.out.println("d1等于d3："+d1.equals(d3));
		System.out.println("哈哈哈："+d1.toString());
		System.out.println("哈哈哈："+d2.toString());
		System.out.println("哈哈哈："+d3.toString());
	}
}

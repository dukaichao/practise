package cn.itcast.other;

import java.util.*;

/*
 * Math 类
 * ceil(double a)  大于a的最小正整数
 * floor(double a)  小于a的最大正整数
 * random()  产生0-1任意数[0,1)
 * abs(double a) 返回值为 double绝对值。 
 * round(flaot a)  四舍五入
 */
public class Demo3 {
	public static void main(String [] args) {
		System.out.println(Math.ceil(3.1));
		System.out.println(Math.floor(3.1));
		System.out.println(Math.round(3.49));
		System.out.println(Math.abs(-1));
		
		
		/*
		 * 随机数类   Random
		 * 
		 * 需求：随机产生四个验证码
		 */
		/*Random r = new Random();
		int a =(int) (r.nextDouble()*10);
		System.out.println(a);*/
		int []arr = {0,1,2,3,4,5,6,7,8,9};
		StringBuilder sb = new StringBuilder();
		Random r = new Random();
		for(int i = 0 ; i < 4 ; i++ ) {
			int index  = r.nextInt(arr.length);
			sb.append(arr[index]);
		}
		System.out.println("验证码："+sb);
	}
}

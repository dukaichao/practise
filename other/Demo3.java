package cn.itcast.other;

import java.util.*;

/*
 * Math ��
 * ceil(double a)  ����a����С������
 * floor(double a)  С��a�����������
 * random()  ����0-1������[0,1)
 * abs(double a) ����ֵΪ double����ֵ�� 
 * round(flaot a)  ��������
 */
public class Demo3 {
	public static void main(String [] args) {
		System.out.println(Math.ceil(3.1));
		System.out.println(Math.floor(3.1));
		System.out.println(Math.round(3.49));
		System.out.println(Math.abs(-1));
		
		
		/*
		 * �������   Random
		 * 
		 * ������������ĸ���֤��
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
		System.out.println("��֤�룺"+sb);
	}
}

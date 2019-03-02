package cn.dkc_1123;

import java.util.Scanner;

public class Demo1 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//教室
		int n = s.nextInt();
		//桌子数
		int m = s.nextInt();
		//趟数
		int count = 1;
		int[][] arr = new int[m][2];
		for(int i = 0;i<m;i++) {
			for(int j = 0;j<2;j++) {
				arr[i][j] = s.nextInt();
			}
		}
		int q = 0;
		while(q<m-1) {
			if(arr[q][1]>arr[q+1][0])
				count++;
			q++;
		}
		System.out.println(count);
	}
}

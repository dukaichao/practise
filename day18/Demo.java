package cn.itcast.day18;


import java.util.Arrays;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = new int[10];
		Scanner  s = new Scanner(System.in);
		System.out.println("�����룺");
		for(int i = 0;i<arr.length;i++) {
			arr[i] = s.nextInt();
		}
		select(arr);
		arr = function(arr);
		System.out.println("ɾ���������Ԫ��Ϊ��"+Arrays.toString(arr));

	}
	//ѡ��
	public static void select(int []arr) {
		for(int i = 0;i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i = 0;i<arr.length;i++) {
			if(i<arr.length-1) {
				System.out.print(arr[i]+" ");
				}
				else {
					System.out.println(arr[i]);
				}
		}
		
	}
	//ɾ��
	public static int[] function(int []arr) {
		int count = 0;
		for(int i = 0;i < arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					count++;
					break;
				}
			}
		}
		System.out.println("�ظ�����Ϊ��"+count);
		
		
		//ɾ���ظ�Ԫ��
		int index = 0;
		int arr1[] = new int[arr.length - count];
		for(int i = 0;i<arr.length;i++) {
			int temp = arr[i];
			boolean b = false;   //bΪ��ǣ�false��ʾ����������Ԫ�ز����
			for(int j = 0;j<arr1.length;j++) {
				if(arr1[j] == temp) {
					b = true;
					break;
				}
			}
			if(!b) {
				arr1[index++] = temp;
			}
		}
		return arr1;
	}

}

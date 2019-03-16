package mypratice;
/*
 * 需求：编写一个数组的工具类
 * 		Arrays.toString()
 * 		sort()
 */
//数组工具类
class ArrayTool{
	

	public static String toString(int [] arr) {
		String result = "";
		for(int i= 0;i<arr.length;i++) {
			if(i == 0) {
				result += "["+arr[i]+","; 
			}else if(i == (arr.length-1)) {
				result += arr[i]+"]";
			}else {
				result += arr[i]+",";
			}
		}
		return result;	
	}
	
	public static void sort(int [] arr) {
		for(int i = 1;i < arr.length;i++) {
			for(int j = 0;j < arr.length-i;j++) {
				if(arr[j] > arr[j+1]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
}
public class Demo13 {
	
		public static void main(String[] args) {
			int [] arr = {12,1,5,4,6,8,1,3};
			//ArrayTool a = new ArrayTool();
			ArrayTool.sort(arr);
			String info = ArrayTool.toString(arr);
			System.out.println(info);
		}
}

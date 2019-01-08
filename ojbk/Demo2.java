package ojbk;
/*
 * 数组遍历以及复制
 */
public class Demo2 {
	public static void main(String [] args) {
		int [] arr = new int[10];
		System.out.println("复制前数组元素：");
		for(int i = 0;i<arr.length;i++) {
			arr[i] = i+1;
		}
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		int [] arr1 = new int[5];
		System.arraycopy(arr, 6, arr1, 1,4);
		System.out.println("复制后数组长度");
		for(int i = 0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
	}
}

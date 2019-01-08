package ojbk;

import java.util.Arrays;

public class Demo3 {
	public static void main(String [] args) {
		int [][] arr = new int [3][];
		arr[0] = new int [] {1,2};
		arr[1] = new int [] {1,2,3,5};
		arr[2] = new int [] {1,2,6,7};
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(arr[2][3]);
		System.out.println(arr.length);
		System.out.println(arr[0].length);
	}
}

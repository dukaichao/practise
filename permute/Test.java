package permute;

import java.util.Arrays;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-05-08
 * Time:0:16
 */
public class Test {

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int length = arr.length;
        int n = getN(length);
        for(int i = 0;i<n-1;i++){
            arr = findNearestNumber(arr);
            System.out.println(Arrays.toString(arr));
        }
    }

    public static int getN(int length){
        if(length == 1){
            return length;
        }
        return length*getN(length-1);
    }

    public static int[] findNearestNumber(int[] arr){
        if(returnIndex(arr) == 0) return null;
        int index = returnIndex(arr)-1;
        for(int i = arr.length-1;i>index;i--){
            if(arr[index]<arr[i]){
                int tmp = arr[index];
                arr[index] = arr[i];
                arr[i] = tmp;
                break;
            }
        }
        reverseArr(arr,index+1,arr.length-1);
        return arr;

    }

    //逆序
    public static void reverseArr(int[] arr,int start,int end){
        while(start<=end){
            int tmp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = tmp;
        }
    }
    //从后向前遍历找出arr[i]<arr[i-1]的下标i
    public static int returnIndex(int[] arr){
        for (int i = arr.length-1; i >0 ; i--) {
            if(arr[i]>arr[i-1]){
                return i;
            }
        }
        return 0;
    }
}

package getpermutation;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:给出集合 [1,2,3,…,n]，其所有元素共有 n! 种排列。
 * 按大小顺序列出所有排列情况，并一一标记，当 n = 3 时, 所有排列如下：
 * "123"
 * "132"
 * "213"
 * "231"
 * "312"
 * "321"
 * 给定 n 和 k，返回第 k 个排列。
 *
 * 说明：
 *
 * 给定 n 的范围是 [1, 9]。
 * 给定 k 的范围是[1,  n!]。
 * 示例 1:
 *
 * 输入: n = 3, k = 3
 * 输出: "213"
 * 示例 2:
 *
 * 输入: n = 4, k = 9
 * 输出: "2314"
 * User:Mr.Du
 * Date:2019-05-08
 * Time:1:59
 */
public class Test {
    public String getPermutation(int n, int k) {
        int[] arr = new int[n];
        StringBuffer sb = new StringBuffer();
        for(int i = 0;i<n;i++){
            arr[i] = i + 1;
            sb.append(arr[i]);
        }
        if(k == 1) return sb.toString();
        for(int i = 0;i<k-1;i++){
            arr = findNearestNumber(arr);
        }
        StringBuffer sb1 = new StringBuffer();
        for(int i:arr){
            sb1.append(i);
        }
        return sb1.toString();
    }

    //排列
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

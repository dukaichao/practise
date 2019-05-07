package permuteunique;

import java.util.*;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:给定一个可包含重复数字的序列，返回所有不重复的全排列。
 *
 * 示例:
 *
 * 输入: [1,1,2]
 * 输出:
 * [
 *   [1,1,2],
 *   [1,2,1],
 *   [2,1,1]
 * ]
 * User:Mr.Du
 * Date:2019-05-08
 * Time:1:35
 */
public class Test {
    public List<List<Integer>> permuteUnique(int[] nums){
        //数组进行排序
        Arrays.sort(nums);
        //获取数组长度
        int length = nums.length;
        //获取arr[i]>arr[i-1]的下标i
        int index = returnIndex(nums);
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        //获取排列组合数
        int n = getN(length);
        for(int i = 0;i<n;i++){
            List<Integer> list1 = new ArrayList<Integer>();
            //将原数组放入集合中
            if(i == 0){
                List<Integer> list2 = new ArrayList<Integer>();
                for(int j:nums){
                    list2.add(j);
                }
                list.add(list2);
            }
            //在nums.length~index区间找到比arr[index-1]值大的，并与之交换
            nums = findNearestNumber(nums);
            //如果数组为空，直接退出
            if(nums == null) break;
            //从下标index开始对数组进行排序，并赋给新数组array
            int[] array = sort(nums,index,nums.length-1);
            //将新数组值从index开始拷贝nums
            System.arraycopy(nums,index,array,0,array.length);
            for(int j:nums){
                list1.add(j);
            }
            list.add(list1);
        }
        return list;
    }
    public static int getN(int length){
        if(length == 1){
            return length;
        }
        return length*getN(length-1);
    }
    //在nums.length~index+1区间找到比arr[index]值大的，并与之交换
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
        //交换后从index+1开始到数组结尾进行逆序
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
    //从对应下标进行排序
    public static int[] sort(int[] arr,int start,int end){
        int[] array = new int[end-start+1];
        int index = 0;
        for(int i = start;i<=end;i++){
            array[index++] = arr[i];
        }
        Arrays.sort(array);
        return array;
    }
}

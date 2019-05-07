package nextpermutation;

import java.util.Arrays;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:实现获取下一个排列的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。
 * 如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
 * 必须原地修改，只允许使用额外常数空间。
 * 以下是一些例子，输入位于左侧列，其相应输出位于右侧列。
 * 1,2,3 → 1,3,2
 * 3,2,1 → 1,2,3
 * 1,1,5 → 1,5,1
 * 里面的数字可能重复
 * User:Mr.Du
 * Date:2019-05-08
 * Time:1:24
 */
public class Test {

    public void nextPermutation(int[] arr) {
        int index = getIndex(arr);
        if(index == 0) Arrays.sort(arr);
        else{
            for(int i = arr.length-1;i>=index;i--){
                if(arr[index-1]<arr[i]){
                    int tmp = arr[index-1];
                    arr[index - 1] = arr[i];
                    arr[i] = tmp;
                    break;
                }
            }
            reverse(arr,index,arr.length-1);
            //从index位置开始，对后面数字进行排序，并赋给新数组
            int[] array = sort(arr,index,arr.length-1);
            //将新数组值从index开始拷贝arr
            System.arraycopy(arr,index,array,0,array.length);
        }
        System.out.println(Arrays.toString(arr));
    }

    //找到arr[i]>arr[i-1]的下标i
    public static int getIndex(int[] arr){
        for(int i = arr.length-1;i>0;i--){
            if(arr[i]>arr[i-1]){
                return i;
            }
        }
        return 0;
    }
    //逆转交换后的边界区间
    public static void reverse(int[] arr,int start,int end){
        while(start<=end){
            int tmp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = tmp;
        }
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

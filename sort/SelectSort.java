package sort;

import java.util.Arrays;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-28
 * Time:18:50
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {5,2,5,4,0,6,5,4,2,5,4,2,5,6,3,6,22,4,3,21,7,8,10};
        //SmallHeapSort(arr);
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
        //BinaryInsertSort(arr);
        //selectSort1(arr);
       /* shell(arr);
        System.out.println(Arrays.toString(arr));*/
        /*selectSort(new int[]{1,2,5,4,2,4,3,21});
        SmallHeapSort(new int[]{1,2,5,4,2,4,3,21});
        heapSort(new int[]{1,2,5,4,2,4,3,21});*/
        /*int[] arr = {1,2,5,4,2,4,3,21};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));*/
    }

    public static void shell(int[] arr){
        int h = 0;
        while(h<arr.length/3){
            h = 3 * h + 1;
        }

        while(h>0){
            for(int i = h;i<arr.length;i++){
                int tmp = arr[i];
                int j = i-h;
                while(j>=0&&arr[j]>tmp){
                    arr[j+h] = arr[j];
                    j -= h;
                }
                arr[j+h] = tmp;
            }
            h = (h-1)/3;
        }
    }

    public static void selectSort1(int[] arr){
        for(int i = 0;i<arr.length-1;i++){
            int j = i;
            int k = i+1;
            for (; k < arr.length; k++) {
                if(arr[k]<=arr[j]){
                    j = k;
                }
            }
            if(i!=j) {
                swap(arr,i,j);
            }
        }
    }

    public static void swap(int[] arr,int i,int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void BinaryInsertSort(int[] arr) {
        for(int i = 1;i<arr.length;i++) {
            if(arr[i]<arr[i-1]) {
                int t = arr[i];
                int low = 0;
                int high = i - 1;
                while(low<=high) {   //判断插入位置
                    int mid = (high-low)/2+low;
                    if(t<arr[mid]) {
                        high = mid - 1; //插入位置在低半区
                    }else {
                        low = mid + 1;//插入位置在高半区
                    }
                }
                for(int j = i-1;j>=high+1;j--) {  //从low+1位置处开始
                    arr[j+1] = arr[j];
                }
                arr[high+1] = t;
            }
        }
    }
    public static void selectSort(int[] arr){
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void SmallHeapOne(int[] arr, int len, int k) {
        int left = 2*k + 1;   //左孩子
        int right = 2*k + 2;  //右孩子
        if(left >= len && right >= len)        //已经是叶子
            return;
        int tmp1 = Integer.MAX_VALUE;
        int tmp2 = Integer.MAX_VALUE;
        if(left < len)
            tmp1 = arr[left];
        if(right < len)
            tmp2 = arr[right];

        if(tmp1 > arr[k] && tmp2 > arr[k])    //满足要求，直接返回
            return;

        //找到左右孩子数最小的交换
        if(tmp1 < tmp2) {
            int tmp = arr[k];
            arr[k] = arr[left];
            arr[left] = tmp;
            SmallHeapOne(arr,len,left);
        }else {
            int tmp = arr[k];
            arr[k] = arr[right];
            arr[right] = tmp;
            SmallHeapOne(arr,len,right);
        }
    }

    public static void SmallHeapSort(int[] arr) {
        //建立初始堆
        for (int i = (arr.length - 1) / 2; i >= 0; i--) {
            SmallHeapOne(arr, arr.length, i);
        }
        int len = arr.length;
        while(len>0) {
            System.out.print(arr[0]+" ");
            arr[0] = arr[len - 1];
            len--;
            SmallHeapOne(arr,len,0);
        }
        System.out.println();
    }

    public static void adjust(int[] arr,int start,int end){
        int left = 2*start+1;
        int right = 2*start+2;
        int tmp1 = Integer.MAX_VALUE;
        int tmp2 = Integer.MAX_VALUE;
        if(left>=end && right>=end) return;
        if(left<end) tmp1 = arr[left];
        if(right<end) tmp2 = arr[right];
        if(tmp1>arr[start]&&tmp2>arr[start]) return;
        if(tmp1<tmp2){
            int tmp = arr[start];
            arr[start] = arr[left];
            arr[left] = tmp;
            adjust(arr,left,end);
        }else{
            int tmp = arr[start];
            arr[start] = arr[right];
            arr[right] = tmp;
            adjust(arr,right,end);
        }
    }

    public static void heapSort(int[] arr){
        for (int i = (arr.length - 1) / 2; i >= 0; i--) {
            adjust(arr, i, arr.length);
        }
        /*int len = arr.length;
        while(len>0) {
            System.out.print(arr[0]+" ");
            arr[0] = arr[len - 1];
            len--;
            adjust(arr,0,len);
        }
        System.out.println();*/
        int len = arr.length;
        while(len>0){
            swap(arr,0,len-1);
            len--;
            adjust(arr,0,len);
        }
    }


    public static void quickSort(int[] arr,int head,int tail){
        int low = head;
        int high = tail;
        if(low<high) {
            int tmp = arr[low];
            while (low < high) {
                while (low < high && arr[high] >= tmp) {
                    high--;
                }
                if (low < high) {
                    arr[low] = arr[high];
                    low++;
                }
                while (low < high && arr[low] <= tmp) {
                    low++;
                }
                if (low < high) {
                    arr[high] = arr[low];
                    high--;
                }
            }
            arr[high] = tmp;
            quickSort(arr, head, high - 1);
            quickSort(arr, high + 1, tail);
        }
    }

    public static void BigHeapOne(int[] arr, int len, int k) {
        int left = 2*k + 1;   //左孩子
        int right = 2*k + 2;  //右孩子
        if(left >= len && right >= len)        //已经是叶子
            return;
        int tmp1 = Integer.MIN_VALUE;
        int tmp2 = Integer.MIN_VALUE;
        if(left < len)
            tmp1 = arr[left];
        if(right < len)
            tmp2 = arr[right];

        if(tmp1 < arr[k] && tmp2 < arr[k])    //满足要求，直接返回
            return;

        //找到左右孩子数最小的交换
        if(tmp1 > tmp2) {
            int tmp = arr[k];
            arr[k] = arr[left];
            arr[left] = tmp;
            BigHeapOne(arr,len,left);
        }else {
            int tmp = arr[k];
            arr[k] = arr[right];
            arr[right] = tmp;
            BigHeapOne(arr,len,right);
        }

    }
    public static void BigHeapSort(int[] arr) {
        //建立初始堆
        for(int i = (arr.length - 1)/2;i>=0;i--) {
            BigHeapOne(arr,arr.length,i);
        }
        //边输出堆顶边调整
        int len = arr.length;
        while(len>0) {
            System.out.print(arr[0]+" ");
            arr[0] = arr[len - 1];
            len--;
            BigHeapOne(arr,len,0);
        }
        System.out.println();
    }
}

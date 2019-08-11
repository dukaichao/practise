package com.dkc.sort.dd;

import java.util.Arrays;
import java.util.Random;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019/8/11
 * Time:19:46
 */
public class Dd implements Bscl{
    static Random r = new Random();
    public static void main(String[] args) {
        int[] arr = new int[100];
        for(int i = 0;i<arr.length;i++){
            arr[i] = r.nextInt(arr.length * 10);
        }
        int[] arr1 = {6, 3, 14, 20, 55, 71, 32, 83, 107, 27, 112, 11, 146, 149, 151, 152, 163, 162, 167, 132, 171, 191, 198, 213, 236, 254, 254, 284, 262, 292, 296, 309, 344, 357, 367, 374, 258, 386, 410, 412, 328, 417, 417, 426, 430, 433, 456, 453, 457, 467, 491, 505, 461, 513, 514, 541, 548, 549, 557, 560, 549, 584, 594, 600, 606, 636, 650, 606, 679, 686, 689, 717, 756, 731, 759, 759, 769, 778, 760, 786, 788, 788, 787, 799, 827, 873, 890, 891, 894, 809, 905, 905, 919, 911, 954, 943, 969, 950, 981, 612};
        new Dd().quickSortInternal3(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    @Override
    public void bubbleSort(int[] arr) {
        for(int i = 1;i<arr.length;i++){
            for(int j = 0;j<arr.length - i ;j++){
                if(arr[j]>arr[j+1]) swap(arr,j,j+1);
            }
        }
    }

    @Override
    public void insertSort(int[] arr) {
        for(int i = 1;i<arr.length;i++){
            int tmp = arr[i];
            int j = i-1;
            while(j>=0){
                if(arr[j]>tmp){
                    arr[j+1] = arr[j];
                }else break;
                j--;
            }
            arr[j+1] = tmp;
        }
    }

    @Override
    public void selectSort(int[] arr) {
        for(int i = 0;i<arr.length;i++){
            int tmp = arr[i];
            int k = i;
            int j = i + 1;
            while(j<arr.length){
                if(arr[j]<tmp){
                    tmp = arr[j];
                    k = j;
                }
                j++;
            }
            if(k!=i) swap(arr,i,k);
        }
    }

    @Override
    public void shellSort(int[] arr) {

    }

    @Override
    public void quickSort(int[] arr, int start, int end) {
        if(start<end){
            int low = start;
            int high = end;
            int tmp = arr[low];
            while(low<high){
                while(arr[high] > tmp && low < high) high--;
                if(low < high) arr[low++] = arr[high];
                while(arr[low] < tmp && low < high) low++;
                if(low < high) arr[high--] = arr[low];
            }
            arr[low] = tmp;
            quickSort(arr,start,low-1);
            quickSort(arr,low+1,end);
        }

    }

    @Override
    public void heapSort(int[] arr) {
        for(int i = (arr.length - 1) / 2;i>=0;i--){
            adjustBigHeap(arr,i,arr.length);
        }
        int len = arr.length;
        while(len>0){
            swap(arr,0,len-1);
            len--;
            adjustBigHeap(arr,0,len);
        }
    }

    private void adjustBigHeap(int[] arr, int i, int length) {
        int par = i;
        int lc = 2 * par + 1;
        while(lc<length){
            if(lc + 1<length && arr[lc] < arr[lc+1]){
                lc++;
            }
            if(arr[lc] > arr[par])
                swap(arr,lc,par);
            par = lc;
            lc = 2 * par + 1;
        }
    }

    @Override
    public void mergeSort(int[] arr, int start, int end) {
        if(start>=end) return;
        int mid = start + (end - start) / 2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);
        merge(arr,start,mid,end);
    }

    private void merge(int[] arr, int start, int mid, int end) {
        int[] tmp = new int[end - start + 1];
        int index = 0;
        int p = start;
        int q = mid + 1;
        while(p <= mid && q <= end){
            if(arr[p] < arr[q]){
                tmp[index++] = arr[p++];
            }else{
                tmp[index++] = arr[q++];
            }
        }
        while(p <= mid) tmp[index++] = arr[p++];
        while(q <= end) tmp[index++] = arr[q++];
        System.arraycopy(tmp,0,arr,start,tmp.length);
    }

    @Override
    public void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public  void quickSortInternal3(int[] arr,int l,int r) {
        if(l >= r) return;
        //随机生成一个下标，
        int index = (int)(Math.random() * (r - l + 1) + l);
        //交换l和index值
        swap(arr,index,l);
        //基准值
        int v = arr[l];
        //lt表示arr[l+1......lt]<v的最大边界
        int lt = l;
        //gt表示当前比较数组的便捷值也就是r
        int gt = r;
        //i开始下标
        int i = l + 1;
        while(i <= gt){
            if(arr[i] < v){
                swap(arr,lt + 1,i);
                lt++;
                i++;
            }else if(arr[i] > v){
                swap(arr,i,gt--);
            }else{
                i++;
            }
        }
        swap(arr,lt,l);
        quickSortInternal3(arr,l,lt - 1);
        quickSortInternal3(arr,gt,r);
    }


}

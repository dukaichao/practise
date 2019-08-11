package com.dkc.sort.dd;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019/8/11
 * Time:19:47
 */
public interface Bscl {

    public void bubbleSort(int[] arr);

    public void insertSort(int[] arr);

    public void selectSort(int[] arr);

    public void shellSort(int[] arr);

    public void quickSort(int[] arr,int start,int end);

    public void heapSort(int[] arr);

    public void mergeSort(int[] arr,int start,int end);

    public void swap(int[] arr,int i,int j);
}

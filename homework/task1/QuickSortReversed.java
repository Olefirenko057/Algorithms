package org.example.lesson6.homework.task1;

import java.util.Arrays;

public class QuickSortReversed {
    public static void main(String[] args) {
        int[] arr = {3, 10, 5, 17, 13, 11, 20, 18};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int arr[],int start,int end) {
        if(start >= end) {
            return;
        }
        int res = partitioning(arr,start,end);
        sort(arr,start,res - 1);
        sort(arr,res + 1,end);
    }
    public static int partitioning(int[] arr,int start,int end) {
        int pivot = arr[end];
        int currentIndex = start;
        for (int i = start; i < end ; i++) {
            if(arr[i] > pivot) {
                swap(arr,i,currentIndex);
                currentIndex++;
            }
        }
        swap(arr,end,currentIndex);
        return currentIndex;
    }

    public static void swap(int[] arr,int firstElement,int secondElement) {
        int temp = arr[firstElement];
        arr[firstElement] = arr[secondElement];
        arr[secondElement] = temp;
    }
}

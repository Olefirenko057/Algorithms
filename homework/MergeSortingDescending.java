package org.example.lesson5.homework;

import java.util.Arrays;

public class MergeSortingDescending {
    public static void main(String[] args) {
        int[] arr = {30,10,15,2,45,8,1,13};
        sortArrayDesc(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortArrayDesc(int[] arr) {
        if(arr.length == 1) {
            return ;
        }
        int mid = arr.length % 2 == 0 ? arr.length/2 : arr.length/2 + 1;
        int[] arrLeft = new int[mid];
        int[] arrRight = new int[arr.length - mid];
        for (int i = 0; i < mid; i++) {
            arrLeft[i] = arr[i];
        }
        for (int i = 0; i < arr.length - mid; i++) {
            arrRight[i] = arr[mid + i];
        }
        sortArrayDesc(arrLeft);
        sortArrayDesc(arrRight);
        applySort(arr,arrLeft,arrRight);
    }

    private static void applySort(int[] arr, int[] arrLeft, int[] arrRight) {
        int leftArrIndex = 0;
        int rightArrIndex = 0;
        int arrCurrentIndex = 0;
        while (leftArrIndex < arrLeft.length && rightArrIndex < arrRight.length) {
            if(arrLeft[leftArrIndex] < arrRight[rightArrIndex]) {
                arr[arrCurrentIndex] = arrRight[rightArrIndex];
                arrCurrentIndex++;
                rightArrIndex++;
            } else {
                arr[arrCurrentIndex] = arrLeft[leftArrIndex];
                arrCurrentIndex++;
                leftArrIndex++;
            }
        }

        while (leftArrIndex < arrLeft.length) {
            arr[arrCurrentIndex] = arrLeft[leftArrIndex];
            arrCurrentIndex++;
            leftArrIndex++;
        }
        while (rightArrIndex < arrRight.length) {
            arr[arrCurrentIndex] = arrRight[rightArrIndex];
            arrCurrentIndex++;
            rightArrIndex++;
        }
    }
}

package org.example.lesson6.homework.task3;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Queue;

public class QuickSortIteration {
    public static void main(String[] args) throws InterruptedException {
        int[] arr = {3, 10, 8, 33, 21, 57, 25};
        int[] arr2 = {2, 3, 5, 4};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static void sort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(0);
        queue.offer(arr.length - 1);
        while (!queue.isEmpty()) {
            int start = queue.poll();
            int end = queue.poll();
            if (start >= end) {
                continue;
            }
            int res = partition(arr, start, end);
            queue.offer(start);
            queue.offer(res - 1);
            queue.offer(res + 1);
            queue.offer(end);
        }
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int pivotIndex = start - 1;
        for (int i = start; i < end; i++) {
            if (arr[i] < pivot) {
                pivotIndex++;
                swap(arr, pivotIndex, i);
            }
        }
        swap(arr, pivotIndex + 1, end);
        return pivotIndex + 1;
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}


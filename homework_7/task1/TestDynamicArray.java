package org.example.lesson7.homework_7.task1;

public class TestDynamicArray {
    public static void main(String[] args) {
        DynamicArray array = new DynamicArray();
        System.out.println(array.add(5));
        System.out.println(array.add(20, 20));
        System.out.println(array.add(3));
        System.out.println(array.add(new int[]{4, 10, 20, 12}));
        System.out.println(array.add(3,new int[]{8, 20, 40, 24}));
        System.out.println(array.getArr().length);
        System.out.println(array.remove());
        System.out.println(array.removeByIndex(5));
        System.out.println(array);
        System.out.println(array.removeByIndex(array.getCount()));
        System.out.println(array.removeByValue(3));
        System.out.println(array);
        System.out.println(array.removeByValue(30));
        System.out.println(array);
    }
}

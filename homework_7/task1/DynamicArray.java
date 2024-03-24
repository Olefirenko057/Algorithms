package org.example.lesson7.homework_7.task1;

import java.util.Arrays;

public class DynamicArray {
    private int[] arr;
    private int size;
    private int count;

    public int[] grow(int appendUnits) {
        this.size = appendUnits;
        return this.arr = Arrays.copyOf(this.arr,this.size);
    }
    public int[] shrinkSize() {
        return this.arr = Arrays.copyOf(this.arr,this.count);
    }
    public boolean add(int value) {
        try {
            if(this.count >= this.size) {
                grow(this.size * 2);
            }
            this.arr[this.count] = value;
            this.count++;
            return true;
        } catch (RuntimeException e) {
            return false;
        }
    }
    public boolean add(int index,int value) {
        try {
            if(this.count >= this.size) {
                grow(this.size * 2);
            }
            for (int i = this.count - 1; i >= index ; i--) {
                this.arr[i + 1] = this.arr[i];
            }
            this.arr[index] = value;
            this.count++;
            return true;
        } catch (RuntimeException e) {
            return false;
        }
    }
    public boolean add(int[] arr) {
        try {
            if(this.count + arr.length >= this.size) {
                grow(this.size  + arr.length);
            }
            for (int i = 0; i < arr.length ; i++) {
                this.arr[count] = arr[i];
                count++;
            }
            return true;
        } catch (RuntimeException e) {
            return false;
        }
    }
    public boolean add(int index,int[] arr) {
        try {
            if(this.count + arr.length >= this.size) {
                grow(this.size  + arr.length);
            }
            for (int i = this.count; i >= index ; i--) {
                this.arr[i + arr.length] = this.arr[i];
            }
            for (int i = 0; i < arr.length; i++) {
                this.arr[index++] = arr[i];
                count++;
            }
            return true;
        }  catch (RuntimeException e) {
            return false;
        }
    }
    public boolean remove() {
        if(this.count > 0) {
            this.arr[this.count - 1] = 0;
            count--;
            return true;
        }
        return false;
    }

    public boolean removeByIndex(int index) {
        try {
            for (int i = index; i < this.count - 1 ; i++) {
                this.arr[i] = this.arr[i + 1];
            }
            count--;
            return true;
        }  catch (RuntimeException e) {
            return false;
        }
    }
    public boolean removeByValue(int value) {
        for (int i = 0; i < this.count; i++) {
            if(this.arr[i] == value) {
                return removeByIndex(i);
            }
        }
        return false;
    }

    public DynamicArray() {
        this.size = 10;
        arr = new int[this.size];
    }

    public int[] getArr() {
        return arr;
    }

    public int getSize() {
        return size;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return Arrays.toString(shrinkSize());
    }
}

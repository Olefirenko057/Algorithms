package org.example.lesson6.homework.task2;

public class IsPrimeNumber {
    //2. Написать проверку числа "простое" ли оно, используя итерационный подход. (не рекурсия)
    public static void main(String[] args) {
        System.out.println(isPrime(18));
    }

    public static boolean isPrime(int num) {
        if(num < 1) {
            return false;
        }
        for (int i = num - 1; i > 1; i--) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }

}

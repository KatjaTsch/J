package Pr_01;

/*Вывести все простые числа от 1 до 1000 (числа, которые 
делятся только на 1 и на себя без остатка) */

import java.util.Scanner;

public class pr_003 {
    public static void main(String[] args) {
        ex4();
        
    }
    static void ex4(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n;{
        for (int i = 1; i <=1000; i++){
        System.out.println(i % 1 == 0 || i % i == 0);
        }
        }
    }
}
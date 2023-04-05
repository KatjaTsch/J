package Pr_01;
/*Вычислить n-ое треугольного число (сумма чисел от 1 до n) */

import java.util.Scanner;

public class pr_001 {
    public static void main(String[] args) {
        ex0();
    }
    static void ex0(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();
        int N = 0;  
    for(int i = 0; i <= n; i++){
N = n*(n+1)/2;
    }
System.out.println("Сумма треугольных чисел = " + N);
}
}
package Pr_01;
/*Вычислить n! (произведение чисел от 1 до n) */

import java.util.Scanner;

public class pr_002 {
    public static void main(String[] args) {
        System.out.println(ex0());
        ex0();
    }
    static int ex0(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();
        int N = 1;
        for(int i = 1; i <= n; i++){
    N = N*i;
    }
    return N;
}
}
/*Реализовать простой калькулятор 
(введите первое число, введите второе число, введите требуемую операцию, ответ)
*/


package Pr_01;
import java.util.Scanner;

public class pr_004 {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1,num2,operation);
        System.out.println("Результат операции: "+result);
    }
   public static int getInt(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите число : ");
    int num = scanner.nextInt();
            
    }
    public static char getOperation(){
        System.out.println("Введите действие: ");
        char operation;
    }

    public static int calc(int num1, int num2, char operation){
int result;
switch (operation){
case '+':
    result = num1+num2;
    break;
case '-':
    result = num1-num2;
    break;
case '*':
    result = num1*num2;
    break;
case '/':
    result = num1/num2;
    break;   
    }
return result;
}
}
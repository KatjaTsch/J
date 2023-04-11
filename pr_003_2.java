import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*Задан целочисленный список ArrayList. 
Найти минимальное, максимальное и среднее арифметическое из этого списка. 
Collections.max() */

public class pr_003_2 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        Random rnd = new Random();
        // double a = Math.random();
        for (int i = 0; i < 5; i++) {
            arr.add(rnd.nextInt(4) + 1);
        }
        System.out.println(arr);

        System.out.println(Collections.min(arr));
        System.out.println(Collections.max(arr));
        double avg = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += i;
            avg = sum / arr.size();
        }
        System.out.println(avg);

    }
}

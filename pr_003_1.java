import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*Пусть дан произвольный список целых чисел, удалить из него четные числа */

public class pr_003_1 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        Random rnd = new Random();
        // double a = Math.random();
        for (int i = 0; i < 9; i++) {
            arr.add(rnd.nextInt(10) + 1);
        }
        System.out.println(arr);

        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 0) {
                arr.remove(i);
                
                System.out.println(arr);

            }
        }
    }
}

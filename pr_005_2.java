import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/*
 * Пусть дан список сотрудников: Иван Иванов, Светлана Петрова, 
 * Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, 
 * Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, 
 * Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов. Написать программу, 
 * которая найдет и выведет повторяющиеся имена с количеством повторений. 
 * Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.
 */

public class pr_005_2 {
  public static void main(String[] args) {
    ex3("Иван Иванов \n" +
        "Светлана Петрова \n" +
        "Кристина Белова \n" +
        "Анна Мусина \n" +
        "Анна Крутова \n" +
        "Иван Юрин \n" +
        "Петр Лыков \n" +
        "Павел Чернов \n" +
        "Петр Чернышов \n" +
        "Мария Федорова \n" +
        "Марина Светлова \n" +
        "Мария Савина \n" +
        "Мария Рыкова \n" +
        "Марина Лугова \n" +
        "Анна Владимирова \n" +
        "Иван Мечников \n" +
        "Петр Петин \n" +
        "Иван Ежов \n");
  }

  static void ex3(String s) {
    s = s.replace("\n", "");
    Map<String, Integer> map = new TreeMap<>(Collections.reverseOrder());
    String[] arr = s.split(" ");
    for (int i = 0; i <= arr.length - 1; i++) {
      if (map.containsKey(arr[i])) {
        int count = map.get(arr[i]);
        map.put(arr[i], count + 1);
      } else {
        map.put(arr[i], 1);
      }
    }
    System.out.println(map);
    
  }
}


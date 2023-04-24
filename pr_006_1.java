import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * Подумать над структурой класса Ноутбук для магазина техники - 
 * выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий 
или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. 
Критерии фильтрации можно хранить в Map. Например: “Введите цифру, 
соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - 
сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
 */

public class pr_006_1 {
    public static void main(String[] args) {
        Set<Notebooks> set = new HashSet<>();
        set.add(new Notebooks("Notebook 1", 8, "Windows10", 80000, "HP"));
        set.add(new Notebooks("Notebook 2", 16, "Windows10", 85000, "Asus"));
        set.add(new Notebooks("Notebook 3", 32, "linux", 85000, "Lenovo"));
        set.add(new Notebooks("Notebook 4", 64, "linux", 90000, "Lenovo"));


        OperationWNotebook operation = new OperationWNotebook(set);
        operation.start();

    }
}

    
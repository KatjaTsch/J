import java.util.LinkedList;
import java.util.Queue;

/*Реализуйте очередь с помощью LinkedList со следующими методами:
• enqueue() — помещает элемент в конец очереди,
• dequeue() — возвращает первый элемент из очереди и удаляет его,
• first() — возвращает первый элемент из очереди, не удаляя. */

public class pr_004_2 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.enqueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        queue.deQueue();

    }

    void enqueue(int element) {
        int SIZE = 5;
        int items[] = new int[SIZE];
        int front, rear;

    Queue() {
          front = -1;
          rear = -1;
        }

    boolean isFull() {
        if (front == 0 && rear == SIZE - 1) {
            return true;
        }
        return false;
    }

    boolean isEmpty() {
        if (front == -1)
            return true;
        else
            return false;
    }

    void enQueue(int element) {
        if (isFull()) {
            System.out.println("Очередь заполнена");
        } else {
            if (front == -1)
                front = 0;
            rear++;
            items[rear] = element;
            System.out.println("Добавлен элемент " + element);
        }
    }

    int deQueue() {
        int element;
        if (isEmpty()) {
            System.out.println("Очередь пуста");
            return (-1);
        } else {
            element = items[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            } 
            else {
                front++;
            }
            System.out.println("Удален элемент -> " + element);
            return (element);
        }
    }

    void display() {
          int i;
          if (isEmpty()) {
            System.out.println("Пустая очередь");
          } else {
            System.out.println("\nИндекс FRONT-> " + front);
            System.out.println("Элементы -> ");
            for (i = front; i <= rear; i++)
              System.out.print(items[i] + "  ");
      
            System.out.println("\nИндекс REAR-> " + rear);
          }
        }
    }
}
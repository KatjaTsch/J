/*Реализуйте структуру телефонной книги с помощью HashMap, 
учитывая, что 1 человек может иметь несколько телефонов. */


public class pr_005_1 {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        numbers.add("442233", "Ivanov");
        numbers.add("445537", "Vasiliev");
        numbers.add("223355", "Petrova");
        numbers.add("565689", "Ivanov");
        numbers.add("89456", "Petrova");
        numbers.add("345678", "Ivanov");

        numbers.getByName("Petrova");
    }
}

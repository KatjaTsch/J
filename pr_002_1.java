/*Дана json строка { { "фамилия":"Иванов","оценка":"5",
"предмет":"Математика"},{"фамилия":"Петрова","оценка":"4",
"предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}} 
Задача написать метод(ы), который распарсить строку и выдаст ответ вида: 
Студент Иванов получил 5 по предмету Математика. Студент Петрова получил 
4 по предмету Информатика. Студент Краснов получил 5 по предмету Физика. 
Используйте StringBuilder для подготовки ответа */

public class pr_002_1 {
    
    public static void main(String[] args) {
        
        String jsonString = {"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"}, {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}};
        System.out.println(ex3(jsonString));
    
    static String ex3(String jsonString){
        String [] temp = jsonString.split(" ");
        String res = "";
        for (int i = temp.length - 1; i >= 0; i--) {
            res += temp[i] + " ";
        }
        return res;
        }
        // StringBuilder stringBuilder = new StringBuilder();
        // for (int i = 0; i < temp.length - 1; i++){
        //     stringBuilder.append(res);
             
        }
        return stringBuilder.toString();
    }
    
    
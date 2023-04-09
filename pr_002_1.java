/*Дана json строка { { "фамилия":"Иванов","оценка":"5",
"предмет":"Математика"},{"фамилия":"Петрова","оценка":"4",
"предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}} 
Задача написать метод(ы), который распарсить строку и выдаст ответ вида: 
Студент Иванов получил 5 по предмету Математика. Студент Петрова получил 
4 по предмету Информатика. Студент Краснов получил 5 по предмету Физика. 
Используйте StringBuilder для подготовки ответа */

public class pr_002_1 {
    
    public static void main(String[] args) {
        
        String jsString = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
        "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
        "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        parsejsonString(jsString);
                
        
        }
        
        public static void parsejsonString (String jsString){
        StringBuilder stringBuilder = new StringBuilder();
        jsString = jsString.substring(1, jsString.length() - 1);
        String[] objects = jsString.split("},");
        
        
        for(String object :objects){
            object = object.replace("{", "").replace("}", "");
            String[] res = object.split(",");

            String surname = res[0].split(":")[1].replace("\"", " ");
            String grade = res[1].split(":")[1].replace("\"", " ");
            String less = res[2].split(":")[1].replace("\"", " ");

            stringBuilder.append("Студент").append(surname).append("получил").append(grade).append("по предмету").append(less).append("\n");
        }
        System.out.println(stringBuilder);



        // String [] temp = jsString.split("},");
        // String res = "";
        // for (int i = temp.length-1; i >= 0; i--) {
        // res += temp[i] + " ";{

        // }

    //         String [] temp = jsString.split(",");
    //         String res = "";
    //        for (int i = temp.length-1; i >= 0; i--) {
    //        res += temp[i] + " ";
    //        String output= res.replace(';',' ');
    // System.out.println(output);

            }
            
        }
           

                     
        
    
    
    
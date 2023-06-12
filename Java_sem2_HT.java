package Java_Seminar2.Java_Sem2_HomeTasks;

import java.security.Key;

public class Java_sem2_HT {
    public static void main(String[] args) {
    
    // 1) Дана строка sql-запроса "select * from students WHERE ". Сформируйте часть WHERE этого запроса, 
    // используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
    // Если значение null, то параметр не должен попадать в запрос.
    // Пример данной строки {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
    // Вывод: select * from students WHERE name=Ivanov AND country=Russia AND city=Moscow

    String jsonstr = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
    StringBuilder result = new StringBuilder("select * from students WHERE ");
    boolean flag = true;
    jsonstr = jsonstr.substring(1, jsonstr.length()-1);
    // System.out.println(jsonstr);
    String[] KeyValue = jsonstr.split(", ");
    // System.out.println(KeyValue[1]);
    for (int i = 0; i < KeyValue.length; i++) {
        KeyValue[i].replace("\"", ".");
        // System.out.print(KeyValue[i]);
        String[] pair = KeyValue[i].split(":");
        String key = pair[0];
        String value = pair[1];
        if(!value.equals("null")) {
            if (flag != true)  result.append(" AND ");
            result.append(key).append(" = ").append(value);
            flag = false;
        }
    }

    System.out.println(result);

    // 2) Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
    // 1 3 4 2
    // 1 3 2 4
    // 1 2 3 4



    }
}

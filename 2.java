/*
Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
Нужны методы добавления новой записи в книгу и метод поиска записей в телефонной книге.
 */
import java.util.*;
public class tbook {
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }

    }

    public static void printBook(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Иванов", 5555555, bookPhone);
        addNumber("Васильев", 4567899, bookPhone);
        addNumber("Петров", 1233214, bookPhone);
        addNumber("Иванов", 6666666, bookPhone);
        addNumber("Петров", 4356546, bookPhone);
        addNumber("Иванов", 7777777, bookPhone);
        printBook(bookPhone);
    }
}

/*
Пусть дан список сотрудников: Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин,
Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова,
Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов. Написать программу, которая найдет и выведет повторяющиеся имена
 с количеством повторений. Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.
 */
import java.util.*;
public class sort3map {
    public static void main(String[] args) {
        String str = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина,Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов";

        System.out.println(getSortNames(str));
    }

    public static Map getSortNames(String str) {
        String strmas[] = str.split(", ");
        HashMap<String, Integer> names = new HashMap<>();
        for (String it : strmas) {
            String name = it.split(" ")[0];
            if (names.containsKey(name)) {
                names.replace(name, names.get(name) + 1);
            } else {
                names.put(name, 1);
            }
        }

        TreeMap<Integer, List<String>> names2 = new TreeMap<>();
        for (String it : names.keySet()) {
            if (names2.containsKey(names.get(it))) {
                names2.get(names.get(it)).add(it);
            } else {
                List<String> list = new ArrayList<>();
                list.add(it);
                names2.put(names.get(it), list);
            }

        }
        return names2.descendingMap();
    }
}

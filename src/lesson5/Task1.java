package lesson5;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task1 {
    public static List<String> names() {
        String names = new String(
                "Иван Иванов, " +
                        "Светлана Петрова, " +
                        "Кристина Белова, " +
                        "Анна Мусина, " +
                        "Анна Крутова, " +
                        "Иван Юрин, " +
                        "Петр Лыков, " +
                        "Павел Чернов, " +
                        "Иван Иванов, " +
                        "Петр Чернышов, " +
                        "Мария Федорова, " +
                        "Марина Светлова, " +
                        "Мария Савина, " +
                        "Иван Иванов, " +
                        "Мария Рыкова, " +
                        "Анна Крутова, " +
                        "Марина Лугова, " +
                        "Анна Владимирова, " +
                        "Петр Лыков, " +
                        "Иван Мечников, " +
                        "Петр Петин, " +
                        "Петр Лыков, " +
                        "Иван Ежов");
        return List.of(names.split(", "));
    }

    public static Map<String, Integer> replay(List<String> staff) {
        Map<String, Integer> replayNameCount = new LinkedHashMap<>();

        for (String s : staff) {
            if (replayNameCount.containsKey(s)) {
                replayNameCount.put(s, replayNameCount.get(s) + 1);
            } else {
                replayNameCount.put(s, 1);
            }
        }

        Map<String, Integer> sortNames = replayNameCount.entrySet().stream()
                .sorted(Comparator.comparingInt(e -> -e.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> {
                            throw new AssertionError();
                        },
                        LinkedHashMap::new));
        return sortNames;
    }
}

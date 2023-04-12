package lesson5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task {
    public static HashMap<String, List<String>> addNameNumber() {
        HashMap<String, List<String>> contact;
        contact = new HashMap<>();
        contact.put("Павел", Arrays.asList("+7(913)1111111", "+7(384)5211111"));
        contact.put("Иван", Arrays.asList("+7(961)2222222", "+7(384)5222222"));
        contact.put("Сергей", Arrays.asList("+7(950)3333333", "+7(384)5233333"));
              return contact;
    }

    public static void PrintPhonebook (HashMap<String, List<String>> contacts) {
        for(Map.Entry<String, List<String>> k : contacts.entrySet()) {
            System.out.println(k.getKey()+": "+ k.getValue());
        }
    }
}

import lesson5.Task;

import static lesson5.Task.PrintPhonebook;
import static lesson5.Task1.names;
import static lesson5.Task1.replay;


public class Main {
    public static void main(String[] args) {
        PrintPhonebook(Task.addNameNumber());
        System.out.println(replay(names()));
    }
}

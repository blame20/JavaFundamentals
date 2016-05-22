import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import static org.omg.IOP.TAG_ORB_TYPE.value;

public class MostFrequentWord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().toLowerCase().split("\\W+");
        TreeMap<String, Integer> counter = new TreeMap<>();

        for (String word : words) {
            Integer numbers = counter.get(word);
            if (numbers == null) {
                numbers = 0;
            }
            counter.put(word, numbers + 1);
        }
        int max = 0;
        for (Object result : counter.values()) {
            if (max < (Integer) result) {
                max = (Integer) result;
            }
        }
        for (Map.Entry<String, Integer> enter : counter.entrySet()) {
            if (enter.getValue() == max) {
                System.out.printf("%s -> %d times\n", enter.getKey(), enter.getValue());
            }
        }
    }
}

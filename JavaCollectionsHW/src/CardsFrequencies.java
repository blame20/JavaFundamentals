import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CardsFrequencies {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] cards = scanner.nextLine().split("\\W+");
        LinkedHashMap<String, Integer> cardsMap = new LinkedHashMap<>();
        int counter = 0;
        for (String card : cards) {
            Integer forCount = cardsMap.get(card);
            if (forCount == null) {
                forCount = 0;
            }
            cardsMap.put(card, forCount + 1);
            counter++;
        }
        for (Map.Entry<String, Integer> enter : cardsMap.entrySet()) {
            double result = ((double)enter.getValue() / (double)counter) * 100;
            System.out.printf("%s -> %.2f", enter.getKey(), result);
            System.out.print("%\r\n");
        }
    }
}

package files;

import java.io.*;
import java.util.*;

/**
 * Fetch file resources/plik1.txt
 * on stn out print
 * 5 most frequent words associated with number of each occurrence
 */
public class Excercise4 {

    public static void main(String[] args) {

        File filePath = new File("C:\\Users\\Bogdan\\Desktop\\excercises\\src\\main\\resources\\plik1.txt");

        Map<String, Integer> map = new HashMap<>();
        try (BufferedReader bufferIn = new BufferedReader(new FileReader(filePath))) {
            String str;
            while ((str = bufferIn.readLine()) != null) {
                for (String word : str.split("[.:,;!\\p{javaSpaceChar}]")) {
                    if (map.containsKey(word)) {
                        map.replace(word, map.get(word) + 1);
                    } else {
                        map.put(word, 1);
                    }
                }
            }


        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku");
        } catch (IOException e) {
            System.out.println("Wystapil blad wejscia-wyjscia");
        }

        Map<String, Integer> sortedMap = sortByValue(map);

        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println("Słowo : " + entry.getKey() + " Value : " + entry.getValue());
        }

    }

    private static Map<String, Integer> sortByValue(Map<String, Integer> unsortMap) {

        // 1. Convert Map to List of Map
        List<Map.Entry<String, Integer>> list =
                new LinkedList<Map.Entry<String, Integer>>(unsortMap.entrySet());

        // 2. Sort list with Collections.sort(), provide a custom Comparator
        //    Try switch the o1 o2 position for a different order
        Collections.sort(list, (o1, o2) -> (o1.getValue()).compareTo(o2.getValue()));

        // 3. Loop the sorted list and put it into a new insertion order Map LinkedHashMap
        Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();

        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }

}

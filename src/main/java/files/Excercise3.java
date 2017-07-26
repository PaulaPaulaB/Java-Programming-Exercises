package files;

import java.io.*;

/**
 * Fetch file resources/plik1.txt
 * create file resources/plik1-copy-modulo.txt
 * with every third line from first line
 * use modulo operator
 */
public class Excercise3 {

    public static void main(String[] args) {
        File fileName = new File("C:\\Users\\Bogdan\\Desktop\\excercises\\src\\main\\resources\\plik1.txt");
        int i;
        String[] parts = fileName.getPath().split("\\.");
        String pathFileCopy = parts[0] + "kopia.txt";
        File copy = new File(pathFileCopy);
        try {
            copy.createNewFile();
        } catch (IOException e) {
            System.out.println("Wystapil blad wejscia-wyjscia");
        }
        try (
                BufferedReader bufferIn = new BufferedReader(new FileReader(fileName));
                PrintWriter printOut = new PrintWriter(copy)
        ) {
            String str;
            int counter = 0;
            while ((str = bufferIn.readLine()) != null) {
                counter++;
                if (counter % 3 == 0) {
                    printOut.printf("%s\n", str);
                    System.out.println("linia " + counter + " zawiera " + str);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku");
        } catch (IOException e) {
            System.out.println("Wystapil blad wejscia-wyjscia");
        }
    }
}

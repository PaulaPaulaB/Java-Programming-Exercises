package files;

import java.io.*;

/**
 * Fetch file resources/plik1.txt
 * create file resources/plik1-copy.txt with content from first file
 */
public class Excercise2 {

    public static void main(String[] args) {
        System.out.println("TODO-2!");

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

        try (FileInputStream fin = new FileInputStream(fileName);
             FileOutputStream fout = new FileOutputStream(copy)) {
            while ((i = fin.read()) != -1) {
                fout.write(i);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku");
        } catch (IOException e) {
            System.out.println("Wystapil blad wejscia-wyjscia");
        }
    }
}

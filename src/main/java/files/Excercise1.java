package files;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//on std out print all lines of file resources/plik1.txt
public class Excercise1 {

    public static void main(String[] args) {
        File fileName = new File("C:\\Users\\Bogdan\\Desktop\\excercises\\src\\main\\resources\\plik1.txt");
        int i;
        try (FileInputStream fin = new FileInputStream(fileName)) {
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku");
        } catch (IOException e) {
            System.out.println("Wystapil blad wejscia-wyjscia");
        }
    }

}




















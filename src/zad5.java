import java.io.File;
import java.io.FileNotFoundException;  // Magiczny zapis
import java.util.Scanner;
import java.io.PrintWriter;

/*
        Napisz program, w którym wprowadzisz w konsoli dowolne dane, następnie zapiszesz je do
        pliku. Odczytaj je z powrotem z pliku i bez użycia dodatkowej zmiennej wyświetl na ekranie.
*/

public class zad5 {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("pliczek.txt"); //Tworzymy obiekt do pliku
        PrintWriter zapis = new PrintWriter("pliczek.txt");
        zapis.println("ala ma kota");
        zapis.close();

        Scanner in = new Scanner(new File("pliczek.txt")); { // Snacerem odczytujemy dane z pliku


            System.out.println(in.nextLine()); }



    }
}
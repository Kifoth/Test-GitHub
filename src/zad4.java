import java.util.Scanner;
public class zad4 {
    public static void main(String[] args) {

        System.out.println("Wpisz wielkość tablicy");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        int[] array = new int[index];
        int counter =0;
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        int[] tablica = new int[index];
        int licznik = 0;
        while(licznik< tablica.length){
            tablica[licznik]= scanner.nextInt();
            licznik++;
        }
        System.out.println("Koniec pętli");
    }
}
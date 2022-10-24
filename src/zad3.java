import java.util.Scanner;
public class zad3  {
    public static void main(String[] args) {



        System.out.println("Wpisz wielkość tablicy");

        Scanner scanner = new Scanner(System.in); // tworze zmienna Scanner

        int index = scanner.nextInt();

        System.out.println(index);

        int[] tablica = new int[index];  // tu zaczyna sie tablica

        for (int i=0; i<tablica.length; i++) // tworze zmienna 0 dzieki ktorej startuje petle. Petla bedzie dzialac do momentu, az zmienna dojdzie do wielkosci tablicy. Zeby to osiagnac
        { tablica[i] = i+1;


        }
        int i = 0;
        while (i < tablica.length) { // petla dzieki ktorej wyswietla wszystkie zmienne z tablicy
            System.out.println(tablica[i++]);
        }
    }

}
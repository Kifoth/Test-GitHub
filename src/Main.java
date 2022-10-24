import java.util.Scanner;

public class Main {




            public static void main(String[] args) {


                int[] tab = new int[10];

                Scanner odczyt = new Scanner(System.in);
                //pobieranie danych
                for (int i=0; i<tab.length; i++) {
                    System.out.println("podaj liczbe");
                    tab[i] = odczyt.nextInt();
                }
                //wyświetlanie danych
                for(int i=0; i<tab.length; i++)
                    System.out.println("Liczba: "+tab[i]);




            }

        }





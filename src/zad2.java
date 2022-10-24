import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        System.out.println("Wpisz wielkość tablicy");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        int[] array = new int[index];
        int counter = 0;
        System.out.println("-----------------------------------------------------------------------------------------");
        while (counter < array.length) {
            System.out.println("Podaj liczbe:");
            array[counter] = scanner.nextInt();
            counter++;

        }
        counter = 0;
        System.out.println("-----------------------------------------------------------------------------------------");
        while (counter < array.length) {
            System.out.println(array[counter]);
            counter++;
        }


    }}
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue<Integer> numbers = new LinkedList<>();

        int sum = 0;
        int numberSize = 10;

        // WCZYTYWANIE LICZB
        for (int i = 0; i < numberSize; i++) {
            System.out.println("Podaj " + (i + 1) + " liczbę");
            numbers.offer(input.nextInt());

        }

        //WYSWIETLANIE LICZB
        for (int i = 0; i < numberSize; i++) {

            sum += numbers.peek();
            System.out.print(numbers.peek());
            numbers.poll();

            if (i + 1 == numberSize) {
                System.out.println(" = " + sum);
                break;
            } else {
                System.out.print(" + ");
            }
        }

    }
}




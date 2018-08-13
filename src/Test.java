import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue<Integer> numbers = new LinkedList<>();
        int[] holder = new int[10];
        int sum = 0;

        // WCZYTYWANIE LICZB
        for (int i = 0; i < 10; i++) {
            System.out.println("Podaj " + (i + 1) + " liczbę");
            numbers.offer(input.nextInt());
            sum += numbers.peek();
            holder[i] = numbers.peek();
            numbers.poll();
        }

        //WYSWIETLANIE LICZB
        for (int i = 0; i < holder.length; i++) {
            if (i == 9) {
                System.out.println(holder[i] + " = " + sum);
                break;
            }
            System.out.print(holder[i] + " + ");
        }
    }

}


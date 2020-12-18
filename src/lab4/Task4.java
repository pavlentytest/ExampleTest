package lab4;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {

        //Сумма элементов через цикл Do While
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Введите число: ");
        int i = 0;
        do {
            numbers[i] = scanner.nextInt();
            sum = sum + numbers[i];
            i++;
        } while (i < numbers.length);
        System.out.print("Сумма элементов = " + sum);
    }
}
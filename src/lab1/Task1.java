package lab1;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Сумма элементов массива через цикл For
        int sum = 0;
        //private static Scanner in = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Введите число: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.print("Сумма элементов = " + sum);
    }
}
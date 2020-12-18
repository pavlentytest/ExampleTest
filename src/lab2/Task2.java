package lab2;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        //Сумма элементво массива через цикл While
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Введите число: ");
        int i = 0;
        while (i < numbers.length) {
            numbers[i] = scanner.nextInt();
            sum = sum + numbers[i];
            i++;
        }
        System.out.print("Сумма элементов = " + sum);
    }
}
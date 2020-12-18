package lab8;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        int n, arr[];
        Scanner in = new Scanner(System.in);
        System.out.print("Размер массива: ");
        n = in.nextInt();
        arr = new int[n];
        for (int i = 0; i <= arr.length; i++)
            arr[i] = (int) (Math.random() * n);
        for (int i: arr)
            System.out.print(i + " ");
    }
}

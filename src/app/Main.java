import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static void printSquare(int n) {
        System.out.println("Квадрат числа " + n + " дорівнює " + (n * n) + ".");
    }

    static double cylinderVolume(double r, double h) {
        return Math.PI * r * r * h;
    }

    static int sum(int[] arr) {
        int s = 0;
        for (int x : arr) s += x;
        return s;
    }

    static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    static long power(int a, int b) {
        long res = 1;
        for (int i = 0; i < b; i++) res *= a;
        return res;
    }

    static void repeat(int n, String text) {
        for (int i = 0; i < n; i++) System.out.println(text);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1
        System.out.print("Введіть ціле число: ");
        printSquare(sc.nextInt());

        // 2
        double r = 3.5, h = 10.0;
        System.out.println("Об'єм циліндра з радіусом " + r + " і висотою " + h
                + " дорівнює " + cylinderVolume(r, h) + ".");

        // 3
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Масив чисел: " + Arrays.toString(arr));
        System.out.println("Сума всіх елементів масиву дорівнює " + sum(arr) + ".");

        // 4
        sc.nextLine();
        System.out.print("Введіть рядок: ");
        String str = sc.nextLine();
        System.out.println("Рядок в зворотньому порядку: " + reverse(str));

        // 5
        System.out.print("Введіть a: ");
        int a = sc.nextInt();
        System.out.print("Введіть b: ");
        int b = sc.nextInt();
        System.out.println("Результат " + a + "^" + b + " дорівнює " + power(a, b) + ".");

        // 6
        System.out.print("Введіть ціле число n: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.print("Введіть текстовий рядок: ");
        String text = sc.nextLine();
        repeat(n, text);
    }
}5
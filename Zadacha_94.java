import java.util.Scanner;
public class Zadacha_94 {
    private static int stepen(int a, int n) {
        if (n == 1) {
            return a;
        }
        return a * stepen(a, n - 1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число ");
        int a = in.nextInt();
        System.out.println("Введите степень ");
        int n = in.nextInt();
        System.out.println(stepen(a, n));
    }
}

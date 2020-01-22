import java.util.Scanner;
public class Zadacha_109 {
    private static int gcd(int X, int Y) {
        if (Y == 0) {
            return X;
        }
        else {
            return gcd(Y, X % Y);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int X = in.nextInt();
        int Y = in.nextInt();
        System.out.println(gcd(X, Y));
    }
}

import java.util.Scanner;

public class Activity5 {
    public static void main(String[] args) {
        int n;
        System.out.println("Input number n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println(n + "+" + (n * 11) + "+" + (n * 111) + "=" +(n + (n *11) + (n * 111)));

    }
}

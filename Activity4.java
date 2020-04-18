import java.util.Scanner;

public class Activity4 {
    public static void main(String[] args) {
        System.out.println("Input a number: ");
        int i, n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(i = 1; i <= 10; i++) {
            System.out.println(n + "x" + i + "=" + (n * i));
        }
    }
}

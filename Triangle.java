import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        System.out.println("Input height n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n + 1; i++) {
            for (int j = n; j > i; j--) {
                    System.out.print(" ");
            }
            for (int k = 0; k < (2 * i - 1) ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

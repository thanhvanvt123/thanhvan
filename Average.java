import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input n: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
        float avg = (float)sum / n ;
        System.out.println("Avg = " + avg);
    }
}

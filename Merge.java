import java.util.Scanner;

public class Merge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the first array: ");
        int n = sc.nextInt();

        int a[] = new int[n];
        for (int i = 0; i < n ; i++) {
            System.out.printf("Enter element of the a[%d] = ", i);
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the size of the second array: ");
        int m = sc.nextInt();

        int b[] = new int[m];
        for (int i = 0; i < m ; i++) {
            System.out.printf("Enter element of the b[%d] = ", i);
            b[i] = sc.nextInt();
        }
        int c[] = new int[n + m];
        int k = 0;

        for (int i = 0; i < n ; i++) {
            c[i] = a[i];
            k++;
        }

        for (int j = 0; j < m ; j++) {
            c[k++] = b[j];
        }
        System.out.println("Merge array: ");
        System.out.print("Length = " + (n + m) + ";" + "elements = ");
        for (int i = 0; i < (n + m); i++) {
            System.out.print(c[i] + " ");
        }
    }
}

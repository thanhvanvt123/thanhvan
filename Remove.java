import java.util.Scanner;

public class Remove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int a[] = new int[n];
        for (int i = 0; i < n ; i++) {
            System.out.printf("Enter element of the a[%d] = ", i);
            a[i] = sc.nextInt();
        }

        for(int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    for (int k = j + 1; k < n; k++) {
                        a[k - 1] = a[k];
                    }
                    n--;
                    j--;
                }
            }
        }
        for (int i = 0; i < n ; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

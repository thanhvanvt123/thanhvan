import java.util.Scanner;

public class Ex33 {
    public static void printArray(int a[]) {
        System.out.print("Length = " + a.length + ";" + "elements = ");
        for (int i = 0; i < a.length ; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int a[] = new int[n];
        for (int i = 0; i < n ; i++) {
            System.out.printf("Enter element of the a[%d] = ", i);
            a[i] = sc.nextInt();
        }
        System.out.print("The original array: ");
        printArray(a);

        //find maximum and 2nd maximum
        int max = -9999;
        int max2 = -9999;
        int indexmax = -1;
        int indexmax2 = -1;
        for (int i = 0; i < a.length ; i++) {
            if(a[i] > max) {
                max = a[i];
                indexmax = i;
            } else if(a[i] > max2 && a[i] < max) {
                max2 = a[i];
                indexmax2 = i;
            }
        }
        System.out.println();
        System.out.println("The max elements = " + max + ";" + "index = " + indexmax);
        System.out.println("The 2nd max elements = " + max2 + ";" + "index = " + indexmax2);


        //find minimum and 2nd minimum
        int min = 9999;
        int min2 = 9999;
        int indexmin = -1;
        int indexmin2 = -1;
        for (int i = 0; i < a.length; i++) {
            if(a[i] < min) {
                min = a[i];
                indexmin = i;
            } else if(a[i] < min2 && a[i] > min) {
                min2 = a[i];
                indexmin2 = i;
            }
        }
        System.out.println("The min elements = " + min + ";" + "index = " + indexmin);
        System.out.println("The 2nd min elements = " + min2 + ";" + "index = " + indexmin2);

        //sort the array in the ascending order
        for (int i = 0; i < a.length - 1 ; i++) {
            for (int j = i + 1; j < a.length ; j++) {
                if(a[i] > a[j]) {
                    int temp1 = a[i];
                    a[i] = a[j];
                    a[j] = temp1;
                }
            }
        }
        System.out.print("The array after sorting in ascending order: ");
        printArray(a);

        //replace negative elements by zero
        int temp = -1;
        for (int i = 0; i < a.length; i++) {
            if(a[i] <= temp) {
                a[i] = 0;
            }
        }
        System.out.println();
        System.out.print("The array after removing elements by zero = ");
        printArray(a);


    }
}

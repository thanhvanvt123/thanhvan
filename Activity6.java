import java.util.Scanner;

public class Activity6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number: ");
        int a = sc.nextInt();
        System.out.println("Input second number: ");
        int b = sc.nextInt();
        System.out.println(+ a + "  +" + b + " = " + (a + b));
        System.out.println(+ a + " - " + b + " = " + (a - b));
        System.out.println(+ a + " * " + b + " = " + (a * b));
        System.out.println(+ a + " / " + b + " = " + (a / b));
        System.out.println(+ a + " mod " + b + " = " + (a % b));
    }
}

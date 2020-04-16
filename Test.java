import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        int a, b;
        System.out.println("Nhap 2 so a va b: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println("Tong: " +(a + b));
        System.out.println("Tich: " +(a * b));
    }
}

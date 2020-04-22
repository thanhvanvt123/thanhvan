import java.util.Scanner;

public class ex24 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);
        int result = 0;
        for (int i = 0; i < b ; i++) {
            result += a;
        }
        System.out.println("Result = " + result);
    }
}






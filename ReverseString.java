import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        char temp[] = s.toCharArray();
        for (int i = temp.length - 1; i >= 0 ; i--) {
            System.out.print(temp[i]);
        }
    }
}

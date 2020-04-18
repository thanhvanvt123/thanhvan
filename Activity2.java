import java.util.Scanner;

public class Activity2 {
    public static void main(String[] args) {
        System.out.println("Where are they learning Javacore?");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(s.equals("PlusPlus Academy")){
            System.out.println("Welcome to Javacore class");
        } else {
            for(;;) {
                System.out.println("Input again please");
                s = sc.nextLine();
            }
        }






    }
}

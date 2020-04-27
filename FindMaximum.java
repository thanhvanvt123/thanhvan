import java.util.Scanner;

public class FindMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        s.toLowerCase();
        char temp[] = s.toCharArray();
        int arr[] = new int[s.length()];

        char result = temp[0];
        for (int i = 0; i < temp.length ; i++) {
            arr[i] = 1;
            for (int j = i + 1; j < temp.length ; j++) {
                if(temp[i] == temp[j] && temp[i] != ' ' && temp[i] != '0') {
                    arr[i]++;
                    temp[j] = '0';
                }
            }
        }

        int max = arr[0];
        for (int i = 0; i < temp.length ; i++) {
            if(max < arr[i]) {
                max = arr[i];
                result = temp[i];
            }
        }
        System.out.println(result + " " + max + " times");
    }
}

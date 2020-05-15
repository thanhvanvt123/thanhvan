package Exercise6;

import java.util.Scanner;

public class UserManagement extends User{
    private int totalUser;
    private User[] users;
    

    public UserManagement(int id, String username, String password, String displayName, String email, int totalUser,User[] users) {
        super(id, username, password, displayName, email);
        this.totalUser = totalUser;
        this.users = users;
    }

    public UserManagement(Scanner sc, int n) {
        n = sc.nextInt();
        System.out.println("Nhap thong tin cho " + n + "users");

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin cho user thu " + (i + 1));
            System.out.print("\t- ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("\t- Username: ");
            String username = sc.nextLine();
            if (username == users[i].getUsername()) {
                System.out.println("Nhap lai: ");
                sc.nextLine();
            }

            System.out.print("\t- Password: ");
            String password = sc.nextLine();
            System.out.print("\t- Display name: ");
            String displayName = sc.nextLine();
            System.out.print("\t- Email: ");
            String email = sc.nextLine();

            User[] users = new User[n];

        }

        public User findUserByUsername(String username) {
            System.out.println("Nhap username can tim: ");
            String usernameSearch = sc.nextLine();
            for (int i = 0; i < n; i++) {
                if (users[i].getUsername().equals(usernameSearch)) {
                    System.out.println(users[i].toString());
                }else {
                    System.out.println("Nguoi dung khong ton tai.");

                }
            }
        }

//        public User login(String username, String password) {
//
//        }

    }
}

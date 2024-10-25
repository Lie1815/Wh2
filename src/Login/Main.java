package Login;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите логин");
        String login = scanner.nextLine();
        System.out.println("введите пароль");
        String pass = scanner.nextLine();
        System.out.println("повторите пароль");
        String pass2 = scanner.nextLine();
        Registration.registUser(login, pass, pass2);
    }
}

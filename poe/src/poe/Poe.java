
package poe;
import java.util.Scanner;
public class Poe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        if (password.matches(".*[^a-zA-Z0-9].*")) {
            System.out.println("Login successful. Welcome, " + name + " " + surname + "!");
        } else {
            System.out.println("Special character required in password. Login failed.");
        }

        scanner.close();
    }
}


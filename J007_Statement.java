import java.util.Scanner;

public class J007_Statement {

    public static void main(String[] args) {
        // Es igual a todos
        // if statement = performs a block of code if it's condition evaluates to be
        // true

        Scanner scanner = new Scanner(System.in);

        System.out.println("¿cuantos años tienes?");
        int age = scanner.nextInt();

        scanner.close();

        if (age == 75) { // == es igual a
            System.out.println("Ok Boomer!");
        } else if (age >= 18) {
            System.out.println("You are an adult!");
        } else if (age >= 13) {
            System.out.println("You are a teenager!");
        } else {
            System.out.println("You are not an adult!");
        }

    }
}
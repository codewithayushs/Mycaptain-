import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        int age = -1;
        while (age < 0) {
            System.out.print("Enter your age (non-negative number): ");
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
                if (age < 0) {
                    System.out.println("Age cannot be negative. Try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }

        scanner.nextLine();

        System.out.print("Enter your profession: ");
        String profession = scanner.nextLine();

        System.out.println("\n--- User Summary ---");
        System.out.println("Name      : " + name);
        System.out.println("Age       : " + age);
        System.out.println("Profession: " + profession);

        System.out.println("\n--- Age Category ---");
        if (age < 13) {
            System.out.println("You're a child.");
        } else if (age >= 13 && age <= 19) {
            System.out.println("You're a teenager!");
        } else if (age < 60) {
            System.out.println("You're an adult.");
        } else {
            System.out.println("You're a senior citizen.");
        }

        scanner.close();
    }
}

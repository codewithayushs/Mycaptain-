import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); 

        
        System.out.print("Enter your profession: ");
        String profession = scanner.nextLine();

        
        String[] labels = {"Name", "Age", "Profession"};
        String[] values = {name, Integer.toString(age), profession};

        System.out.println("\nInformation:");
        for (int i = 0; i < labels.length; i++) {
            System.out.println(labels[i] + ": " + values[i]);
        }

        scanner.close();
    }
}

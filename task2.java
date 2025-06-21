import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 different numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        sortArray(numbers);
        System.out.print("Sorted array: ");
        printArray(numbers);

        int secondLowest = findSecondLowest(numbers);
        int secondHighest = findSecondHighest(numbers);

        System.out.println("Second lowest number: " + secondLowest);
        System.out.println("Second highest number: " + secondHighest);
        
        scanner.close();
    }

    public static void sortArray(int[] arr) {
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static int findSecondLowest(int[] arr) {
        int lowest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != lowest) {
                return arr[i];
            }
        }
        return -1; 
    }

    public static int findSecondHighest(int[] arr) {
        int highest = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != highest) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

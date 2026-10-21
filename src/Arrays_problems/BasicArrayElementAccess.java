package Arrays_problems;

import java.util.*;

public class BasicArrayElementAccess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Read array size
            if (!sc.hasNextInt()) {
                throw new InputMismatchException(
                        "Array size must be an integer."
                );
            }

            int n = sc.nextInt();

            // Handle negative size
            if (n < 0) {
                throw new IllegalArgumentException(
                        "Array size cannot be negative."
                );
            }

            int[] arr = new int[n];

            // Read array elements
            for (int i = 0; i < n; i++) {
                if (!sc.hasNextInt()) {
                    throw new InputMismatchException(
                            "Expected an integer at element " + i
                    );
                }

                arr[i] = sc.nextInt();
            }

            // Print array
            for (int i = 0; i < arr.length; i++) {
                if (i > 0) {
                    System.out.print(" ");
                }
                System.out.print(arr[i]);
            }

            System.out.println();

        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());

        } catch (InputMismatchException e) {
            System.err.println("Invalid input: " + e.getMessage());

        } finally {
            sc.close();
        }
    }
}

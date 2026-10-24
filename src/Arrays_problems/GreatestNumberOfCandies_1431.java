
package Arrays_problems;

import java.util.Scanner;

public class GreatestNumberOfCandies_1431 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] candies = new int[size];

        for (int i = 0; i < candies.length; i++) {
            candies[i] = sc.nextInt();
        }

        int extraCandies = sc.nextInt();

        int largest = 0;

        // Find the maximum number of candies
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > largest) {
                largest = candies[i];
            }
        }

        // Print the result for each child
        for (int i = 0; i < candies.length; i++) {
            boolean canHaveGreatest =
                    candies[i] + extraCandies >= largest;

            System.out.print(canHaveGreatest);

            if (i < candies.length - 1) {
                System.out.print(" ");
            }
        }

        System.out.println();
        sc.close();
    }
}

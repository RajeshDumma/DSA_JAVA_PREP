
package Arrays_problems;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZeroes_283 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int k = 0; k < n; k++) {
            nums[k] = sc.nextInt();
        }

        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }

        System.out.println("Array after moving zeroes: "
                + Arrays.toString(nums));

        sc.close();
    }
}

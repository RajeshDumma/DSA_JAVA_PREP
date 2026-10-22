
package Arrays_problems;

import java.util.*;

public class SquaresOfSortedArray_977 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int right = arr.length - 1;
        int[] result = new int[n];
        int k = n - 1;

        while (left <= right) {
            int leftSquare = arr[left] * arr[left];
            int rightSquare = arr[right] * arr[right];

            if (leftSquare > rightSquare) {
                result[k] = leftSquare;
                left++;
            } else {
                result[k] = rightSquare;
                right--;
            }

            k--;
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        System.out.println();
        sc.close();
    }
}

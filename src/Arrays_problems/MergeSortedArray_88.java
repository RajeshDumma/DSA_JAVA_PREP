
package Arrays_problems;

import java.util.Scanner;

public class MergeSortedArray_88 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read nums1 size (including extra spaces)
        int n1 = sc.nextInt();

        int[] nums1 = new int[n1];

        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }

        // Read nums2 size
        int n2 = sc.nextInt();

        int[] nums2 = new int[n2];

        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }

        // Number of valid elements in nums1
        int m = n1 - n2;

        // Three pointers
        int i = m - 1;
        int j = n2 - 1;
        int k = n1 - 1;

        // Merge from the end
        while (i >= 0 && j >= 0) {

            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }

            k--;
        }

        // Copy remaining elements of nums2
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }

        // Print final array
        System.out.print("Merged Array: ");

        for (int value : nums1) {
            System.out.print(value + " ");
        }

        sc.close();
    }
}

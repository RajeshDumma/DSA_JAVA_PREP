
package Arrays_problems;

import java.util.Scanner;

public class ReverseWordsInAStringIII_557 {

    public static void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char[] arr = s.toCharArray();

        int left = 0, right = 0;

        while (right < arr.length) {
            if (arr[right] == ' ') {
                reverse(arr, left, right - 1);
                left = right + 1;
            }
            right++;
        }

        reverse(arr, left, right - 1);

        System.out.println(new String(arr));

        sc.close();
    }
}

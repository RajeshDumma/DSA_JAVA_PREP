
package Arrays_problems;

import java.util.*;

public class ReverseString_344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char[] ch = new char[str.length()];

        // Step 1: Convert String into char array
        for (int i = 0; i < ch.length; i++) {
            ch[i] = str.charAt(i);
        }

        // Step 2: Reverse the array using two pointers
        int left = 0;
        int right = ch.length - 1;

        while (left < right) {
            char storeChar = ch[left];
            ch[left] = ch[right];
            ch[right] = storeChar;

            left++;
            right--;
        }

        // Step 3: Print the reversed array
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
            if(i < ch.length) System.out.print(" ");
        }
        System.out.println();
        sc.close();
    }
}

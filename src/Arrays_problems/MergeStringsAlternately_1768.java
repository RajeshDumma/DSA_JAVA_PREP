
package Arrays_problems;

import java.util.Scanner;

public class MergeStringsAlternately_1768 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word1 = sc.next();
        String word2 = sc.next();

        StringBuilder merged = new StringBuilder();
        int i = 0, j = 0;

        while (i < word1.length() || j < word2.length()) {

            if (i < word1.length()) {
                merged.append(word1.charAt(i++));
            }

            if (j < word2.length()) {
                merged.append(word2.charAt(j++));
            }
        }

        System.out.println(merged);

        sc.close();
    }
}

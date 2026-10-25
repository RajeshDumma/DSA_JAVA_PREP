package Arrays_problems;

import java.util.Scanner;

public class ConcatenationOfArray_1929 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }

        int[] arr1 = new int[n*2];
        for(int i = 0; i < n*2; i++){
            arr1[i] = arr[i%n];
        }

        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
        sc.close();
// 2nd method
   /*     class Solution {
            public int[] getConcatenation(int[] nums) {
                int l = nums.length;
                int[] ans = new int[l * 2];
                System.arraycopy(nums, 0, ans, 0, l);
             // System.arraycopy(nums: source, 0 :sourcePosition, ans: destination, 0: destinationPosition, L: length)
                System.arraycopy(nums, 0, ans, l, l);
                return ans;
            }
        }*/
    }
}

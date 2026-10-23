
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

        // 1st method
/*
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
        }*/

        // 2nd method

        int left = 0, right = n-1;
        int[] newArray = new int[n];

        for(int idx =n-1; idx >= 0; idx--){
            if(left <= right){
                if (Math.abs(arr[left]) > Math.abs(arr[right])){
                    newArray[idx] = arr[left] * arr[left];
                    left++;
                } else{
                    newArray[idx] = arr[right] * arr[right];
                    right--;
                }
            }
        }

        for(int i = 0; i < n; i++){
            System.out.print(newArray[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}

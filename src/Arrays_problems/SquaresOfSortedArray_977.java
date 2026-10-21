package Arrays_problems;

import java.util.*;

import static java.lang.Math.abs;


public class SquaresOfSortedArray_977 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length;i++){
            arr[i] = arr[i] * arr[i];
        }
        int left = 0, right = arr.length-1;
        while(left < right){
            if(arr[left] > arr[right]) {
                right++;
            }else{
                int storedvalue = arr[left];
                arr[left] = arr[right];
                arr[right] = storedvalue;
                left++;
            }

        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}

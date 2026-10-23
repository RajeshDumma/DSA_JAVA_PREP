package Arrays_problems;

import java.util.Scanner;

public class RunningSumof1dArray_1480 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        // 1st Apparoch (time O(n) and space O(n) because extra space for newArray )
     /*   int[] newArr = new int[n];
        newArr[0] = arr[0];

        for(int i = 1; i < n; i++){
            newArr[i] = arr[i] + newArr[i-1];
        }*/

        // 2nd Apparoch time(O(n) Space O(1) no extra space

        for(int i = 1; i < n; i++){
            arr[i] = arr[i] + arr[i-1];
        }

        for(int i = 0; i <n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}

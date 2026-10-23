package Arrays_problems;

import java.util.Scanner;

public class ShuffleTheArray_1470 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[2*n];

        for(int i = 0; i < 2*n; i++){
            arr[i] = sc.nextInt();
        }

        int[] newArr = new int[2*n];

        for(int i = 0; i < n; i++){
            newArr[2*i] = arr[i];
            newArr[2*i+1] = arr[i + n];
        }

        for(int i = 0; i < 2*n; i++){
            System.out.print(newArr[i] + " ");
        }
        sc.close();;
    }
}

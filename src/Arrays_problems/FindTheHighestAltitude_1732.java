package Arrays_problems;

import java.util.Scanner;

public class FindTheHighestAltitude_1732 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int latitude = 0;
        int maxLatitude = 0;
        for(int i = 0; i <n; i++){
            latitude += arr[i];
            maxLatitude = Math.max(maxLatitude, latitude);
        }
        System.out.println(maxLatitude);
    }
}

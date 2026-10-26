package Arrays_problems;

import java.util.Scanner;

public class BestTimeToBuyAndSellStock_121 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int buying_price = arr[0];
        int maxProfit = 0;
        for(int i = 1; i < arr.length;i++){
            if(arr[i] < buying_price){
                buying_price = arr[i];
            } else{
                int current_profit = arr[i] -buying_price;
                maxProfit = Math.max(maxProfit, current_profit);
            }
        }
        System.out.println(maxProfit);
        sc.close();
    }

}

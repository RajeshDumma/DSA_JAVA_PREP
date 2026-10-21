package Arrays_problems;

import java.util.*;

public class SingleNumber_136 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try{
            if(!sc.hasNextInt()){
                throw new InputMismatchException("Array must be Integer.");
            }
            int n = sc.nextInt();
            if(n <= 0){
                throw new IllegalArgumentException("Array size cannot be negetive");
            }
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            int singleNumber = 0 ;
            for(int i=0; i < arr.length; i++){
                singleNumber = singleNumber ^ arr[i];
            }
            System.out.println(singleNumber);
        } catch (InputMismatchException e){
            System.err.println(e.getMessage());
        } catch (IllegalArgumentException e){
            System.err.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}

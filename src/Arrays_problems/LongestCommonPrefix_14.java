package Arrays_problems;

import java.util.Scanner;

public class LongestCommonPrefix_14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i = 0; i < str.length; i++){
            str[i] = sc.next();
        }

        for(int i = 0; i <str[0].length(); i++){
            char ch = str[0].charAt(i);

            for(int j = 1; j < str.length; j++){

                if(i >= str[j].length() || str[j].charAt(i) != ch){
                    System.out.println(str[0].substring(0,i));

                    sc.close();
                    return;
                }
            }
        }
        System.out.println(str[0]);
    }
}

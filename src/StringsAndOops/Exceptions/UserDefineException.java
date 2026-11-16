package StringsAndOops.Exceptions;

import java.util.Scanner;

class MyException extends Exception{
    MyException(){
        System.out.println("This competition only for less then  10 years children");
    }

    public MyException(String str){
        super(str);
    }

}

public class UserDefineException {
    public static void main(String[] args) throws Exception {
       // Scanner sc = new Scanner(System.in);
            int age = 11;

            try {
                if (age > 10) {
                    throw new MyException(
                            "You are not eligible for this competition"
                    );
                }
            }
            catch (Exception e) {
                System.out.println("Exception caught: " + e.getMessage());
            }

            String name = "king";

            int len = name.length();
            try {
                if (len >= 6) {
                    System.out.println("Valid name");
                } else {
                    throw new Exception("please enter minimum 6 characters");
                }
            }
            catch (MyException e) {
                System.out.println("wrong name entered");
            }
        }

}

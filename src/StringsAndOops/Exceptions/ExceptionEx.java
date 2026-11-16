package StringsAndOops.Exceptions;

public class ExceptionEx {

    public static void main(String[] args){
       try{
           System.out.println(10 + 30);
           System.out.println(20*30);
           System.out.println(10/0);

       }
       catch(ArithmeticException e){
           System.out.println("Please you cannot divide by zero");
       }
       catch(IndexOutOfBoundsException e) {
           System.out.println("Your array size out of range");
        }
       finally {
           System.out.println("Hello");
       }
    }
}

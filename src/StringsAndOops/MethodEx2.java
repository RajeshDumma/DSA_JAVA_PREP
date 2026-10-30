package StringsAndOops;

// call By value and Call By reference

class sample{

    void add(int a, int b){
        int sum = a+b;
        System.out.println(sum);

        a = 80;
        b = 90;
        sum = a + b;
        System.out.println("Additional Result :- " + (a + b));
    }

    void check(Ex1 ob1){
        ob1.v1 = 90;
        ob1.v2 = 100;
    }
}

class Ex1{
    int v1;
    int v2;
}
public class MethodEx2 {
    public static void main(String[] args){

        int p =50;
        int q = 50;
        sample obj = new sample();
        obj.add(p, q);

        Ex1 obj1 = new Ex1();
        obj1.v1 = 2;
        obj1.v2 = 4;

        System.out.println("Before Passing : " + obj1.v1 + "," + obj1.v2 );
        obj.check(obj1);
        System.out.println("After Passing : " +obj1.v1 + "," + obj1.v2 );
    }
}

package StringsAndOops.Inheritance;

class Exmp{
    int p, q, r;
    Exmp(){}
    Exmp(int p, int q, int r){
        this.p = p;
        this.q = q;
        this.r = r;
    }
}

class Exmp1 extends Exmp{
    // p q r from ----> super class (Exmp)
    int s, t;

    Exmp1(int p, int q, int r, int s, int t){
      //  this.p = p; // again repeating
      //  this.q = q;
      //  this.r = r;
        super(p,q,r);
        this.s = s;
        this.t = t;
    }

    void add(){
        System.out.println(p+q+r+s+t);
    }
}

public class SuperEx1 {
    public static void main(String[] args){
        Exmp1 obj = new Exmp1(11, 22, 33, 44, 55);
        obj.add();
    }
}

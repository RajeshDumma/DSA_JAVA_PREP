package StringsAndOops.AbstractClass;

 abstract class CGovt{

   /* void actionTobeTaken(){ // concrete methods
        System.out.println("close all college and schools");
    }*/

   abstract void actionTobeTaken(); // abstract method

    void otherDirections(){ // concrete methods
        System.out.println("I am other directories method");
    }
}

class AP extends CGovt{

    @Override
    void actionTobeTaken() {
        System.out.println("Nothing Implemented");
    }
}

class TG extends CGovt{

    @Override
    void actionTobeTaken() {
        System.out.println("All colleges and schools are closed");
    }
}

public class AbstractClassEx {
    public static void main(String[] args){

        AP ap = new AP();
        ap.actionTobeTaken();
        ap.otherDirections();

        TG tg = new TG();
        tg.actionTobeTaken();
        tg.otherDirections();
    }
}

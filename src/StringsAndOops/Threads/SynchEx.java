package StringsAndOops.Threads;
// program to demonstrate synchronization

class TicketBooking{
    boolean booked = false;
    public  void BookTicket(String name){ // synchronized is lock here
        synchronized (this) {
            if (booked == false) {
                System.out.println(name + " Selected the seat");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
                ;

                System.out.println(name + " completed the payment");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }

                System.out.println(name + " get the ticket");
                booked = true;
            } else {
                System.out.println("sorry " + name + " ticket already booked");
            }
        }
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println(name +" Booked Bus ticket ");

    }
}
class ThreadClass extends Thread{
    TicketBooking tkb;
    String name;

    ThreadClass(TicketBooking obj, String str){
        tkb = obj;
        name = str;
    }
    public void run(){
        tkb.BookTicket(name);
    }
}
public class SynchEx {
    public static void main(String[] args){
        TicketBooking seat = new TicketBooking();

        ThreadClass person = new ThreadClass(seat, "Rajesh");
        Thread raj = new Thread(person);
        person.start();

        ThreadClass person2 = new ThreadClass(seat, "Srinu");
        Thread sri = new Thread(person2);
        person2.start();



    }
}

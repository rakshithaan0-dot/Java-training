package theads;

public class TicketTask implements Runnable {
    String task;
    TicketTask(String task){
        this.task = task;
    }
    public void run(){
        System.out.println( task + " in progress.");
    }
    public static void main(String[] args) {
 Thread t1=new Thread(new TicketTask("Seat assinged"));
 Thread t2= new Thread(new TicketTask("Payment processing"));
 Thread t3= new Thread(new TicketTask("SMS Notification"));
 t1.start();
 t2.start();
 t3.start();
    }

}
/*each runnable object
is resposible only for execution which means just with  cleaner and more flexible which interface
⭐implements=Runnable
 ⭐better desing
 ⭐intervies mostly ask this
 ⭐suppourt multhiple inheritance vio interfaces
 */

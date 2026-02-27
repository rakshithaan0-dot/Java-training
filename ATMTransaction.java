package exceptions;

public class ATMTransaction  extends Thread{
     public void run(){
        System.out.println("Processing ATMTransaction");
    }

    public static void main(String[] args) {
        ATMTransaction t= new ATMTransaction();
        System.out.println("Thread State:" + t.getState());
        t.start();
        System.out.println("thread state after start:"+
                t.getState());

    }
}
/*
Iniyially the thread is in the New state after calling start()'
it moves to runnable and executes the run()method,
the exact timing of the state changes depends on the
JVN schedule

points to remember
Thread to created once
Start(0 change state
Thread cannot be restarted Final state tsTERMINATOR or DEAD
 */
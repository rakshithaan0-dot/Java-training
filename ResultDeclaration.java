package theads;

public class ResultDeclaration {
    synchronized void declareResult() throws Exception{
        System.out.println("Waiting for approval...");
        wait();
        System.out.println("Result Declared");

    }
    synchronized void approve(){
    notify();
}
    public static void main(String[] args) throws Exception{
        ResultDeclaration rd = new ResultDeclaration();
    new Thread(()-> {
                try {
                    rd.declareResult();
                }catch (Exception e){}

                }).start();
    Thread.sleep( 2000);
                    new Thread(() ->
                        rd.approve()).start();
                    }
    }
/*
the declaredResult() meth0d waits until another thread call notify during wait (),the thread realises the lock,
allowing oter threads to enter the sychronized code
⭐points to remember
⭐sleep()->time based
⭐wait()->condition based
⭐wait()->releases lock->by the notify() method
⭐wait() is used to inter- threaded communication

 */
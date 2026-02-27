package theads;

public class FestRegistration {
    static class FormFilling extends Thread {
        public void run() {
            System.out.println("Form filling Started!");
        }
    }

    static class DocumentUpload extends Thread {
        public void run() {
            System.out.println("Document Upload Started");
        }
    }

    static class EmailNotification extends Thread {
        public void run() {
            System.out.println("Confarmation Email Sent");
        }
    }



    public static void main(String[] args) {
        FormFilling t1 = new FormFilling();
        DocumentUpload t2 = new DocumentUpload();
        EmailNotification t3 = new EmailNotification();
        t1.start();
        t2.start();
        t3.start();
    }
}
/*
points to rembember
java program starts with one main thread,
Threads allows parallel execution ->councurency
output order is not gaurented
threads shres to the same memory
improves the performance &responsiveness
when start() is called te JVM create a new Thread
when run() is called directly,there is no concurancy
process vs Thread
process is a running program
thraed a path of execution inside the program
a process is a running program
Thread : A path of execution inside the program
A process has its own memory
Inside there is a same memory
creation a thread is cheaper than craeting process

 */

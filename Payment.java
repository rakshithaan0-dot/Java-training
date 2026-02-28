package InnerClasses;

public interface Payment {
    void pay();
}
class PaymenentDemo  {
    public static void main(String[] args) {
        Payment p=new Payment(){
            public void pay(){
                System.out.println("Payment was done using credit card.");
            }
        };
        p.pay();
        Payment p1 = ()-> System.out.println("Cash payment");
        p1.pay();
    }
}

package exceptions;

public class Demo {
    public static void main(String[] args) {
        try{
            int balance =20000;
            int withdraw=3000;
            if(withdraw>balance) {
                throw new ArithmeticException("Insufficient Funds");
            }
                System.out.println("Withdrwal Sucessful.");
            }catch(ArithmeticException e){
                System.out.println("Cought Excepton:"+e.getMessage());

        }
    }
}

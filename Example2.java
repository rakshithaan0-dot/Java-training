package String;

public class Example2{
    final int x;
    static final int y;
    Example2(){
        x=200;

    }
    public static void main(String[] args){

    }
    static {
        y = 10;
        System.out.println("start");
        System.out.println("DB-start");
        System.out.println("Internet start");
        System.out.println("load files");
    }
}
package exceptions;

import jdk.dynalink.beans.StaticClass;

import java.io.IOException;

public class CheckException {
        static void readFile() throws IOException{
            throw new IOException("File not Found!");
        }
    public static void main(String[] args) {
        try{
            display();
        }catch (IOException e){
            System.out.println(e.getMessage() );
        }
    }
    static void display()throws IOException{
    readFile();
    }
}

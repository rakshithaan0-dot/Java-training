package String;

public class StringPool {
    public static void main(String[] args){
        String s1 = "java";
        String s2 = "java";
        System.out.println(s1 == s2);
        String s3 = new String("java");
        System.out.println(s1 == s3);

        System.out.println(s1.equals(s3));
    }

    }

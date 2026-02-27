package String;

public class MutableStrings {
    public static void main(String[] args) {
        String s = "SNPU";
        s += "ISE";
        System.out.println("string:" + s);
        StringBuffer buffer = new StringBuffer ("SNPU");
        buffer.append(("ISE"));
        System.out.println(buffer);
        StringBuffer builder = new StringBuffer("SNPU");
        builder.append("ISE");
        System.out.println(builder);
    }
}

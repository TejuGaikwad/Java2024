import java.util.Scanner;

public class Third24 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String n = in.next();
        System.out.println(n.trim());
        System.out.println(n.length());
        System.out.println(n.charAt(3));
        System.out.println(n.replace("as", "u"));
        System.out.println(n.substring(2,4));
        System.out.println(n);
    }
}

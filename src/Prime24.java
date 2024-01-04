import java.util.Scanner;

public class Prime24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt()
                ;
        if(n>1) {
            boolean flag = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("the input is prime");
            }else{
                System.out.println("Not a prime");
            }

        }else{
            System.out.println("Not a prime");
        }
    }
}

import java.util.Scanner;

public class OddEvenWithoutModule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number  to check whether it's Odd or Even.");
        int no = sc.nextInt();

        // method-1
        // System.out.println((no & 1 )== 0 ? "Even" : "Odd");

        // method-2
        /*
         * if (no / 2 * 2 == no)
         * System.out.println("Even");
         * else
         * System.out.println("Odd");
         */
    }
}

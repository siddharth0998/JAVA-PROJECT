import java.util.Scanner;

public class OddEven {
    public int oddEven(int a) {
        return a % 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int a = sc.nextInt();
        OddEven obj1 = new OddEven();
        if (obj1.oddEven(a) == 0)
            System.out.printf("Number %d is Even", a);
        else
            System.out.println("Number " + a + " is Odd");

    }
}

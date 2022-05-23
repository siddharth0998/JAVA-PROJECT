import java.util.Scanner;

public class NumberSwapping {

    public void numberSwap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping value of a and b is: ");
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two number to swap.");
        int a = sc.nextInt();
        int b = sc.nextInt();
        NumberSwapping obj1 = new NumberSwapping();
        obj1.numberSwap(a, b);

    }
}

import java.util.Scanner;

public class ArithmaticDemo {
    public int Add(int a, int b) {
        return a + b;
    }

    public int Sub(int a, int b) {
        return a - b;
    }

    public int Mul(int a, int b) {
        return a * b;
    }

    public int Div(int a, int b) {
        return a / b;
    }

    public int Mod(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println();
        ArithmaticDemo add = new ArithmaticDemo();
        System.out.println("****Result below****");
        System.out.println();
        System.out.println("Addition: " + add.Add(a, b));
        System.out.println("Substraction: " + add.Sub(a, b));
        System.out.println("Multiplication: " + add.Mul(a, b));
        System.out.println("Division: " + add.Div(a, b));
        System.out.println("Reminder: " + add.Mod(a, b));

    }
}

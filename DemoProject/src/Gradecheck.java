import java.util.Scanner;

public class Gradecheck {

    public int marksAverage(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Maths marks");
        int m = sc.nextInt();

        System.out.println("Enter Physics marks");
        int p = sc.nextInt();

        System.out.println("Enter Chemistry marks");
        int c = sc.nextInt();

        Gradecheck obj1 = new Gradecheck();
        int avg = obj1.marksAverage(m, p, c);
        System.out.println(avg);
        System.out.println();
        System.out.println("***Your Result Below***");
        System.out.println();
        if (avg > 90)
            System.out.println("Your Grade is: A");
        else if (avg > 70 && avg <= 90)
            System.out.println("Your Grade is: B");
        else if (avg > 50 && avg <= 70)
            System.out.println("Your Grade is: C");
        else if (avg > 35 && avg <= 50)
            System.out.println("Your Grade is: D");
        else
            System.out.println("Your Grade is: F");
    }
}

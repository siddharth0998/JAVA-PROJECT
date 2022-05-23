import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListQue_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        ArrayList[] arraylist = new ArrayList[20002];

        for (int i = 1; i <= a; i++) {
            arraylist[i] = new ArrayList();
            int b = sc.nextInt();

            for (int j = 1; j <= b; j++) {
                int value = sc.nextInt();
                arraylist[i].add(value);
            }
        }

        int querie = sc.nextInt();

        for (int i = 1; i <= querie; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            try {
                System.out.println(arraylist[x].get(y - 1));
            } catch (Exception e) {
                System.out.println("ERRORS!");
            }

        }

    }

}

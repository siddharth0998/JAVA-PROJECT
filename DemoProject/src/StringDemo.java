public class StringDemo {
    public static void main(String[] args) {

        // pattern-1
        for (int i = 5; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // pattern-2
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(k + 1 + " ");
            }
            System.out.println();
        }
    }
}

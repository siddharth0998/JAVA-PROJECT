public class PrintWithoutLoop {

    public static void print(int num) {

        if (num <= 100) {
            System.out.println(num);
            print(num + 1);
        }
    }

    public static void main(String[] args) {
        int num = 1;
        print(num);
    }
}

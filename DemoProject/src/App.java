
class Mul {
    public double multiplication(double a, double b) {
        return a * b;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Mul obj1 = new Mul();
        System.out.println(obj1.multiplication(5, 8));
    }
}

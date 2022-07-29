public class CurrencyConvertor {

    int rupee = 75, dirham = 3, real = 3, chilean_peso = 595, mexican_peso = 18,
            _yen = 107, $australian = 2, dollar,
            Rupee = 63;

    public void printCurrency() {
        System.out.println("rupee : " + rupee);
        System.out.println("dirham : " + dirham);
        System.out.println("real : " + real);
        System.out.println("chilean_peso : " + chilean_peso);
        System.out.println("mexican_peso : " + mexican_peso);
        System.out.println("_yen : " + _yen);
        System.out.println("$australian : " + $australian);
        System.out.println("dollar : " + dollar);
        System.out.println("Rupee : " + Rupee);
    }

    public static void main(String[] args) {
        CurrencyConvertor cc = new CurrencyConvertor();
        cc.printCurrency();
    }
}
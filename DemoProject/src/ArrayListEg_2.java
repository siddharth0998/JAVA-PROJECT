import java.util.ArrayList;
import java.util.List;

public class ArrayListEg_2 {
    public static void main(String[] args) {
        List<String> topCompany = new ArrayList<>();

        System.out.println("is topCompany list is empty : " + topCompany.isEmpty());

        topCompany.add("Google");
        topCompany.add("Apple");
        topCompany.add("Facebook");
        topCompany.add("Microsoft");

        System.out.println("top " + topCompany.size() + " company in the world are : ");
        System.out.println(topCompany);

        String best_company = topCompany.get(0);
        String second_best_Company = topCompany.get(1);
        String third_best_Company = topCompany.get(2);
        String lastcompany = topCompany.get(topCompany.size() - 1);

        System.out.println("best company : " + best_company);

        topCompany.set(2, "walmart");

        System.out.println(topCompany);

    }

}

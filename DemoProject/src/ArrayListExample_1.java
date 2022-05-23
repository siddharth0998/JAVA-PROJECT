import java.util.ArrayList;
import java.util.List;

public class ArrayListExample_1 {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        animals.add("Lion");
        animals.add("Tiger");
        animals.add("cheetah");
        animals.add("dog");
        animals.add("cat");

        System.out.println(animals);

        animals.add(0, "elephent");
        System.out.println(animals);

        List<String> animals_2 = new ArrayList<>(animals);

        animals_2.add("leopard");
        animals_2.add("rabbit");
        animals_2.add("panther");

        System.out.println(animals_2);
    }

}

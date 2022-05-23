public class Test1 {
    public static void main(String[] args) {
        // for (int i = 0; i < 5; i++) {
        // for (int j = 4; j > i; j--) {
        // System.out.print(" ");
        // }
        // for (int k = 0; k <= i; k++) {
        // System.out.print(k + 1 + " ");
        // }
        // System.out.println();
        // }

        Animal animal = new Dog();
        animal.display();
        animal.sleep();
    }
}

class Animal {
    void display() {
        System.out.println("this is animal class method");
    }

    void sleep() {
        System.out.println("this is sleeping of animal");
    }
}

class Dog extends Animal {
    void display() {
        System.out.println("this is dog class method");
    }

    void eat() {
        System.out.println("this is eating of dog");
    }
}

public class Main {
    public static void main(String[] args){

        Dog dog = new Dog("Labrador");
        Cat cat = new Cat("Hellig birma");

        System.out.println(dog.makeSound());
        System.out.println(cat.makeSound());

        System.out.println("\n" + cat.eat("fish"));
        System.out.println(dog.eat("steak"));
    }
}

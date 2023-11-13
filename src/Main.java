public class Main {
    public static void main(String[] args){

        Dog dog = new Dog("Labrador");
        Cat cat = new Cat("Hellig birma");

        System.out.println("dog says: " + dog.makeSound());
        System.out.println("cat says: " + cat.makeSound());

        System.out.println("\n" + "Does cat like fish: " + cat.eat("fish"));
        System.out.println("Does dog like steak: " + dog.eat("steak"));

        System.out.println("\n" + dog.showMood(true));
        System.out.println(dog.showMood(false));
        System.out.println(cat.showMood(true));
        System.out.println(cat.showMood(false));
    }
}

public class Dog extends Animal {

    public Dog(String name){
        super(name);
    }

    @Override
    public String makeSound(){
        return "*bark*";
    }

    @Override
    public boolean eat(String foodType){
        return true;
    }
}

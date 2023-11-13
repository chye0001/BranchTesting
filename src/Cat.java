public class Cat extends Animal{

    public Cat(String name){
        super(name);
    }

    @Override
    public String makeSound(){
        return "*meow*";
    }

    @Override
    public boolean eat(String foodType){
        return true;
    }
}

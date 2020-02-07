public class Giraffe extends Animal {

    public Giraffe(String name) {
        super(name, "leaves");
    }

    public void eat(String food){
        if(food.equals(super.favoriteFood)){
            System.out.println(super.name + " eats " + food);
            System.out.println("YUM! " + super.name + " wants more " + food);
            sleep(super.name);
        } else {
            System.out.println("YUCK! " + super.name + " will not eat " + food);
        }
    }
}

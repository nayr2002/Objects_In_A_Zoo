public class Bee extends Animal {

    public Bee(String name) {
        super(name, "pollen");
    }

    public void sleep(String name){ System.out.println(super.name + " never sleeps");}

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

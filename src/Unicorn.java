public class Unicorn extends Animal {

    public Unicorn(String name){
        super(name, "marshmallows");
    }

    public void sleep(String name){
        System.out.println(super.name + " sleeps in a cloud");
    }
}

public class Bear extends Animal{

    public Bear(String name) {
        super(name, "fish");
    }

    public void sleep(){
        System.out.println(super.name + " hibernates for 4 months");
    }
}

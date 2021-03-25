package stretegy;

public class MallarDuck extends Duck {
    public MallarDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Mallard Duck");
    }
}
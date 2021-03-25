package stretegy;

public class AngryDuck extends Duck {
    public AngryDuck(){
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void swim() {
        super.swim();
        System.out.println("angry");
    }

    @Override
    public void display() {
        super.display();
        System.out.println("fuck you lathearman");
    }
}

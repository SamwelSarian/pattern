package stretegy;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Duck is not flying");
    }
}

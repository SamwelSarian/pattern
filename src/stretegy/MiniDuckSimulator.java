package stretegy;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallared=new MallarDuck();
        mallared.perfomQuack();
        mallared.perfomFly();

        System.out.println();

        Duck angry=new AngryDuck();
        angry.perfomQuack();
        angry.perfomFly();
        angry.display();
        angry.swim();

        System.out.println();

        Duck model=new ModelDuck();
        model.setFlyBehavior(new FlyRocketPowered());
        model.perfomFly();
        model.setQuackBehavior(new Squeak());
        model.perfomQuack();

        System.out.println();

        DuckQuackImitator imitator=new QuackImitator();
        imitator.setQuackBehavior(new QuackImitatorSound());
        imitator.perfomQuack();

    }
}

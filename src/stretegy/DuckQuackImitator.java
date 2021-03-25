package stretegy;

public class DuckQuackImitator {
    QuackBehavior quackBehavior;
    public DuckQuackImitator(){

    }
    public void perfomQuack(){
        quackBehavior.quack();
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
    public void display(){
        System.out.println("*Quack Imitation Sounds*");
    }
}

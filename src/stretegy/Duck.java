package stretegy;

public class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;
    public Duck(){

    }
    public void swim(){
        System.out.print("Swim ");
    }
    public void perfomQuack(){
        quackBehavior.quack();
    }
    public void perfomFly(){
        flyBehavior.fly();
    }
    public void display(){
        System.out.print("you see-");
    }
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior=fb;
    }
    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior=qb;
    }
}


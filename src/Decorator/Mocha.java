package Decorator;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage){
        this.beverage=beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Mocha";
    }

    @Override
    public Double cost() {
        Double cost=beverage.cost();
        if (beverage.getSize()==Size.TALL){
            cost+=.10;
        }
        if (beverage.getSize()==Size.GRANDE){
            cost+=.15;
        }
        else   if (beverage.getSize()==Size.VENTI){
            cost+=.20;
        }
        return cost;
    }
}

package Decorator;

public class DarkRoast extends Beverage {
    public DarkRoast(){
        description="DarkRoast"+" "+getSize();
    }

    @Override
    public void setSize(Size size) {
        super.setSize(size);
    }

    @Override
    public Double cost() {
        Double cost=.00;
        if (getSize()==Size.TALL){
            cost+=.50;
        }
        if (getSize()==Size.GRANDE){
            cost+=1.00;
        }
        else   if (getSize()==Size.VENTI){
            cost+=1.99;
        }
        return cost;
    }
}

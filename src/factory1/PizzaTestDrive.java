package factory1;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore=new NYPizzaStore();
        PizzaStore chicagoStore=new CGPizzaStore();

        Pizza pizza=nyStore.orderPizza("cheese");
        System.out.println("Eathen ordered a "+pizza.getName()+"\n" );

        pizza=chicagoStore.orderPizza("veggie");
        System.out.println("Joel ordered a "+pizza.getName()+"\n");
    }
}

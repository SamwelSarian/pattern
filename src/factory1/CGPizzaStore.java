package factory1;

public class CGPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item){
        Pizza pizza=null;
        PizzaIngredientFactory ingredientFactory=new CGPizzaIngredientFactory();

        if (item.equals("cheese")){

            pizza=new CheesePizza(ingredientFactory);
            pizza.setName("CG Style Cheese Pizza");

        }else if(item.equals("veggie")){

            pizza=new VeggiePizza(ingredientFactory);
            pizza.setName("CG Style Veggie Pizza");

        }else if(item.equals("clam")){

            pizza=new ClamPizza(ingredientFactory);
            pizza.setName("CG Style Clam Pizza");

        }else if (item.equals("pepperoni")){

            pizza=new PepperoniPizza(ingredientFactory);
            pizza.setName("CG Style Pepperoni Pizza");

        }
        return pizza;
    }
}

package Iterator;
import java.util.Iterator;
import java.util.ArrayList;

public class PancakeHouseMenu implements Menu{
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu(){
        menuItems=new ArrayList<MenuItem>();

        addItem("K&B's Pancake Breakfast","Pancakes with acramled eggs, and toast",true,2.99);
        addItem("burger","biber",false,3.56);
    }
    public void addItem(String name,String description,boolean vegetarian,double price){
        MenuItem menuItem=new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }
    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }
}

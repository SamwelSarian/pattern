package Iterator_and_Comporator;

import java.util.ArrayList;
import java.util.Iterator;


public class Menu extends MenuComponent {
    ArrayList<MenuComponent> menuComponents=new ArrayList<>();
    Iterator<MenuComponent> iterator=null;
    String name;
    String description;

    public Menu(String name,String description){
        this.name=name;
        this.description=description;
    }

    public void add(MenuComponent menuComponent){
        menuComponents.add(menuComponent);
    }
    public void remove(MenuComponent menuComponent){
        menuComponent.remove(menuComponent);
    }
    public MenuComponent getChild(int i){
        return menuComponents.get(i);
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public void print(){
        System.out.println("\n"+getName());
        System.out.println(", "+getDescription());
        System.out.println("--------------------");

        Iterator<MenuComponent> iterator=menuComponents.iterator();
        while (iterator.hasNext()){
            MenuComponent menuComponent=iterator.next();
            menuComponent.print();
        }
    }


    public Iterator<MenuComponent> createIterator() {
        if (iterator==null){
            iterator= new CompositeIterator(menuComponents.iterator());
        }
        return iterator;
    }
}

package Iterator;

import java.util.Iterator;

public class DinerMenu implements Menu{
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];


        addItem("borsh", "fast_boi", true, 4.67);
        addItem("yolo_food", "hyper", false, 7.56);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full!");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = 1 + numberOfItems;
        }
    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
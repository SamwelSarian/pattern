package Iterator_and_Comporator;

public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "BreakFast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "lunch");
        MenuComponent cafeMenu = new Menu("CAFE  MENU", "Dessert");
        MenuComponent dessertMenu = new Menu("DESSET MENU", "dessert ye boi");

        MenuComponent allMenus = new Menu("ALL MENUS", "ALL menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        pancakeHouseMenu.add(new MenuItem("K&B's Pancake Breakfast", "Pancakes with acramled eggs, and toast", true, 2.99));
        pancakeHouseMenu.add(new MenuItem("burger", "biber", false, 3.56));
        dinerMenu.add(new MenuItem("borsh", "fast_boi", true, 4.67));
        dinerMenu.add(new MenuItem("yolo_food", "hyper", false, 7.56));
        cafeMenu.add(new MenuItem("cafe 1", "cafe1_1", true, 3.88));
        cafeMenu.add(new MenuItem("cafe 2", "cafe2_2", true, 5.88));
        cafeMenu.add(new MenuItem("cafe 3", "cafe3_3", true, 4.88));
        dessertMenu.add(new MenuItem("ye boi ", ",a fuck ", true, 4.55));
        dinerMenu.add(dessertMenu);




        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();



    }
}





public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Item item = new Item("Generic item", 10);
//        Fruit fruit = new Fruit("Apples", 20, "Fuji");
//        Weapon weapon = new Weapon("Sword", 2, "Melee", 75);

        inventory.addItem(item);
        inventory.addItem("Apples", 20, "Fuji");
        inventory.addItem("Sword", 2, "Melee", 75);
        inventory.displayInventory("Fuji");
    }
}
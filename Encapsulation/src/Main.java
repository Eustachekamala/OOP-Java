public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Item item = new Item("Apples", 2) {
            @Override
            public void displayInfo() {
                System.out.println("Item: " + getName() + ", Quantity: " + getQuantity());
            }
        };

        inventory.addItem(item);
        inventory.addItem("Apples", 20, "Fuji");
        inventory.addItem("Sword", 2, "Melee", 75);
        inventory.displayInfo();
    }
}
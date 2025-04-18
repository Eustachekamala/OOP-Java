public abstract class Item {
    private String name;
    private int quantity;

    Item(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public abstract void displayInfo();
}

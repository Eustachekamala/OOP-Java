public class Fruit extends Item implements ItemStuff{
    private String type;
    private String name;
    private  int quantity;

    public Fruit(String name, int quantity, String type) {
        super(name, quantity);
        this.name = name;
        this.quantity = quantity;
        this.type = type;
    }

    public String getType(){
        return type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void displayInfo(){
        System.out.println("Fruit: " + getName() + ", Quantity: " + getQuantity() + ", Type: " + getType());;
    }
}

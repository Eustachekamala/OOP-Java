import java.util.ArrayList;

public class Inventory {

    private ArrayList<Item> items;

    public Inventory (){
        items = new ArrayList<>();
    }

    public  void addItem (Item item){
        items.add(item);
    }

    public void addItem(String name, int quantity, String type){
        items.add(new Fruit(name, quantity, type));
    }

    public void addItem(String name, int quantity, String type, int damage ){
        items.add(new Weapon(name, quantity, type, damage));
    }

    public void displayInfo(){
        for (Item item : items){
            item.displayInfo();
        }
    }

    public void displayInventory(String type){
        for (Item item : items){
            if(item instanceof Fruit && ((Fruit) item).getType().equalsIgnoreCase(type)){
                System.out.println(item.toString());
            } else if (item instanceof Weapon && ((Weapon) item).getType().equalsIgnoreCase(type)) {
                System.out.println(item.toString());
            }
        }
    }
}

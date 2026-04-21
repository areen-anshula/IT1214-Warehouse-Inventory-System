import java.util.HashMap;

public class Inventory {
    HashMap<String, Item> items = new HashMap<>();

    public void addItem(Item item) {
        if (items.containsKey(item.getItemID())) {
            System.out.println("That Item is already added!");
        } else {
            items.put(item.getItemID(), item);
        }
    }

    public void removeItem(String itemID) {
        items.remove(itemID);
    }

    public void updateQuantity(String itemID, int newQuantity) {
        Item item = items.get(itemID);
        if (item != null) {
            item.setQuantity(newQuantity);
        } else {
            System.out.println("Item not found!");
        }
    }

    public Item searchById(String itemId) {
        return items.get(itemId);
    }

    public void searchByName(String name) {
        boolean found = false;
        for (Item item : items.values()) {
            if (item.getItemName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(item);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No items found with name containing: " + name);
        }
    }

    public void displayAll() {
        for (Item item : items.values()) {
            System.out.println(item);
        }
    }
}
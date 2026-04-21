public class Item {
    private String itemID;
    private String itemName;
    private int quantity;
    private double price;

    Item(String itemID, String itemName, int quantity, double price) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getItemID() {
        return this.itemID;
    }
    
    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public String getItemName() {
        return this.itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item id: "+itemID+", Item name: "+itemName+", Quantity: "+quantity+", Price: "+price;
    }
    
}
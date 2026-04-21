import java.util.Scanner;

public class Warehouse {

    private Inventory inventory = new Inventory();
    private Scanner sc = new Scanner(System.in);

    public void start() {
        int choice = 0;
        while (choice != 6) {
            System.out.println("\n1.Add  2.Remove  3.Update  4.View  5.Search  6.Exit");
            System.out.print("Choice: ");
            choice = Integer.parseInt(sc.nextLine().trim());

            switch (choice) {
                case 1:
                    System.out.print("ID: ");    String id   = sc.nextLine();
                    System.out.print("Name: ");  String name = sc.nextLine();
                    System.out.print("Qty: ");   int qty     = Integer.parseInt(sc.nextLine());
                    System.out.print("Price: "); double price = Double.parseDouble(sc.nextLine());
                    inventory.addItem(new Item(id, name, qty, price));
                    break;

                case 2:
                    System.out.print("ID to remove: ");
                    inventory.removeItem(sc.nextLine());
                    break;

                case 3:
                    System.out.print("ID: ");
                    String uid = sc.nextLine();
                    System.out.print("New qty: ");
                    inventory.updateQuantity(uid, Integer.parseInt(sc.nextLine()));
                    break;

                case 4:
                    inventory.displayAll();
                    break;

                case 5:
                    System.out.print("Search (ID or name): ");
                    String query = sc.nextLine();
                    Item found = inventory.searchById(query);
                    if (found != null) System.out.println(found);
                    else inventory.searchByName(query);
                    break;

                case 6:
                    System.out.println("Goodbye!");
                    break;
            }
        }
    }

    private void showMenu() {
        System.out.println("\n1.Add  2.Remove  3.Update  4.View  5.Search  6.Exit");
    }

    private int readInt(String prompt) {
        System.out.print(prompt);
        return Integer.parseInt(sc.nextLine().trim());
    }

    private void handleAdd() {
        System.out.print("ID: ");
        String id = sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Qty: ");
        int qty = Integer.parseInt(sc.nextLine());
        System.out.print("Price: ");
        double price = Double.parseDouble(sc.nextLine());
        inventory.addItem(new Item(id, name, qty, price));
    }

    private void handleRemove() {
        System.out.print("ID to remove: ");
        inventory.removeItem(sc.nextLine());
    }

    private void handleUpdateQuantity() {
        System.out.print("ID: ");
        String uid = sc.nextLine();
        System.out.print("New qty: ");
        inventory.updateQuantity(uid, Integer.parseInt(sc.nextLine()));
    }

    private void handleSearch() {
        System.out.print("Search (ID or name): ");
        String query = sc.nextLine();
        Item found = inventory.searchById(query);
        if (found != null) System.out.println(found);
        else inventory.searchByName(query);
    }

    public static void main(String[] args) {
        new Warehouse().start();
    }
}
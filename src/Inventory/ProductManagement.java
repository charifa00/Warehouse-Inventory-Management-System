package Inventory;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeSet;

public class ProductManagement {
    private HashMap<Integer, Product> productList = new HashMap<>();
    private ArrayList<Product> dailyShipments = new ArrayList<>();

    private Comparator<Product> productNameComparator = Comparator.comparing(Product::getName);

    public void addProduct(Product product) {
        productList.put(product.getId(), product);
        dailyShipments.add(product);
    }

    public Product getProductById(int id) {
        return productList.get(id);
    }

    public TreeSet<Product> getProductsSortedByName() {
        TreeSet<Product> sortedList = new TreeSet<>(productNameComparator);
        sortedList.addAll(productList.values());
        return sortedList;
    }

    public void displayAllProducts() {
        for (Product product : productList.values()) {
            product.displayInfo();
            System.out.println("----------");
        }
    }

    public void displayDailyShipments() {
        System.out.println("Daily Shipments:");
        for (Product product : dailyShipments) {
            product.displayInfo();
            System.out.println("----------");
        }
    }
}

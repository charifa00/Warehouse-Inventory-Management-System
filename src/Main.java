import Inventory.*;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        ProductManagement pm = new ProductManagement();
        pm.addProduct(new Product(4, "dell", 800.00, 15));
        pm.addProduct(new Product(1, "hp", 1200.00, 10));
        pm.addProduct(new Product(2, "Samsung", 800.00, 15));
        pm.addProduct(new Product(3, "huawei", 300.00, 20));
        System.out.println("all products:");
        pm.displayAllProducts();
        System.out.println("");
        pm.displayDailyShipments();
        System.out.println("");
        TreeSet<Product> sortedProducts = pm.getProductsSortedByName();
        System.out.println("Sorted Products:");
        for (Product product : sortedProducts) {
            product.displayInfo();
            System.out.println("----------");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the ID of the product you want to find: ");
        int id = scanner.nextInt();

        Product product = pm.getProductById(id);
        if (product != null) {
            System.out.println("--------Product details-------");
            product.displayInfo();
        } else {
            System.out.println("Product with ID " + id + " not found!");
        }

    }
}

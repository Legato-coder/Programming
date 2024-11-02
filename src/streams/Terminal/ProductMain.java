package streams.Terminal;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductMain {
	
	
    public static void main(String[] args) {
        // Create a list of products
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1200.00));
        products.add(new Product("Smartphone", 800.00));
        products.add(new Product("Tablet", 300.00));
        products.add(new Product("Monitor", 250.00));
        products.add(new Product("Keyboard", 100.00));

        // 1. Using collect() to create a list of product names
        List<String> productNames = products.stream()
            .map(Product::getName)
            .collect(Collectors.toList());

        System.out.println("Product Names: " + productNames);

        // 2. Using forEach() to print each product's details
        System.out.println("Product Details:");
        products.stream()
            .forEach(product -> System.out.println(product.getName() + ": $" + product.getPrice()));

        // 3. Using count() to get the total number of products
        long productCount = products.stream().count();
        System.out.println("Total number of products: " + productCount);

        // 4. Using reduce() to calculate the total price of all products
        double totalPrice = products.stream()
            .map(Product::getPrice)
            .reduce(0.0, Double::sum);

        System.out.println("Total Price of Products: $" + totalPrice);
    }
}

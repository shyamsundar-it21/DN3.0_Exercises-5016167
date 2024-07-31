package ecommerceplatform;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Smartphone", "Electronics"),
            new Product(3, "Desk Chair", "Furniture"),
            new Product(4, "Coffee Maker", "Appliances")
        };

        // Linear Search
        Product resultLinear = SearchAlgorithms.linearSearch(products, 3);
        if (resultLinear != null) {
            System.out.println("Linear Search: Found " + resultLinear.getProductName());
        } else {
            System.out.println("Linear Search: Product not found.");
        }

        // Sorting for Binary Search
        Arrays.sort(products, (a, b) -> Integer.compare(a.getProductId(), b.getProductId()));

        // Binary Search
        Product resultBinary = SearchAlgorithms.binarySearch(products, 3);
        if (resultBinary != null) {
            System.out.println("Binary Search: Found " + resultBinary.getProductName());
        } else {
            System.out.println("Binary Search: Product not found.");
        }
    }
}

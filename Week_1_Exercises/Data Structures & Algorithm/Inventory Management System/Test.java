package inventorymanagementsystem;

public class Test {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();
        
        // Adding products
        Product product1 = new Product(1, "Laptop", 10, 999.99);
        Product product2 = new Product(2, "Smartphone", 20, 499.99);
        
        manager.addProduct(product1);
        manager.addProduct(product2);
        
        // Retrieving and displaying a product
        Product p = manager.getProduct(1);
        System.out.println("Product ID: " + p.getProductId() + ", Name: " + p.getProductName() + ", Price: " + p.getPrice());

        // Updating a product
        product1.setPrice(899.99);
        manager.updateProduct(product1);
        
        // Deleting a product
        manager.deleteProduct(2);
        
        // Trying to retrieve a deleted product
        p = manager.getProduct(2);
        if (p == null) {
            System.out.println("Product with ID 2 not found.");
        }
    }
}

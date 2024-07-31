package sortingcustomerorders;

public class Test {

    public static void main(String[] args) {
        Order[] orders = {
            new Order(1, "Alice", 250.0),
            new Order(2, "Bob", 150.0),
            new Order(3, "Charlie", 200.0),
            new Order(4, "Diana", 300.0)
        };

        // Bubble Sort
        SortAlgorithms.bubbleSort(orders);
        System.out.println("Bubble Sort:");
        for (Order order : orders) {
            System.out.println("Order ID: " + order.getOrderId() + ", Total Price: " + order.getTotalPrice());
        }

        // Reinitialize the orders array for Quick Sort
        orders = new Order[]{
            new Order(1, "Alice", 250.0),
            new Order(2, "Bob", 150.0),
            new Order(3, "Charlie", 200.0),
            new Order(4, "Diana", 300.0)
        };
        SortAlgorithms.quickSort(orders, 0, orders.length - 1);
        System.out.println("Quick Sort:");
        for (Order order : orders) {
            System.out.println("Order ID: " + order.getOrderId() + ", Total Price: " + order.getTotalPrice());
        }
    }
}

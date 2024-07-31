package employeemanagementsystem;

public class Test {

    public static void main(String[] args) {
        
        EmployeeManager manager = new EmployeeManager(5);

     
        manager.addEmployee(new Employee(1, "Alice", "Manager", 75000.00));
        manager.addEmployee(new Employee(2, "Bob", "Developer", 60000.00));
        manager.addEmployee(new Employee(3, "Charlie", "Analyst", 55000.00));
        manager.addEmployee(new Employee(4, "Diana", "Designer", 50000.00));
        manager.addEmployee(new Employee(5, "Eve", "HR", 48000.00));

     
        System.out.println("All employees:");
        manager.traverseEmployees();

      
        System.out.println("\nSearching for employee with ID 3:");
        Employee employee = manager.searchEmployeeById(3);
        if (employee != null) {
            System.out.println(employee);
        } else {
            System.out.println("Employee not found.");
        }

 
        System.out.println("\nDeleting employee with ID 2:");
        boolean deleted = manager.deleteEmployeeById(2);
        if (deleted) {
            System.out.println("Employee deleted successfully.");
        } else {
            System.out.println("Employee not found.");
        }

   
        System.out.println("\nAll employees after deletion:");
        manager.traverseEmployees();
    }
}

import java.util.*;

// Employee class
class Employee {
    int id;
    String name;
    double salary;

    public Employee() { }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
}

// CollectionMap class
class CollectionMap {
    private Map<Integer, Employee> employeeMap;

    public CollectionMap() {
        this.employeeMap = new HashMap<>();
    }

    public Map<Integer, Employee> getEmployeeMap() {
        return employeeMap;
    }

    public void setEmployeeMap(Map<Integer, Employee> employeeMap) {
        this.employeeMap = employeeMap;
    }

    public int addEmployee(Employee emp) {
        if (emp == null) {
            return 1; // Error: Null entry
        }
        if (employeeMap.containsKey(emp.getId())) {
            return 2; // Duplicate entry
        }
        employeeMap.put(emp.getId(), emp);
        return 0; // Success
    }

    public int removeEmployee(int employeeId) {
        if (!employeeMap.containsKey(employeeId)) {
            return 2; // Employee not found
        }
        employeeMap.remove(employeeId);
        return 0; // Success
    }

    public Employee findEmployee(int employeeId) {
        return employeeMap.getOrDefault(employeeId, null); // Returns null if not found
    }

    public List<Employee> getEmployeeList() {
        if (employeeMap.isEmpty()) {
            return null; // Map is empty
        }
        return new ArrayList<>(employeeMap.values()); // Return list of employees
    }
}

// TestEmployee class
public class TestEmployee {
    public static void main(String[] args) {
        CollectionMap collectionMap = new CollectionMap();

        // Create some Employee objects
        Employee emp1 = new Employee(1, "Alice", 50000);
        Employee emp2 = new Employee(2, "Bob", 60000);
        Employee emp3 = new Employee(3, "Charlie", 70000);

        // Test adding employees
        System.out.println("Adding Employee 1: " + collectionMap.addEmployee(emp1)); // Expected: 0
        System.out.println("Adding Employee 2: " + collectionMap.addEmployee(emp2)); // Expected: 0
        System.out.println("Adding Employee 1 again: " + collectionMap.addEmployee(emp1)); // Expected: 2 (duplicate)

        // Test finding employees
        System.out.println("Finding Employee 1: " + collectionMap.findEmployee(1)); // Expected: emp1 details
        System.out.println("Finding Employee 4: " + collectionMap.findEmployee(4)); // Expected: null (not found)

        // Test removing employees
        System.out.println("Removing Employee 2: " + collectionMap.removeEmployee(2)); // Expected: 0
        System.out.println("Removing Employee 2 again: " + collectionMap.removeEmployee(2)); // Expected: 2 (not found)

        // Test getting employee list
        List<Employee> employeeList = collectionMap.getEmployeeList();
        System.out.println("Employee List: " + (employeeList != null ? employeeList : "null")); // Expected: List with emp1

        // Add another employee and test the list again
        collectionMap.addEmployee(emp3);
        employeeList = collectionMap.getEmployeeList();
        System.out.println("Updated Employee List: " + (employeeList != null ? employeeList : "null")); // Expected: List with emp1 and emp3
    }
}
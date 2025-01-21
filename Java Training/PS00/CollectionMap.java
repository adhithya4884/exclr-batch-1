import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

class Employee {
    int id;
    String name;
    double salary;

    public Employee() {
    }

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

public class CollectionMap {
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
            return 2; // Error: Duplicate entry
        }
        employeeMap.put(emp.getId(), emp);
        return 0; // Success
    }

    public int removeEmployee(int employeeId) {
        if (employeeMap == null || employeeMap.isEmpty()) {
            return 1; // Error: Map is empty
        }
        if (!employeeMap.containsKey(employeeId)) {
            return 2; // Error: Employee not found
        }
        employeeMap.remove(employeeId);
        return 0; // Success
    }

    public Employee findEmployee(int employeeId) {
        if (employeeMap == null || employeeMap.isEmpty()) {
            return null; // Error: Map is empty
        }
        return employeeMap.get(employeeId); // Returns Employee or null if not found
    }

    public List<Employee> getEmployeeList() {
        if (employeeMap == null || employeeMap.isEmpty()) {
            return null; // Error: Map is empty
        }
        return new ArrayList<>(employeeMap.values());
    }
}

// TestEmployee Class
public class TestEmployee {
    public static void main(String[] args) {
        // Create CollectionMap instance
        CollectionMap collectionMap = new CollectionMap();

        // Create some Employee objects
        Employee emp1 = new Employee(1, "Alice", 50000);
        Employee emp2 = new Employee(2, "Bob", 60000);
        Employee emp3 = new Employee(3, "Charlie", 55000);

        // Test addEmployee method
        System.out.println("Add Employee 1: " + collectionMap.addEmployee(emp1)); // Expected: 0
        System.out.println("Add Employee 2: " + collectionMap.addEmployee(emp2)); // Expected: 0
        System.out.println("Add Employee 1 again: " + collectionMap.addEmployee(emp1)); // Expected: 2
        System.out.println("Add null Employee: " + collectionMap.addEmployee(null)); // Expected: 1

        // Test findEmployee method
        System.out.println("Find Employee 1: " + collectionMap.findEmployee(1)); // Expected: Employee details
        System.out.println("Find Employee 3 (not added): " + collectionMap.findEmployee(3)); // Expected: null

        // Test removeEmployee method
        System.out.println("Remove Employee 2: " + collectionMap.removeEmployee(2)); // Expected: 0
        System.out.println("Remove Employee 2 again: " + collectionMap.removeEmployee(2)); // Expected: 2

        // Test getEmployeeList method
        System.out.println("Get Employee List: " + collectionMap.getEmployeeList()); // Expected: List of employees (only emp1)

        // Add more employees and list them
        collectionMap.addEmployee(emp3);
        System.out.println("Get Updated Employee List: " + collectionMap.getEmployeeList()); // Expected: List with emp1 and emp3
    }
}

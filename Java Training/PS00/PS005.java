class Employee {
    private int id;
    private String name;
    private double salary;
    
    public Employee() {}

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

class CollectionMap {
    private Employee[] empArray;
    private int size;

    public CollectionMap() {
        empArray = new Employee[10];
        size = 0;
    }

    private void resize() {
        Employee[] newArray = new Employee[empArray.length * 2];
        System.arraycopy(empArray, 0, newArray, 0, empArray.length);
        empArray = newArray;
    }

    public void addEmployee(Employee emp) throws IllegalArgumentException {
        if (emp == null) {
            throw new IllegalArgumentException("Employee cannot be null");
        }
        if (exists(emp.getId())) {
            throw new IllegalArgumentException("Employee with ID " + emp.getId() + " already exists");
        }
        if (size >= empArray.length) {
            resize();
        }
        empArray[size++] = emp;
    }

    public void removeEmployee(int id) throws IllegalArgumentException {
        for (int i = 0; i < size; i++) {
            if (empArray[i].getId() == id) {
                System.arraycopy(empArray, i + 1, empArray, i, size - i - 1);
                empArray[--size] = null;
                return;
            }
        }
        throw new IllegalArgumentException("Employee with ID " + id + " not found");
    }

    public boolean exists(int id) {
        for (int i = 0; i < size; i++) {
            if (empArray[i].getId() == id) {
                return true;
            }
        }
        return false;
    }

    public void getEmployees() {
        if (size == 0) {
            System.out.println("No employees in the collection.");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.println(empArray[i].toString());
            }
        }
    }
}

public class PS005 {
    public static void main(String[] args) {
        CollectionMap collection = new CollectionMap();

        // Adding employees
        try {
            System.out.println("Adding employees:");
            collection.addEmployee(new Employee(1, "John Doe", 50000));
            collection.addEmployee(new Employee(2, "Jane Smith", 60000));
            collection.addEmployee(new Employee(3, "Bob Johnson", 55000));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Displaying employees
        System.out.println("\nEmployees in the collection:");
        collection.getEmployees();

        // Removing an employee
        try {
            System.out.println("\nRemoving employee with ID 2:");
            collection.removeEmployee(2);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Displaying employees after removal
        System.out.println("\nEmployees after removal:");
        collection.getEmployees();

        // Trying to add an employee with an existing ID
        try {
            System.out.println("\nTrying to add an employee with an existing ID:");
            collection.addEmployee(new Employee(1, "Duplicate ID", 70000));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Displaying final employee list
        System.out.println("\nFinal employee list:");
        collection.getEmployees();
    }
}

class Parent {
    public String Name = "Hitler";
    void parentDetails() {
        System.out.println("Parent's name is " + Name);
    }
}

class Child extends Parent {
    String Son = "John"; // Initialized with a value

    void childDetails() {
        System.out.println("Son's full name is " + super.Name + ". " + Son);
    }
}

public class Demo011 {
    public static void main(String[] args) {
        Parent pobj = new Parent();
        pobj.parentDetails();
        Child cobj = new Child();
        cobj.childDetails();
    }
}

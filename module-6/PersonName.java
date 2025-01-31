// Steve Stylin Module 6: Accessing and Modifying Attributes

// Defining a class named 'Person'
class Person {
    // Private attributes
    private String name;
    private int age;

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        if (age > 0) { // Simple validation
            this.age = age;
        }
    }
}

public class PersonName {
    public static void main(String[] args) {
        // Creating an object of the Person class
        Person person = new Person();
        
        // Using setter methods to modify attributes
        person.setName("Alice");
        person.setAge(30);
        
        // Using getter methods to access attributes
        System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
    }
}

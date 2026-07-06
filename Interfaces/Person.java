public class Person {

    protected String name;
    protected double salary;
    protected int code;

    // Constructor
    public Person(String name, double salary, int code) {
        this.name = name;
        this.salary = salary;
        this.code = code;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getCode() {
        return code;
    }

    // toString method
    @Override
    public String toString() {
        return "Name: " + name +
               "\nSalary: " + salary +
               "\nCode: " + code;
    }
}

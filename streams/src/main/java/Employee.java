public class Employee {

    private int salary;
    private String department;
    private int age;

    public Employee(int salary, String department, int age) {
        this.salary = salary;
        this.department = department;
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public int getAge() {
        return age;
    }
}

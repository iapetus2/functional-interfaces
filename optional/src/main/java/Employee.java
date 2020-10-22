import java.util.Optional;

public class Employee {
    private Integer salary;

    public Optional<Integer> getSalary() {
        return Optional.ofNullable(salary);
    }

    public Employee(Integer salary) {
        this.salary = salary;
    }
}
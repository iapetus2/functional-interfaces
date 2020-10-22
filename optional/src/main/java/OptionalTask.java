import com.google.common.collect.ImmutableSet;

import java.util.Optional;
import java.util.Set;

public class OptionalTask {
    public static void main(String[] args) {

        Optional<Employee> _1 = Optional.of(new Employee(1000));
        Optional<Employee> _2 = Optional.of(new Employee(2000));
        Optional<Employee> _3 = Optional.of(new Employee(null));
        Optional<Employee> _4 = Optional.ofNullable(null);

        Set<Optional<Employee>> employees_1234 = ImmutableSet.of(_1, _2, _3, _4);
        Set<Optional<Employee>> employees_34 = ImmutableSet.of(_3, _4);
        Set<Optional<Employee>> employees_4 = ImmutableSet.of(_4);

        //expected output 2000
        System.out.println(getMaxSalaryOrElse(employees_1234, 0));

        //expected output 0
        System.out.println(getMaxSalaryOrElse(employees_34, 0));

        //expected output 0
        System.out.println(getMaxSalaryOrElse(employees_4, 0));
    }

    private static Integer getMaxSalaryOrElse(Set<Optional<Employee>> employees, int defaultValue) {
        //implement me
    }
}

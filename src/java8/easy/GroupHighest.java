//Given a list of employees, group them by their Department and find the highest-paid employee in each department
package java8.easy;

import java.util.*;
import java.util.stream.Collectors;

record Employee(int empId, String name, String dept, float sal) {}
public class GroupHighest {
    public static void main (String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "John", "IT", 50000),
                new Employee(2, "Jane", "HR", 60000),
                new Employee(3, "Mike", "IT", 70000),
                new Employee(4, "Sara", "HR", 80000),
                new Employee(5, "Tom", "Finance", 90000)
        );

        Map<String, Optional<Employee>> highestPaidByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::dept,
                        Collectors.maxBy(Comparator.comparing(Employee::sal))));

        highestPaidByDept.forEach((dept, emp) -> {
            System.out.println("Department: " + dept + ", Highest Paid Employee: " + emp.orElse(null));
        });
    }
}

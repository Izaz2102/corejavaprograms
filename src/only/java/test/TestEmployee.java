package only.java.test;

import only.java.test.Employee;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setSalary(50000.0);
        //employee.salary = 3000; encapsulation example
        System.out.println("Employee salary: " + employee.getSalary());
    }
}
package interview;

public class Employee {
    private String name;
    private int id;
    private float salary;

    public Employee(String name, int id, float salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Employee)) {
            return false;
        }
        Employee employee = (Employee) obj;
        return id == employee.id
                && Double.compare(salary, employee.salary) == 0
                && name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id);
    }
}

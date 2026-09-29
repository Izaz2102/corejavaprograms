package interview;

import java.util.HashMap;

//Hashmap if hashcode() not override in employee class and trying to add same element to map what happens?
public class HashCodeNotOverride {
    public static void main(String[] args) {
        Employee e1 = new Employee("John", 25, 50000);
        Employee e2 = new Employee("John", 25, 50000);
        Employee e3 = new Employee("Jane", 30, 60000);

        HashMap<Employee, String> map = new HashMap<>();
        map.put(e1, "Employee 1");
        map.put(e2, "Employee 2");
        map.put(e3, "Employee 3");

        System.out.println("e1 hashcode: "+ e1.hashCode() +" e2 hashcode: "+ e2.hashCode() +" e3 hashcode: "+ e3.hashCode());

        System.out.println("Map contents:");
        for (HashMap.Entry<Employee, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

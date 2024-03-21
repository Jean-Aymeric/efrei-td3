package TD3;

import java.text.ParseException;
import java.util.Date;

public class Employee extends Person {
    private double salary;

    public Employee() throws ParseException {
    }

    public Employee(String lastName, String firstName, Date birthDate, double salary) {
        super(lastName, firstName, birthDate);
        this.salary = salary;
    }

    public Employee(String lastName, String firstName, String birthDate, double salary) throws ParseException {
        super(lastName, firstName, birthDate);
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                "} " + super.toString();
    }
}

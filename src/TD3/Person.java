package TD3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
    private final Date birthDate;
    private String lastName;
    private String firstName;
    

    public Person() throws ParseException {
        this("John", "Doe", "2001-01-01");
    }

    public Person(final String lastName, final String firstName, final Date birthDate) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDate = birthDate;
    }

    public Person(final String lastName, final String firstName, final String birthDate) throws ParseException {
        this(lastName, firstName, new SimpleDateFormat("yyyy-MM-DD").parse(birthDate));
    }

    public Date getBirthDate() {
        return this.birthDate;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "birthDate=" + this.birthDate +
                ", lastName='" + this.lastName + '\'' +
                ", firstName='" + this.firstName + '\'' +
                '}';
    }
}
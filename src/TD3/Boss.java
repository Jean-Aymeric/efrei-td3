package TD3;

import java.text.ParseException;
import java.util.Date;

public class Boss extends Employee {
    private String society;

    public Boss() throws ParseException {
    }

    public Boss(String lastName, String firstName, Date birthDate, double salary, String society) {
        super(lastName, firstName, birthDate, salary);
        this.society = society;
    }

    public Boss(String lastName, String firstName, String birthDate, double salary, String society) throws
                                                                                                    ParseException {
        super(lastName, firstName, birthDate, salary);
        this.society = society;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "society='" + society + '\'' +
                "} " + super.toString();
    }
}

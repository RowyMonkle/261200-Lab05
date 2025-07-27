import java.time.LocalDate;

public class User {
    protected String name;
    protected LocalDate dob;

    public User() {
        name = null;
        dob = LocalDate.now();
    }
    public User(String name, int year, int month, int dateOfMonth) {
        this.name = name;
        this.dob = LocalDate.of(year, month, dateOfMonth);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    public boolean isBirthday() {
        LocalDate today = LocalDate.now();
        return today.getMonth() == dob.getMonth() && today.getDayOfMonth() == dob.getDayOfMonth();
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Birthday: " + dob);
    }
    public void endOfDisplay() {
        System.out.println("===============");
    }
    public void displayHappyBirthday() { //Happy Birthday
        if (isBirthday()) {
            System.out.println("**!! Happy birthday " + this.name + "!!**");
        } else {
            System.out.println("Hey," + this.name + " you can't cheat your birth date you know?");
        }
    }
}

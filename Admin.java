import java.time.LocalDate;

public class Admin extends User {
    public Admin(String name, int year, int month, int dateOfMonth) {
        super(name, year, month, dateOfMonth); //constructor use as multiple
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("User type: admin");
    }
    public void displayInfo(boolean full) {
        if(full) {
            this.displayInfo();
            System.out.println("Today's date: " + LocalDate.now());
        } else {
            System.out.println(this.getName());
        }
    }
    @Override
    public void displayHappyBirthday() {
        if (isBirthday()) { 
            int age = LocalDate.now().getYear() - dob.getYear(); //age calculate
            System.out.println("Happy birthday " + this.name + "! You are " + age + "!");
        }
    }
}

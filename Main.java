public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        User nevan = new User("Ms.Nevan", 1954, 2, 18);
        nevan.displayInfo();
        nevan.endOfDisplay();

        User riis = new User("Mr.Rhys", 1981, 7,7); //add user to test isBirthday() and displayHappyBirthday()
        riis.displayInfo();
        riis.displayHappyBirthday(); //test new function
        riis.endOfDisplay();

        Admin nicolas = new Admin("Mr.Nicola Tesla", 1856, 7, 10);
        nicolas.displayInfo();
        nicolas.endOfDisplay();
        nicolas.displayInfo(true);
        nicolas.displayInfo(false);
        System.out.println("=================");

        Admin april = new Admin("Mr.April Godfrey", 1987, 7,27); //add new admin to test Ddmin.java override 
        april.displayInfo();
        april.displayHappyBirthday();
        april.endOfDisplay();
    }
}

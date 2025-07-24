public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        User nevan = new User("Ms.Nevan", 1954, 2, 18);
        nevan.displayInfo();

        Admin nicolas = new Admin("Mr.Nicola Tesla", 1856, 7, 10);
        nicolas.displayInfo();
        nicolas.displayInfo(true);
        nicolas.displayInfo(false);
    }
}

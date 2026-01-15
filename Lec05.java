import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        //Test User
        User john = new User("John", 1954,
                LocalDate.now().getMonthValue(),
                LocalDate.now().getDayOfMonth());

        System.out.println("---- User Info ----");
        john.displayInfo();
        john.displayHappyBirthday();

        //Admin
        Admin nicolas = new Admin("Nicolas", 1964,
                LocalDate.now().getMonthValue(),
                LocalDate.now().getDayOfMonth());

        System.out.println("\n---- Admin Info ----");
        nicolas.displayInfo();
        nicolas.displayHappyBirthday();

        System.out.println("\n---- Admin Full Info ----");
        nicolas.displayInfo(true);

        System.out.println("\n---- Admin Short Info ----");
        nicolas.displayInfo(false);
    }
}

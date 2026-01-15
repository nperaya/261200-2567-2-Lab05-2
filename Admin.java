import java.time.LocalDate;

public class Admin extends User {
    public Admin() {
        super();
    }


public Admin(String name, int year, int month, int date) {
    super(name, year, month, date);
}

@Override
public void displayInfo() {
    super.displayInfo();
    System.out.println("User type: admin.");
}

public void displayInfo(boolean full) {
    if(full) {
        this.displayInfo();
        System.out.println("Today's date: " + LocalDate.now());
    } else {
        System.out.println("Name: " + this.name);
    }
}
    @Override
    public void displayHappyBirthday() {
        int age = LocalDate.now().getYear() - this.getDob().getYear();
        if (isBirthday()) {
            System.out.println(
                    "Happy birthday " + this.name + "! You are " + age + "!"
            );
        }
    }
}

package Housekeeping;

public class LaundryMaid extends HousekeepingMaid {
    public LaundryMaid(String name, int age) {
        super(name, age);
        this.addSkill("Laundry");
    }
}
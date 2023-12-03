package Housekeeping;

public class CleaningMaid extends HousekeepingMaid {
    public CleaningMaid(String name, int age) {
        super(name, age);
        this.addSkill("Cleaning");
    }
}
package SE3.Housekeeping;

import SE3.Maid.Housekeeping.HousekeepingMaid;

public class CleaningMaid extends HousekeepingMaid {
    public CleaningMaid(String name, int age) {
        super(name, age);
        this.addSkill("Cleaning");
    }
}
package SE3.Housekeeping;

import SE3.Housekeeping.HousekeepingMaid;

public class LaundryMaid extends HousekeepingMaid {
    public LaundryMaid(String name, int age) {
        super(name, age);
        this.addSkill("Laundry");
    }
}
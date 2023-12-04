package SE3.Maid.CookingMaid;
import SE3.Maid.CookingMaid.CookingMaid;

public class DinnerMaid extends CookingMaid {
    public DinnerMaid(String name, int age) {
        super(name, age);
        this.addSkill("Dinner Preparation");
    }
}
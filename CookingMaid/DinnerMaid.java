package CookingMaid;

public class DinnerMaid extends CookingMaid {
    public DinnerMaid(String name, int age) {
        super(name, age);
        this.addSkill("Dinner Preparation");
    }
}
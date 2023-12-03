package CookingMaid;

public class PersonalChefMaid extends CookingMaid {
    public PersonalChefMaid(String name, int age) {
        super(name, age);
        this.addSkill("Personal Chef");
    }
}
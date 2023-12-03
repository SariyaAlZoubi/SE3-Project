package NannyMaid;

public class EducationalMaid extends NannyMaid {
    public EducationalMaid(String name, int age) {
        super(name, age);
        this.addSkill("Education");
    }
}
package NannyMaid;

public class ChildCareMaid extends NannyMaid {
    public ChildCareMaid(String name, int age) {
        super(name, age);
        this.addSkill("Child Care");
    }
}
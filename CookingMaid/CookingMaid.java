package CookingMaid;

import java.util.ArrayList;
import java.util.List;
import Maid.Maid;

public class CookingMaid implements Maid {
    private String name;
    private int age;
    private List<String> skills;

    public CookingMaid(String name, int age) {
        this.name = name;
        this.age = age;
        this.skills = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public List<String> getSkills() {
        return this.skills;
    }

    public void addSkill(String skill) {
        this.skills.add(skill);
    }

    public void removeSkill(String skill) {
        this.skills.remove(skill);
    }
}

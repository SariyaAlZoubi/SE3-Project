package Maid;

import java.util.List;

public interface Maid {
    String getName();
    int getAge();
    List<String> getSkills();
    void addSkill(String skill);
    void removeSkill(String skill);
}

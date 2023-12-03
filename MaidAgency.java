import Maid.Maid;

import java.util.ArrayList;
import java.util.List;

public class MaidAgency implements Maid {



    private List<Maid> maids;

    public MaidAgency() {
        this.maids = new ArrayList<>();
    }

    public void addMaid(Maid maid) {
        this.maids.add(maid);
    }

    public void removeMaid(Maid maid) {
        this.maids.remove(maid);
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public int getAge() {
        throw new UnsupportedOperationException();
    }

    public List<String> getSkills() {
        List<String> skills = new ArrayList<>();
        for (Maid maid : maids) {
            skills.addAll(maid.getSkills());
        }
        return skills;
    }

    public void addSkill(String skill) {
        throw new UnsupportedOperationException();
    }

    public void removeSkill(String skill) {
        throw new UnsupportedOperationException();
    }
}

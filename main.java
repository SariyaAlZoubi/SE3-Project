import Housekeeping.CleaningMaid;
import Housekeeping.HousekeepingMaid;

public class main {
    public static void main(String[] args){
        HousekeepingMaid h = new CleaningMaid("SAmia",12);
        MaidAgency maidAgency  = new MaidAgency();
        maidAgency.addMaid(h);

      System.out.println(  maidAgency.getSkills());


    }
}

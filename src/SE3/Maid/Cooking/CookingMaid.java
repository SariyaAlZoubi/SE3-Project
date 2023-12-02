package SE3.Maid.Cooking;


import SE3.Maid.Maid;

import java.util.List;

public class CookingMaid implements Maid {
    private String name;
    private String nationality;

    public CookingMaid(String name, String nationality) {
        this.name=name;
        this.nationality=nationality;
    }


    @Override
    public void print() {
    }
}




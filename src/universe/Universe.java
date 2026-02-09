
package universe;
import model.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Universe implements Configurable {

    private List<Lawyer> army;

    public Universe() {
        configureRandom();
    }

    @Override
    public void configureRandom() {
        army = new ArrayList<>();
        String[] specialties = {"property", "civil rights", "tort", "tax"};

        Random r = new Random(0);
    
        for (int i = 0; i < 5; i++) {
            int specialtyIndex = r.nextInt(specialties.length);
            Robot ro = new Robot(specialties[specialtyIndex]);
            CorporateLawyer lawyer = new CorporateLawyer(ro);
            army.add(lawyer);
            
        }
        
    }

}

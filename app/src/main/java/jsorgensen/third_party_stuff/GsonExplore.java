package jsorgensen.third_party_stuff;

import com.google.gson.Gson;

import java.util.Arrays;

/**
 * Created by MECH on 12/8/2017.
 */

public class GsonExplore {
    class Family{
        Family(String mother, String father, String[] kids, int years, boolean happy){
            this.mother = mother;
            this.father = father;
            this.kids = kids;
            this.years = years;
            this.happy = happy;
        }
        private String mother;
        private String father;
        private String[] kids;
        private int years;
        private boolean happy;
        String asString(){
            return "Mother: " + mother + "\nFather: " + father + "\nKids: " + Arrays.toString(kids).replaceAll("[\\[\\]]", "") + "\nYears Established: " + years + "\nHappy: " + happy;
        }
    }

    String[] kids = {"Emma", "Katie"};
    Family myFamily = new Family("Emily", "Mike", kids, 3, true);

    Gson gson = new Gson();
    String json = gson.toJson(myFamily);
}

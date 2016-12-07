package feature;

/**
 * Created by x1ku on 12/7/2016.
 */
public class Belly {
    private int cakes;

    public void eat(int cakes) {
        this.cakes = cakes;
    }

    public String getSound(int waitingTime) {
        if (cakes > 41 && waitingTime >= 1) {
            return "growl";
        } else {
            return "silent";
        }
    }
}

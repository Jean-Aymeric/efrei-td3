package vegetableGarden;

import java.util.ArrayList;

public class VegetableGarden extends ArrayList<Vegetable> {
    public void grows() {
        for (Vegetable vegetable : this) {
            vegetable.grow();
        }
    }
}


package vegetableGarden;

public class Tomatoes extends Vegetable {
    private final String species;


    public Tomatoes(String species) {
        super(20, 2);
        this.species = species;
    }

    @Override
    public String toString() {
        return "Tomatoes{" +
                "species='" + species + '\'' +
                "} " + super.toString();
    }
}

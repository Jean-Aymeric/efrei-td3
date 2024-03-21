import vegetableGarden.Cucumber;
import vegetableGarden.Tomatoes;
import vegetableGarden.TransgenicCucumber;
import vegetableGarden.VegetableGarden;

public class Main {
    public static void main(String[] args) {
        VegetableGarden potager = new VegetableGarden();
        potager.add(new Tomatoes("marmande"));
        potager.add(new Cucumber());
        potager.add(new TransgenicCucumber());
        System.out.println(potager);
        potager.grows();
        System.out.println(potager);
    }
}
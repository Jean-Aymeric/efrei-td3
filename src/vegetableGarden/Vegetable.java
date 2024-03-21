package vegetableGarden;

public abstract class Vegetable {
    private final int maxAge;
    private final int growingRate;
    private int age;
    private boolean alive;

    public Vegetable(final int maxAge, final int growingRate) {
        this.maxAge = maxAge;
        this.age = 0;
        this.alive = true;
        this.growingRate = growingRate;
    }

    public void kill() {
        this.alive = false;
    }

    public void grow() {
        if (this.alive) {
            if (this.age + (this.growingRate) > this.maxAge) {
                this.kill();
            } else {
                this.age = age + (this.growingRate);
            }
        }
    }

    @Override
    public String toString() {
        return "Vegetable{" +
                "maxAge=" + maxAge +
                ", age=" + age +
                ", alive=" + alive +
                ", growingRate=" + growingRate +
                '}';
    }
}

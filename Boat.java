public class Boat extends Vehicule {

    public Boat(String brand, int kilometers) {
        super(brand, kilometers);

    }

    @Override
    public String doStuff() {
        return ("Je m'appelle " + this.getBrand() + " et je fais glouglou");
    }

}

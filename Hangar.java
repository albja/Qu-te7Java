public class Hangar {
    public static void main(String[] args) {

        Car laguna = new Car("Laguna", 100);
        Car bugathi = new Car("Bugathi", 100);
        Car mazda = new Car("Mazda", 25600);
        Boat zodiac = new Boat("Zodiac", 170);
        Boat riva = new Boat("Riva", 12000);
        Boat beneteau = new Boat("Beneteau", 29540);
        System.out.println(laguna.doStuff());
        System.out.println(bugathi.doStuff());
        System.out.println(mazda.doStuff());
        System.out.println(zodiac.doStuff());
        System.out.println(riva.doStuff());
        System.out.println(beneteau.doStuff());
    }
}

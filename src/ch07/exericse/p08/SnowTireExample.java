package ch07.exericse.p08;

public class SnowTireExample {
    public static void main(String[] args) {
        SnowTire snowTire = new SnowTire();
        snowTire.run();

        Tire tire = snowTire;
        tire.run();

        Tire tire1 = new Tire();
        tire1.run();


    }
}

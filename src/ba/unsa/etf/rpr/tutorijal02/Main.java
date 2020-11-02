package ba.unsa.etf.rpr.tutorijal02;

public class Main {

    public static void main(String[] args) { System.out.println("Nema ništa u mainu, pokrenite testove!");
        // Test:
        Interval i = new Interval(1, 3, true, true);
        Interval i2 = new Interval(2, 5, true, true);
        Interval presjek = new Interval();
        presjek = Interval.intersect(i, i2);
        System.out.println("Početna je " + presjek.getPocetna() + ", a krajnja je " + presjek.getKrajnja());
    }
}
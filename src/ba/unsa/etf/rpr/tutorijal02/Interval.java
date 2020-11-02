package ba.unsa.etf.rpr.tutorijal02;

public class Interval {
    private double pocetna, krajnja;
    private boolean pripadaPocetna, pripadaKrajnja;

    public Interval(double v, double v1, boolean b, boolean b1) {
        if(v>v1) throw new IllegalArgumentException("Početna tačka je veća od krajnje");
        pocetna=v; krajnja=v1; pripadaPocetna=b; pripadaKrajnja=b1;
    }

    public Interval() {
        pocetna=0; krajnja=0; pripadaPocetna=false; pripadaKrajnja=false;;
    }

    public static Interval intersect(Interval i, Interval i2) {
            Interval novi = new Interval();
            if(i.pocetna<i2.pocetna && i.krajnja<i2.krajnja){
                novi.pocetna=i2.pocetna; novi.krajnja=i.krajnja;
            }else if(i2.pocetna<i.pocetna && i2.krajnja<i.krajnja){
                novi.pocetna=i.pocetna; novi.krajnja=i2.krajnja;
            }
            return novi;
    }

    public String toString() {
        return null;
    }

    public boolean isIn(double v) {
        if(pripadaPocetna && pripadaKrajnja){
            if(v>=pocetna && v<=krajnja) return true;
        }
        if(!pripadaPocetna && !pripadaKrajnja){
            if(v>pocetna && v<krajnja) return true;
        }
        return false;
    }

    public boolean isNull() {
        if(pocetna==0 && krajnja==0 && !pripadaPocetna && !pripadaKrajnja) return true;
        return false;
    }

    public Interval intersect(Interval interval) {
        Interval novi = new Interval();
        if(pocetna<interval.pocetna && krajnja<interval.krajnja){
            novi.pocetna=interval.pocetna; novi.krajnja=krajnja;
        }else if(interval.pocetna<pocetna && interval.krajnja<krajnja){
            novi.pocetna=pocetna; novi.krajnja=interval.krajnja;
        }
        return novi;
    }

    public double getPocetna(){
        return pocetna;
    }

    public double getKrajnja(){
        return krajnja;
    }
}

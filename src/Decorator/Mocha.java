package Decorator;

public class Mocha extends Decoration {
    Cakesheet cakesheet;

    public Mocha(Cakesheet cakesheet) {
        this.cakesheet = cakesheet;
    }

    @Override
    public long cost() {
        return cakesheet.cost() + 2000;
    }

    @Override
    public String getDescription() {
        return "모카 " + cakesheet.getDescription();
    }
}

package Decorator;

public class Chocolate extends Decoration {
    Cakesheet cakesheet;

    public Chocolate(Cakesheet cakesheet) {
        this.cakesheet = cakesheet;
    }

    @Override
    public long cost() {
        return cakesheet.cost() + 1500;
    }

    @Override
    public String getDescription() {
        return "초콜릿 " + cakesheet.getDescription();
    }
}

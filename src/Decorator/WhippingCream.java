package Decorator;

public class WhippingCream extends Decoration {
    Cakesheet cakesheet;

    public WhippingCream(Cakesheet cakesheet) {
        this.cakesheet = cakesheet;
    }

    @Override
    public long cost() {
        return cakesheet.cost() + 1000;
    }

    @Override
    public String getDescription() {
        return "생크림 " + cakesheet.getDescription();
    }
}

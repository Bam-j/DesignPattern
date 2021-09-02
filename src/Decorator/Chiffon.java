package Decorator;

public class Chiffon extends Cakesheet {
    public Chiffon() {
        description = "시폰 케이크";
    }

    @Override
    public long cost() {
        return 7000;
    }
}

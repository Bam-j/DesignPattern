package Decorator;

public class Sponge extends Cakesheet {
    public Sponge() {
        description = "스폰지 케이크";
    }

    @Override
    public long cost() {
        return 5000;
    }
}

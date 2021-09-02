package Decorator;

public abstract class Cakesheet {
    String description = "케이크시트";

    public String getDescription() {
        return description;
    }

    public abstract long cost();
}

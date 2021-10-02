package Proxy;

public class ProxyPrinter implements IPrinter {
    IPrinter printer;

    @Override
    public String print() {
        System.out.println("프록시 객체");

        printer = new RealPrinter();

        return printer.print();
    }
}
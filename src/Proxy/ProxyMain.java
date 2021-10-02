package Proxy;

public class ProxyMain {
    public static void main(String[] args) {
        IPrinter proxy = new ProxyPrinter();

        System.out.println(proxy.print());
    }
}

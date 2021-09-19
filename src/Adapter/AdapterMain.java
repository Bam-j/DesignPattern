package Adapter;

public class AdapterMain {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();

        System.out.println();

        iPhone.pairingGalaxyWatch();
    }
}

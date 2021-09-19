package Adapter;

public class IPhone {
    public IPhone() {
        AppleWatch appleWatch = new AppleWatch();
        appleWatch.appleFitness();
    }

    public void pairingGalaxyWatch() {
        GalaxyWatchAdapter galaxyWatchAdapter = new GalaxyWatchAdapter();
        galaxyWatchAdapter.galaxyFitness();
    }
}

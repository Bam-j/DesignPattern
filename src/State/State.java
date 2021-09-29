package State;

public interface State {
    public void insertCash(CoinChanger coinChanger);
    public void ejectCash(CoinChanger coinChanger);
    public void dispenseCoin(CoinChanger coinChanger, int cash);
}

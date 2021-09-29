package State;

public class CoinChanger {
    private State noCashState;
    private State hasCashState;
    private State noMoreCoinState;
    private State currentState;
    private int coin = 100;

    public CoinChanger() {
        noCashState = new NoCash();
        hasCashState = new HasCashState();
        noMoreCoinState = new NoMoreCoin();
        currentState = noCashState;
    }

    public void insertCash() {
        currentState.insertCash(this);
    }

    public void ejectCash() {
        currentState.ejectCash(this);
    }

    public void dispenseCoin(int cash) {
        currentState.dispenseCoin(this, cash);
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public int getCurrentCoin() {
        return coin;
    }

    public void setCurrentCoin(int coin) {
        this.coin = coin;
    }

    public State getNoCashState() {
        return noCashState;
    }

    public State getHasCashState() {
        return hasCashState;
    }

    public State getNoMoreCoinState() {
        return noMoreCoinState;
    }

    public State getCurrentState() {
        return currentState;
    }
}

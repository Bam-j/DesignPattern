package State;

public class HasCashState implements State {
    @Override
    public void insertCash(CoinChanger coinChanger) {
        System.out.println("이미 지폐가 투입되어 있습니다.");
    }

    @Override
    public void ejectCash(CoinChanger coinChanger) {
        System.out.println("삽입된 지폐를 반환합니다. 상태 변경");

        coinChanger.setState(coinChanger.getNoCashState());
    }

    @Override
    public void dispenseCoin(CoinChanger coinChanger, int cash) {
        int currentCoin = coinChanger.getCurrentCoin();

        if(currentCoin < cash) {
            System.out.println("동전교환기 내의 동전이 충분하지 않습니다.");
        }
        else {
            System.out.println(cash+"개의 동전 배출");

            int remainCoin = currentCoin - cash;

            coinChanger.setCurrentCoin(remainCoin);
        }

        currentCoin = coinChanger.getCurrentCoin();

        if(currentCoin <= 0) {
            coinChanger.setState(coinChanger.getNoMoreCoinState());
        }
    }
}

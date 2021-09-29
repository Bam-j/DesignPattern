package State;

public class NoMoreCoin implements State {
    @Override
    public void insertCash(CoinChanger coinChanger) {
        System.out.println("이미 지폐가 삽입되어있습니다. +기계 내 동전 부족+");
    }

    @Override
    public void ejectCash(CoinChanger coinChanger) {
        System.out.println("지폐를 반환합니다. +기계 내 동전 부족+");

        coinChanger.setState(coinChanger.getNoCashState());
    }

    @Override
    public void dispenseCoin(CoinChanger coinChanger, int cash) {
        System.out.println("기계 내에 동전이 없습니다.");
    }
}

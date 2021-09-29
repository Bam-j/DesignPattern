package State;

public class NoCash implements State {
    @Override
    public void insertCash(CoinChanger coinChanger) {
        System.out.println("지폐 삽입. 상태 변경");

        coinChanger.setState(coinChanger.getHasCashState());
    }

    @Override
    public void ejectCash(CoinChanger coinChanger) {
        System.out.println("지폐가 삽입된 상태가 아닙니다.");
    }

    @Override
    public void dispenseCoin(CoinChanger coinChanger, int cash) {
        System.out.println("지폐가 삽입되지 않아 반환 할 동전이 없습니다.");
    }
}

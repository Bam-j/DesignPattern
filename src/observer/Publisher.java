package observer;

public interface Publisher {
    //퍼블리셔는 구독자를 얻고 잃고, 정보를 알리는 역할을 합니다.
    public void registerSubscriber(Subscriber s);
    public void removeSubscriber(Subscriber s);
    public void notifySubscriber();
}

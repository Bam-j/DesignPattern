package observer;

public interface Subscriber {
    //구독자는 정보(기사)를 받아서 업데이트 합니다.
    public void update(String article);
}

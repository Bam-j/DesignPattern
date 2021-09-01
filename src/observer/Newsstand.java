package observer;

public class Newsstand {
    public static void main(String[] args) {
        PublishingSystem publishingSystem = new PublishingSystem();
        Subscriber Ann = new Ann(publishingSystem);
        Subscriber Jay = new Jay(publishingSystem);
        Subscriber John = new John(publishingSystem);

        publishingSystem.setArticle("솔의 눈 대인기!");

        //Jay가 구독 취소
        publishingSystem.removeSubscriber(Jay);

        System.out.println("==================");
        publishingSystem.setArticle("총알보다 빠른 거북이 발견");
    }
}

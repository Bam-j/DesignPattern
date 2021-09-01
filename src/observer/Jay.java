package observer;

public class Jay implements Subscriber{
    private String article;
    private Publisher publisher;

    public Jay(Publisher publisher) {
        this.publisher = publisher;
        publisher.registerSubscriber(this);
    }

    @Override
    public void update(String article) {
        this.article = article;
        display();
    }

    private void display() {
        System.out.println("Jay는 \'" + article + "\' 이라는 기사를 읽고 정보를 얻었습니다.");
    }
}

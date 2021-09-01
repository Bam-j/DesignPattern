package observer;

public class Ann implements Subscriber {
    private String article;
    private Publisher publisher;

    public Ann(Publisher publisher) {
        this.publisher = publisher;
        publisher.registerSubscriber(this);
    }

    @Override
    public void update(String article) {
        this.article = article;
        display();
    }

    private void display() {
        System.out.println("Ann은 \'" + article + "\' 이라는 기사를 읽고 정보를 얻었습니다.");
    }
}

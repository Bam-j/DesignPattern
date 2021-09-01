package observer;

import java.util.ArrayList;

public class PublishingSystem implements Publisher {
    private ArrayList subscribers;
    private String article;

    public PublishingSystem() {
        subscribers = new ArrayList();
    }

    @Override
    public void registerSubscriber(Subscriber s) {
        subscribers.add(s);
    }

    @Override
    public void removeSubscriber(Subscriber s) {
        int i = subscribers.indexOf(s);

        if (i >= 0) {
            subscribers.remove(s);
        }
    }

    //정보가 갱신되면
    @Override
    public void notifySubscriber() {
        for (int i = 0; i < subscribers.size(); i++) {
            Subscriber subscriber = (Subscriber) subscribers.get(i);

            subscriber.update(article);
        }
    }

    public void updateArticles() {
        notifySubscriber();
    }

    public void setArticle(String article) {
        this.article = article;
        updateArticles();
    }
}

import java.util.concurrent.Flow.Publisher;
import java.util.concurrent.Flow.Subscriber;
import java.util.ArrayList;
import java.util.List;

public class NewsPublisher implements Publisher<News> {
    private String news;
    private ArrayList<NewsSubscriber> newsSubscriberAList = new ArrayList<>();

    @Override
    public void subscribe(NewsSubscriber newsSubscribers){
        this.newsSubscriberAList.add(newsSubscribers);
    }

    @Override
    public void removeSubscriber(NewsSubscriber newsSubscribers) {
        this.newsSubscriberAList.remove(newsSubscribers);
    }

	@Override
	    public void publish(News news){
	        for(NewsSubscriber newsSubscriber : newsSubscriberAList){
	            newsSubscriber.update(news.getContent());
	        }
	    }

}

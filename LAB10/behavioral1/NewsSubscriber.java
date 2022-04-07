import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

public class NewsSubscriber implements Subscriber{
    private String subname;

    public NewsSubscriber(String name){
        this.subname = name;
    }

    @Override
    public void getNews(String contents) {
        System.out.println(this.subname + " You got new content : " + contents);
    }
}


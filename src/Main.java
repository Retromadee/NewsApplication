import Model.Observer.MobileUser;
import Model.Observer.Observer;
import Model.Observer.WebUser;
import Model.Subject.NewsAgent;

public class Main {
    public static void main(String[] args) {
        

        
        
        String news = "Trump says he doesn’t plan to remove Fed chairman Jerome Powell";
        
        NewsAgent newsAgent = new NewsAgent();
        Observer user1 = new MobileUser("Retro");
        Observer user2 = new WebUser("Ghani");
        Observer user3 = new MobileUser("Uriel");
        
        newsAgent.addObserver(user1);
        newsAgent.addObserver(user2);
        newsAgent.addObserver(user3);
        
        newsAgent.displayNews(news);
        System.out.println();
        
        newsAgent.displayNews("What’s next for TikTok now that the app might get banned in the US?");
        
        System.out.println();
        newsAgent.removeObserver(user1);
        newsAgent.displayNews("Four friends posed for a photo on vacation in 1972. " +
                "Over 50 years later, they recreated it");

    }
}
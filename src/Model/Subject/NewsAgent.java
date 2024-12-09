package Model.Subject;


import Model.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgent implements Subject{


private List<Observer> observerList;

public NewsAgent(){
    observerList = new ArrayList<>();

}

@Override
    public void addObserver(Observer observer){
    observerList.add(observer);
}

@Override
    public void  removeObserver(Observer observer){
    observerList.remove(observer);
}

@Override
    public void notifyObserver(String news){
    for(Observer observer : observerList)
    {
        observer.update(this,news);
    }
}

public void displayNews(String news){
//    System.out.println("Breaking News : " + news);
    notifyObserver(news);
}


}

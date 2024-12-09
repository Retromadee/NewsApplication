package Model.Observer;

import Model.Subject.Subject;

public class WebUser implements Observer{
    private String name;
    
    public WebUser(String name){
        this.name = name;
    }
    
    @Override
    public void update(Subject subject, String news){
        System.out.println(name + "Received via Web" + news);
    }
}

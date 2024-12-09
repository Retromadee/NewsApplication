package Model.Observer;

import Model.Subject.Subject;

public class MobileUser implements Observer{
    private String name;

    public MobileUser(String name){
        this.name = name;
    }

    @Override
    public void update(Subject subject, String news){
        System.out.println(name+"Received via mobile app" + news);
    }


}


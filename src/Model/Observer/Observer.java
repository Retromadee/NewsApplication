package Model.Observer;


import Model.Subject.Subject;

public interface Observer {

    void update(Subject subject, String news);
}

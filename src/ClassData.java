import java.util.ArrayList;
import java.util.Date;

public class ClassData implements Subject{
    private String courseNo,topicName,teacherName;
    private String time;
    private ArrayList<Observer> observers;

    public ClassData() {
     observers=new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
      observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
      observers.remove(o);
    }

    @Override
    public void notifyObserver() {
       for(Observer o:observers){
           o.update(courseNo,topicName,teacherName,time);
       }
    }
    public void addChanges(String courseNo, String topicName, String teacherName, String time){
        this.courseNo=courseNo;
        this.topicName=topicName;
        this.teacherName=teacherName;
        this.time=time;
        notifyObserver();
    }
}

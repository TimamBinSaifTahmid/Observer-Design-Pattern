import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Teacher implements Observer {
    private String courseNo,topicName,teacherName;
    String time;
//    Subject classData;
//
//    public Teacher(Subject classData) {
//        this.classData = classData;
//        classData.registerObserver(this);
//    }

    @Override
    public void update(String courseNo, String topicName, String teacherName,String time) {
          this.courseNo=courseNo;
          this.topicName=topicName;
          this.teacherName=teacherName;
          this.time=time;
          display();
    }
    public void display(){
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy, hh:mm");
        //Desired format: 24 hour format: Change the pattern as per the need
        DateFormat outputformat = new SimpleDateFormat("dd.MM.yyyy, HH:mm aa");
        Date date = null;
        String output = null;
        try{
            date= df.parse(time);
            output = outputformat.format(date);
        }catch(ParseException pe){
            pe.printStackTrace();
        }
        System.out.println("Teacher display:");
        System.out.println("Course No:"+courseNo);
        System.out.println("Topic name:"+topicName);
        System.out.println("Teacher:"+teacherName);
        System.out.println("Time:"+output);
    }
}

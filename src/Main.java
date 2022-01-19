import javax.xml.crypto.Data;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        java.util.Date date=new java.util.Date();
        ClassData classData=new ClassData();
        Observer student1=new Student();
        Observer student2=new Student();
        Observer  teacher1=new Teacher();
        classData.registerObserver(student1);
        // classData.addChanges("SWE-4501","Observer Pattern","Nazmul Haque","10.07.2021, 23:54");
        classData.registerObserver(student2);
        // classData.addChanges("SWE-4502","Observer Pattern LAB","Nazmul Haque","10.06.2021, 20:54");
        classData.removeObserver(student1);
       // classData.addChanges("SWE-4503","server","Tasnim","10.06.2021, 20:54");
        classData.registerObserver(teacher1);
        classData.addChanges("SWE-4501","Observer Pattern","Nazmul Haque","10.07.2021, 23:54");

    }

}

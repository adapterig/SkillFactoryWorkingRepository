package module13.task44;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ConsoleClock extends Thread{
    DateFormat df = new SimpleDateFormat("HH:mm:ss");
    Calendar currentTime;
    public void run(){
        while (true){
            currentTime = new GregorianCalendar();
            System.out.println(df.format(currentTime.getTime()));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("The clock was stopped");
                break;
            }
        }



    }
}

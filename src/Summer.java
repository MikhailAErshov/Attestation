import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Summer implements WaterTheCactus {
    public Summer() {
    }

    public Object waterTheCactus(int date2, int date3) {
        Calendar calendar = new GregorianCalendar();
        calendar.set(5, date2);
        calendar.set(2, date3);
        String analogFormat;
        if (Sensor.getSensorHumidity() < 31) {
            calendar.add(5, 2);
            analogFormat = (new SimpleDateFormat("dd.MM")).format(calendar.getTime());
            System.out.println("Дата следующего полива:");
            return analogFormat;
        } else {
            calendar.add(5, 1);
            System.out.println("Пока поливать не надо. Влажность воздуха достаточная. Замерим влажность завтра:");
            analogFormat = (new SimpleDateFormat("dd.MM")).format(calendar.getTime());
            return analogFormat;
        }
    }
}

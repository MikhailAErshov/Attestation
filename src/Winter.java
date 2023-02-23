import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Winter implements WaterTheCactus {
    public Winter() {
    }

    public Object waterTheCactus(int date2, int date3) {
        Calendar calendar = new GregorianCalendar();
        calendar.set(5, date2);
        calendar.set(2, date3);
        calendar.add(2, 1);
        String analogFormat = (new SimpleDateFormat("dd.MM")).format(calendar.getTime());
        System.out.println("Дата следующего полива:");
        return analogFormat;
    }
}

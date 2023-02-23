import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Spring implements WaterTheCactus {
    public Spring() {
    }

    public Object waterTheCactus(int date2, int date3) {
        Calendar calendar = new GregorianCalendar();
        calendar.set(5, date2);
        calendar.set(2, date3);
        calendar.add(5, 14);
        String analogFormat = (new SimpleDateFormat("dd.MM")).format(calendar.getTime());
        System.out.println("Дата следующего полива:");
        return analogFormat;
    }
}

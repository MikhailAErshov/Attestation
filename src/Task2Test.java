import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task2Test {
    public static Date date1;

    public Task2Test() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дату последнего полива кактуса в формате dd.MM:");
        String date = sc.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM");
        Date date1 = null;

        try {
            date1 = dateFormat.parse(date);
        } catch (ParseException var8) {
            System.out.println("Неправильный формат даты");
        }

        int date2 = date1.getDate();
        int date3 = date1.getMonth();
        WaterTheCactus water = null;
        switch (date1.getMonth()) {
            case 0:
            case 1:
            case 11:
                water = new Winter();
                break;
            case 2:
            case 3:
            case 4:
                water = new Spring();
                break;
            case 5:
            case 6:
            case 7:
                water = new Summer();
                break;
            case 8:
            case 9:
            case 10:
                water = new Autumn();
        }

        System.out.println(((WaterTheCactus)water).waterTheCactus(date2, date3));
        sc.close();
    }
}

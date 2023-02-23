//У программиста Васи на подоконнике растёт кактус. Вася постоянно забывает его поливать,
//поэтому он купил датчик влажности и решил составить программу для отслеживания времени полива.
//На вход программа ждет дату последнего полива кактуса.
//Если сейчас зима (декабрь - февраль), то кактус поливается раз в месяц.
//Если осень или весна - раз в неделю. Летом поливается в зависимости от влажности воздуха, но не чаще одного раза в два дня.
//Значение влажности воздуха в программу попадает автоматически от датчика
//(реализуйте через вызов метода класса Датчик, внутри которого будет генерация рандомного числа).
//Если влажность меньше 30%, кактус нужно полить.
//Вася ожидает от программы, что после проверки всех данных, она выведет ему сообщение с датой, когда надо поливать кактус.
//Реализуйте программу, используя принципы ООП и библиотеки для работы с датой.

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

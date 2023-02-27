import java.util.Random;

public class Sensor {
    public Sensor() {
    }

    public static int getSensorHumidity() {
        Random r = new Random();
        return r.nextInt(100);
    }
}

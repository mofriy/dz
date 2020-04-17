package parallelfour;

public class Main {
    public static void main(String[] args) {
        ping p = new ping();
        new Thread(p).start();
        new Thread(p).start();
        new Thread(p).start();
        new Thread(p).start();

    }
}

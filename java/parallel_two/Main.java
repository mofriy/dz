package paralleltwo;

public class Main
{
    public static void main(String[] args) {
        ping p = new ping();
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(p);

        t1.setName("Ping");
        t2.setName("Pong");

        t1.start();
        t2.start();
    }
}

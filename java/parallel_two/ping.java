package paralleltwo;
import static java.lang.Thread.sleep;



public class ping implements Runnable{

    static int name_ = 0;
    final private int quan = 10;
    static String word = "Ping";

    public ping(){
    }

    public synchronized void say(){
    if (word.equals("Ping")){
        System.out.println("Ping");
        word = "Pong";
    } else {
        System.out.println("Pong");
        word = "Ping";
    }
}

    @Override
    public void run(){
        try {
            for (int i=0; i<quan;i++){
                this.say();
                sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

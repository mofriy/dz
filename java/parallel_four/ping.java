package parallelfour;

import static java.lang.Thread.sleep;



public class ping implements Runnable{

    static int name_ = 0;
    static private int quan = 12;
    static String word = "Ping";

    public ping(){
    }

    public synchronized void say(int i){
        if (quan % 3 == 0 ) {
            if (word.equals("Ping")) {
                System.out.println(i+": Ping");
                word = "Pong";
            } else {
                System.out.println(i+": Pong");
                word = "Ping";
            }
        } else {
            if (word.equals("Ping")) {
                word = "Pong";
            } else {
                word = "Ping";
            }
        }
        quan--;
    }

    @Override
    public void run(){
        int name = id;
        id = (id+1)%4;
        try {
            for (int i=0; i<12;i++){
                this.say(name);
                sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    static int id = 0;
}

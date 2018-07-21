package timeRestrictions;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Agendamentos {

    private static int count = 0;

    public static void main(String[] args) {
        Agendamentos a = new Agendamentos();
        a.primeiraTarefa();
    }

    private void primeiraTarefa() {
        final Timer t = new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                count++;
                
                if (count == 2) {
                    
                    System.out.println("Cancelou envio");
                    
                    t.cancel();
                } else {
                    System.out.println("Enviou sinal");
                }
            }

        }, 300, 5000);

    }
}
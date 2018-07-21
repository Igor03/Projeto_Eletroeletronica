/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialCom;

import java.util.Timer;
import java.util.TimerTask;
import serialCom.*;
import interfacesDeComunicacao.*;
//import org.w3c.dom.css.Counter;

/**
 *
 * @author This
 */
public class defaultSignal {
    
    private static int counter = 0;
    
    
    
    public static void sendDefaultSignal () {
        
        final Timer t = new Timer();
        //userComm uc = new userComm();
        
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                counter++;
                
                if (counter == 2){
                    userComm.cancelTransmission();
                    t.cancel();
                } else {
                     userComm.sendSignal();
                }
            }
            
        }, 300, 3000);
        
    }
    
    
    
}

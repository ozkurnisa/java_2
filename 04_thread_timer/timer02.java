package hafta04;


import java.util.Timer;
import java.util.TimerTask;

public class timer02 {
    static Timer t1,t2;
    static TimerTask g1,g2;
    static int sayac = 20;

    void g2_start(){
        //burda schelude edilmeli
    }


    public static void main(String[] args) {
        t1 = new Timer();
        t2 = new Timer();

        g1 = new TimerTask() {
            @Override
            public void run() {
                sayac+=5;
                if( sayac==40) t1.cancel();
System.out.println("g1:"+sayac+"-");
            }
        };
        
        g2 = new TimerTask() {
            @Override
            public void run() {
                sayac-=5;
                if (sayac==30) t2.cancel();
                System.out.println("g2:"+sayac+"-");
            }
        };
        t1.schedule(g1,0,1000);
        t1.schedule(g2,0,1000);
    }


}
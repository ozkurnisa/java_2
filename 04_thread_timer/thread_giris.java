package hafta04;

public class thread_giris {
    static int i,j;

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(i=0;i<1000;i++){
                    System.out.print("AAA");
                }
            }
        });


        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (j = 0; j < 1000; j++) {
                    System.out.println("BBB");
                }
            }
        });

        t1.start();
        t2.start();

    }
}

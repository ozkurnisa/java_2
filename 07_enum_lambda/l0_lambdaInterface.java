package hafta06;

interface lmbd{
void yaz();

}

public class l0_lambdaInterface {
    public static void main(String[] args) {
        lmbd l= new lmbd(){


            @Override
            public void yaz() {

            }
        };
        l.yaz();
        lmbd l2 =()->System.out.println("merhaba");
        l2.yaz();
}}

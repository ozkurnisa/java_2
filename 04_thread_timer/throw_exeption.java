package hafta04;
import java.util.Scanner;
public class throw_exeption {

    static float ortalama (int v,int f) {
        float ort = 0;
        if (v > 100 || v < 0 || f > 100 || f < 0) {
            throw new ArithmeticException(" notlar 0-100 arasında olmalıdır");
        } else {
            ort = (float) ((float) v * 0.4 + (float) f * 0.6);

        }
        return ort;


    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(" vize griniz:");
        int v = s.nextInt();
        System.out.println(" final griniz:");
        int f = s.nextInt();
        System.out.println("ortalamanız:" + ortalama(v, f));
    }
    }


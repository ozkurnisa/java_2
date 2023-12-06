package hafta04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class try_catch_finally {
    public static void main(String[] args) {

//*try-catch
        /*
       try {
            int sonuc = 19 / 0;
System.out.println(sonuc);

        } catch (ArithmeticException e) {
            System.out.println("hata:" + e.getMessage());

        }

         */


    try {
        int a, b, sonuc;
        Scanner scan = new Scanner(System.in);
        System.out.println("ilk sayı:");
        a = scan.nextInt();
        System.out.println("ikinci sayı:");
        b = scan.nextInt();
        sonuc = a + b;
        System.out.println(sonuc);

    } catch (InputMismatchException e) {
        System.out.println("lütfen integer değer giriniz !");
        System.out.println("hata :" + e.getMessage());
    }finally {
        System.out.println("ne olursa olsun yapılcak son iş !");

       }
    }
}

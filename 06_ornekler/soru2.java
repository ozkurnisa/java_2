package odev6;

import java.util.*;
import java.util.stream.Collectors;

public class soru2 {
    //Sıfır ile on arasında rastgele on sayı oluşturup aşağıdaki işlemler için lambda kodlarını yazınız? (java dosyası upload edilecek)
    //a) Her sayıya 5 ekleyiniz
   /* b) 2 ile 8 arasındaki sayıları filtreleyiniz
    c) Tüm ikili sayıları birbirinden çıkartarak reduce ediniz?
    d) Sayı çift ise bir ekleyiniz, tek ise bir çıkartınız?
    e) Çift olan sayıları 2'ye bölerek filtreleyiniz?
    f) Listedeki en küçük sayıyı buldurunuz? (reduce ile)*/

    public static void main(String[] args) {
        Random r= new Random();
        ArrayList<Integer> liste = new ArrayList<>();
        for(int i=0;i<10;i++) liste.add(r.nextInt(10));
        System.out.println(liste);

        List<Integer> a =liste.stream().map(p->p+5).collect(Collectors.toList());
        System.out.println(a);

        List<Integer> b = liste.stream().filter(p->p>2 && p<8).collect(Collectors.toList());
        System.out.println(b);

        Optional<Integer> c = liste.stream().reduce((p1, p2)->p2-p1);
        System.out.println(c.get());

        List<Integer> d = liste.stream().map(p->p%2==0?p+1:p-1).collect(Collectors.toList());
        System.out.println(d);

        List<Integer> e = liste.stream().filter(p->p%2==0).collect(Collectors.toList());
        System.out.println(e);

        Optional<Integer> f= liste.stream().reduce((p1, p2)->p1>p2?p2:p1);
        System.out.println(f);

    }



}

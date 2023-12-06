package hafta08;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//hashset KÜme hashmap işaretlemedir
public class set_kume_giris {
    public static void main(String[] args) {
        Set<Integer> k1 = new HashSet<>();
        k1.add(2);
        k1.add(3);
        k1.add(1);
        k1.add(2);
        k1.add(5);
        System.out.println(k1);

        HashSet<String> k2 = new HashSet<>();
        k2.add("Ali");
        k2.add("Zeynep");
        k2.add("Cihan");
        k2.add("Ali");
        k2.add("Kamil");
        System.out.println(k2);

        System.out.println(k2.size());

        TreeSet<Float> tk2= new TreeSet<>();
        tk2.add(1.0f);
        tk2.add(1.4f);
        tk2.add(2.3f);
        tk2.add(0.5f);
        tk2.add(1.0f);

//küme işlemleri
        HashSet<Integer>  A = new HashSet<>(Arrays.asList(0,2,3,5,8));
        HashSet<Integer>  B = new HashSet<>(Arrays.asList(1,2,4,5,7));

//birleşim
//A.addAll(B);
// System.out.println(A);

//kesişim
//A.retainAll(B);
//System.out.println(A);

//Fark
A.removeAll(B);
System.out.println((A));

    }
}
//treeeset elemanları sıralı yapar

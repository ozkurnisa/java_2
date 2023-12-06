package odev6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class soru3 {
    public static void main(String[] args) {


        List<Integer> w = Arrays.asList(12, 25, 60, 27, 57, 82, 98);
        System.out.println(w);

        List<Integer> l1 = w.stream().filter(p->p%4<3 && p>25).collect(Collectors.toList());
        System.out.println(l1);

        List<Integer> l2 = w.stream().map(p->p%2==0?p/2 : (p+1)/2).collect(Collectors.toList());
        System.out.println(l2);

    }
}

package hafta06;
enum Gunler {
    PAZARTESİ,
    SALI,
    ÇARŞAMABA,
    PERŞEMBE,
    CUMA,
    CUMARTESİ,
    PAZAR
}
public class enum_giris {

    public static void main(String[] args) {
        Gunler g=Gunler.CUMA;
        System.out.println(g);
        System.out.println(g.compareTo(Gunler.CUMA));
        System.out.println(g.ordinal());
        System.out.println(Gunler.PAZAR.ordinal());

    }

}

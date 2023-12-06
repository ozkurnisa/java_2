package hafta03;

abstract class ornek {
    abstract void get_tcno(); // en az bir tane abstract method olmak zorundadır
    abstract void get_adres();

    void get_isim(){// abs olmayan methodlarda tanımlanalibilir

    }

}

class yeni extends ornek{
    @Override
    void get_tcno() { // abs methodlar miras verilen sınıf içine mutlaka tanımlanmalıdır
        // böylece progrmacının bu methodları kullanmassı zorunlu hale getirilir

    }

    @Override
    void get_adres() {

    }
}

public class soyut_abstract_class {
    public static void main(String[] args) {
        //ornek o = new ornek(); abs sınıfının nesnesi üretilmez
        yeni y = new yeni();// abs nin miras verdiği sınıfın nesnesi oluşturulabilir

    }
}
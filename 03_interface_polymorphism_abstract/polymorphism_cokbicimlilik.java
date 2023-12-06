package hafta03;

class animal {
    void ses (){
        System.out.println("Bu animal sınıfındaki ses methodu!");
    }
class kedi extends animal{
        void ses(){
            System.out.println("miyav");
        }
}

    class kopek extends animal {
        void ses() {
            System.out.println("havhav");
        }
    }

    class kus extends animal {
        void ses() {
            System.out.println("cikcik");
        }
    }

static class animalVoice extends animal{
        static void ses(animal a) {
            a.ses();
        }
}



public class polymorphism_cokbicimlilik {
    public void main(String[] args) {
        kedi k = new kedi ();


    }
}
}

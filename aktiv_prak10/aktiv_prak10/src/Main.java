public class Main {
    public static void main(String[] args) {
        Kucing k = new Kucing("kucing");
        Anjing a = new Anjing("dog");

        //Hewan h = new Hewan();

        k.makan();
        k.bersuara();

        a.makan();
        a.bersuara();


    }
    
}
abstract class Hewan{
    String nama;

    Hewan(String nama) {
            this.nama = nama;
    }

    void makan(){
        System.out.println(nama + " Sedang makan");
    }

    abstract void bersuara();

}

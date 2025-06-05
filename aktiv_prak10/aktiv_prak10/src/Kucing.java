class Kucing extends Hewan {

    Kucing(String nama) {
        super(nama);
    }
    @Override
    void bersuara(){
        System.out.println("Suara Kucing BERISIK");
    }

   // abstract void lari();

}

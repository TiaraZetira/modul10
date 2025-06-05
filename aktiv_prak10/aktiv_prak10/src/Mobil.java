public class Mobil extends Pemilik implements Kendaraan, Pabrik{

    Mobil(String nama){
        super(nama);
    }

    @Override
    public void nyalakanMesin(){
        System.out.println("Mobil menyala");
    }

    @Override
    public void matikanMesin(){
        System.out.println("Mobil mati");
    }

    @Override
    public void produksiKendaraan(){
        System.out.println("Mobil di produksi");
    }

    @Override
    public void pemilikKendaraan(String namaPemilik){
        System.out.println (namaPemilik + " Punya mobil: " + nama);
    }
    
}
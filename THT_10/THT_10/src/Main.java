public class Main {
    public static abstract class Kendaraan {
        protected String platNomor;
        protected String merk;
        protected int tahunProduksi;

        public Kendaraan(String platNomor, String merk, int tahunProduksi) {
            this.platNomor = platNomor;
            this.merk = merk;
            this.tahunProduksi = tahunProduksi;
        }

        public void tampilkanInfo() {
            System.out.println("Plat Nomor: " + platNomor);
            System.out.println("Merk: " + merk);
            System.out.println("Tahun: " + tahunProduksi);
        }

        public abstract double hitungBiayaSewa(int hari);
        public abstract boolean perluSupir();
    }

    public interface DapatDisewa {
        double hitungBiayaSewa(int hari);
        boolean perluSupir();
    }

    public interface Muatan {
        double kapasitasMuatan();
    }

    public static class MobilPribadi extends Kendaraan implements DapatDisewa {
        public MobilPribadi(String platNomor, String merk, int tahunProduksi) {
            super(platNomor, merk, tahunProduksi);
        }

        @Override
        public double hitungBiayaSewa(int hari) {
            return hari * 300000;
        }

        @Override
        public boolean perluSupir() {
            return false;
        }
    }

    public static class Bus extends Kendaraan implements DapatDisewa {
        public Bus(String platNomor, String merk, int tahunProduksi) {
            super(platNomor, merk, tahunProduksi);
        }

        @Override
        public double hitungBiayaSewa(int hari) {
            return hari * 1000000; 
        }

        @Override
        public boolean perluSupir() {
            return true;
        }
    }

    public static class Truk extends Kendaraan implements DapatDisewa, Muatan {
        private double kapasitas; // dalam kg

        public Truk(String platNomor, String merk, int tahunProduksi, double kapasitas) {
            super(platNomor, merk, tahunProduksi);
            this.kapasitas = kapasitas;
        }

        @Override
        public double hitungBiayaSewa(int hari) {
            return hari * 800000; 
        }

        @Override
        public boolean perluSupir() {
            return true;
        }

        @Override
        public double kapasitasMuatan() {
            return kapasitas;
        }
    }

    public static void main(String[] args) {
        Kendaraan mobil = new MobilPribadi("B1234XYZ", "Toyota", 2022);
        Kendaraan bus = new Bus("D5678ABC", "Mercedes", 2021);
        Truk truk = new Truk("E9876RTY", "Hino", 2020, 5000);

        System.out.println(" Mobil Pribadi ");
        mobil.tampilkanInfo();
        System.out.println("Biaya Sewa 3 Hari: Rp" + mobil.hitungBiayaSewa(3));
        System.out.println("Perlu Supir: " + mobil.perluSupir());

        System.out.println("\n Bus ");
        bus.tampilkanInfo();
        System.out.println("Biaya Sewa 2 Hari: Rp" + bus.hitungBiayaSewa(2));
        System.out.println("Perlu Supir: " + bus.perluSupir());

        System.out.println("\n Truk ");
        truk.tampilkanInfo();
        System.out.println("Biaya Sewa 4 Hari: Rp" + truk.hitungBiayaSewa(4));
        System.out.println("Perlu Supir: " + truk.perluSupir());
        System.out.println("Kapasitas Muatan: " + truk.kapasitasMuatan() + " kg");
    }
}

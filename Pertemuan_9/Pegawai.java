public class Pegawai extends Karyawan {
    public Pegawai (String nama, String departement, char JenisKelamin) {
        super(nama, departement, JenisKelamin);
    }

    @Override
    public void displayInfo() {
        System.out.println("Jabatan : Pegawai");
        super.displayInfo();
    }
}
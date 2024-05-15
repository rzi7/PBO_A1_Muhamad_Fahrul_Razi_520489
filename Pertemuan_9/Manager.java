public class Manager extends Karyawan {

    public Manager (String nama, String departement, char JenisKelamin) {
        super(nama, departement, JenisKelamin);
    }
    
    @Override
    public int getThr() {
        return gaji *2;
    }

    @Override
    public void displayInfo() {
        System.out.println("Jabatan : Manager");
        super.displayInfo();
    }
}


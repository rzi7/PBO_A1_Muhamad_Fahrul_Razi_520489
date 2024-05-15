public class Salesman extends Karyawan {
    private int target;
    private int penjualan;

    public Salesman (String nama, String departement, char JenisKelamin) {
        super(nama, departement, JenisKelamin);
    }
    
    public void setTarget(int target) {
        this.target = target;
    }

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    @Override
    public int getThr() {
        if (this.penjualan >= this.target) {
            return gaji * 2;
        } else {
            return gaji;
        }
    }
    @Override
    public void displayInfo() {
        System.out.println("Jabatan : Salesman");
        super.displayInfo();
    }
}

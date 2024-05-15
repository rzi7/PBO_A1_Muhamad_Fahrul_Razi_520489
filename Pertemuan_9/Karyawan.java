public class Karyawan {
    protected String nama;
    protected String departement;
    protected char JenisKelamin;
    protected int cuti;
    protected int gaji;
    protected String nip;

    public Karyawan(String nama, String departement, char JenisKelamin) {
        this.nama = nama;
        this.departement = departement; 
        this.JenisKelamin = JenisKelamin;
        this.cuti = 12;
    }

    public void setCuti(String tipeCuti) {
        switch (tipeCuti.toLowerCase()) {
            case "pernikahan":
                this.cuti += 2;
                break;
            case "persalinan":
                if(this.JenisKelamin == 'L') {
                    this.cuti += 3;
                } else if (this.JenisKelamin == 'P') {
                    this.cuti += 90;
                }
                break;
            default:
                break;
        }
    }

    public void setCuti(int cuti) {
        this.cuti += cuti;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public int getGaji() {
        return gaji;
    }

    public void setNip(String nip) {
        if (this instanceof Manager) {
            if (nip.matches("^[M].*")) {
                this.nip = nip;
            } else {
                System.out.println("NIP yang dimasukkan tidak valid");
            }
        } else if (this instanceof Pegawai) {
            if (nip.matches("^[P].*")) {
                this.nip = nip;
            } else {
                System.out.println("NIP yang dimasukkan tidak valid");
            }
        } else if (this instanceof Salesman) {
            if (nip.matches("^[S].*")) {
                this.nip = nip;
            } else {
                System.out.println("NIP yang dimasukkan tidak valid");
            }
        }
    }

    public void setNip (int urutan) {
        if (this instanceof Manager) {
            this.nip = "M" + String.format("%04d", urutan);
        } else if (this instanceof Pegawai) {
            this.nip = "P" + String.format("%04d", urutan);
        } else if (this instanceof Salesman) {
            this.nip = "S" + String.format("%04d", urutan);
        }
    }

    public int getThr() {
        return gaji;
    }

    public void displayInfo() {
        System.out.println("Nama : " + this.nama);
        System.out.println("Departement : " + this.departement);
        System.out.println("Jenis Kelamin : " + this.JenisKelamin);
        System.out.println("Cuti : " + this.cuti);
        System.out.println("NIP : " + this.nip);
        System.out.println("Gaji : " + this.gaji);
        System.out.println("THR : " + this.getThr());
        System.out.println();
    }
}


package siswa;


public class Siswa { 
 private int idSiswa;
    private String nama;
    private String alamat;
    boolean status;

    public Siswa(int idSiswa, String nama, String alamat, String telepon, boolean status) { //constructor
        this.idSiswa = idSiswa;
        this.nama = nama;
        this.alamat = alamat;
        
}
    public int getIdSiswa() {
        return idSiswa;
    }


    public String getNama() {
        return nama;
    }


    public String getAlamat() {
        return alamat;
    }

}
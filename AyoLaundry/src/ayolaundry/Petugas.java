
package ayolaundry;

import java.util.ArrayList;

public class Petugas implements User{ 
private ArrayList<String> namaPetugas = new ArrayList<String>(); 
private ArrayList<String> alamat = new ArrayList<String>(); 
private ArrayList<String> telepon = new ArrayList<String>(); 
private ArrayList<String> jabatan = new ArrayList<String>();

public Petugas (){ //keywoard this buat pemanggil methods kelas itu sendiri , pembuatan kelas untuk menyatakan objek (nama = constructor)
    this.namaPetugas.add("yanto");
    this.alamat.add("Malang");
    this.telepon.add("081252191827");
    this.jabatan.add("Pemilik toko");
    
    this.namaPetugas.add("Santi");
    this.alamat.add("Malang");
    this.telepon.add("081249699404");
    this.jabatan.add("Petugas cuci");
    
    this.namaPetugas.add("Sasa");
    this.alamat.add("Malang");
    this.telepon.add("085604441400");
    this.jabatan.add("Petugas setrika");
    
    this.namaPetugas.add("budi");
    this.alamat.add("Malang");
    this.telepon.add("085708830732");
    this.jabatan.add("Petugas cuci karpet");
}
public void setJabatan(String jabatan){ 
    this.jabatan.add(jabatan);
}
public String getJabatan(int id){
    return this.jabatan.get(id);
}
public int getJmlPetugas(){
    return this.namaPetugas.size();
}

    @Override //mengimplementasi kembali subclas
    public void setNama(String namaKaryawan) {
        this.namaPetugas.add(namaKaryawan);
    }

    @Override
    public void setAlamat(String alamat) {
        this.namaPetugas.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.namaPetugas.add(telepon);
    }

    @Override
    public String getNama(int idKaryawan) {
        return this.namaPetugas.get(idKaryawan);
    }

    @Override
    public String getTelepon(int idKaryawan) {
        return this.telepon.get(idKaryawan);
    }

    @Override
    public String getAlamat(int idKaryawan) {
        return this.alamat.get(idKaryawan);
    }
}

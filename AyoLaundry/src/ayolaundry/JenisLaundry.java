
package ayolaundry;

    import java.util.ArrayList;

public class JenisLaundry {
    private ArrayList<String> JenisLaundry = new ArrayList<String>(); 
    private ArrayList<Integer> durasi = new ArrayList<Integer>(); 
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    
    public JenisLaundry (){
        this.JenisLaundry.add("cuci kering/g ");
        this.harga.add(8000);
        this.durasi.add(0);
        
        
        this.JenisLaundry.add("gosok baju/g ");
        this.harga.add(5000);
        this.durasi.add(0);
        
        
        this.JenisLaundry.add("karpet/Pcs ");
        this.harga.add(10000);
        this.durasi.add(0);
        
        
        
      //enkapsulasi karena terdapat public yang menyembunyikan nlai   
    }
    public int getJmlJenisLaundry(){ 
        return this.JenisLaundry.size();
        }
    public void setJenisLaundry(String namaBarang ){ 
        this.JenisLaundry.add(namaBarang);
        }
    public String getJenisLaundry(int idBarang){
        return this.JenisLaundry.get(idBarang);
        }
    public void editDurasi(int idBarang, int Durasi){ 
        this.durasi.set(idBarang, Durasi);
    }
    public void setHarga(int harga ){ 
        this.harga.add(harga);
    }
    public int getHarga(int idBarang){ 
        return this.harga.get(idBarang);
}
}

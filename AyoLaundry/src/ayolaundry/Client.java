
package ayolaundry;

import java.util.ArrayList;

public class Client implements User { //interface,polimorphisme
    private ArrayList<String> namaClient = new ArrayList<String>(); //private = modifier
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>(); 
    private ArrayList<Integer> saldo = new ArrayList<Integer>();

    public Client(){
        this.namaClient.add("zidane");
        this.alamat.add("malang ");
        this.telepon.add("08123456789");
        this.saldo.add(45000);
        
        this.namaClient.add("candra");
        this.alamat.add("malang ");
        this.telepon.add("08193214372");
        this.saldo.add(100000);
        
        this.namaClient.add("sagif");
        this.alamat.add("malang ");
        this.telepon.add("08518989026");
        this.saldo.add(55000);
        
    }
    public void setSaldo(int saldo){
        this.saldo.add(saldo);
    }
    public int getSaldo(int idMember){// yang dalam kurung namanya parameter
        return this.saldo.get(idMember);
    }
    public void editSaldo(int idMember, int saldo){
        this.saldo.set(idMember, saldo);
    }
    public int getJmlClient(){
        return this.saldo.size();
    }
    
    
    @Override //ini tempat override
    public void setNama(String namaMember) {
        this.namaClient.add(namaMember);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int idMember) {
        return this.namaClient.get(idMember);
    }

    @Override
    public String getTelepon(int idMember) {
        return this.telepon.get(idMember);
    }

    @Override
    public String getAlamat(int idMember) {
        return this.alamat.get(idMember);
    }
    
}


package ayolaundry;


    import java.util.ArrayList;
import java.util.Scanner;

public class Transaksi {
    private ArrayList<Integer> idClient = new ArrayList<Integer>(); 
    private ArrayList<Integer> idJenisLaundry = new ArrayList<Integer>(); 
    private ArrayList<Integer> banyak = new ArrayList<Integer>();
    
    public Transaksi(){
        this.idClient.add(2); 
        this.idJenisLaundry.add(0); 
        this.banyak.add(1);
        
        this.idClient.add(0); 
        this.idJenisLaundry.add(1); 
        this.banyak.add(2);
        
        this.idClient.add(0); 
        this.idJenisLaundry.add(1); 
        this.banyak.add(1);
        
        this.idClient.add(1); 
        this.idJenisLaundry.add(2); 
        this.banyak.add(4);
    }//method mutator  enkapsulasi
    public void prosesTransaksi(Client member, Transaksi transaksi, JenisLaundry barang){
        Scanner myObj = new Scanner(System.in); 
        System.out.println("Silahkan menikmati pelayanan kami");
        
        System.out.println("Masukkan ID Pelanggan :"); 
        int idMember = myObj.nextInt();
        System.out.println("Selamat datang di Laundry kami  "+member.getNama(idMember)); 
        ArrayList<Integer> idBarang = new ArrayList<Integer>(); 
        ArrayList<Integer> banyak = new ArrayList<Integer>();
        int i=0;
        int temp=0;
            do{ 
                System.out.println("Masukkan jenis laundry :");
            temp=myObj.nextInt();
            if (temp!=10){  
                idBarang.add(temp);
                System.out.print(barang.getJenisLaundry(idBarang.get(i))+ "sebanyak : ");
                banyak.add(myObj.nextInt());
                i++;
            }
            }while (temp!=10);
            System.out.println("Transaksi laundry "+member.getNama(idMember)+" sebagai berikut");
                System.out.println("Jenis Laundry \tTotal\tHarga\tJumlah\t");
                
                int total=0;
                int x = idBarang.size();
                for (int j = 0; j<x;j++){
                int jumlah=banyak.get(j) * barang.getHarga(idBarang.get(j)); total+=jumlah; System.out.println(barang.getJenisLaundry(idBarang.get(j))+"\t"+
                banyak.get(j)+"\t"+ barang.getHarga(idBarang.get(j))+"\t"+ jumlah);
                transaksi.setTransaksi(barang, idMember, idBarang.get(j), banyak.get(j));

            }
                System.out.println("Total Laundry : "+total); 
                member.editSaldo(idMember, member.getSaldo(idMember)-total);
            }

    public void setTransaksi(JenisLaundry barang, int idMember, int idBarang, int banyaknya){
       this.idClient.add(idMember);  
       this.idJenisLaundry.add(idBarang); 
       this.banyak.add(banyaknya);
    }
       public int getIdBarang(int id){ 
           return this.idJenisLaundry.get(id);
    }
       public int getBanyaknya(int id){ 
           return this.banyak.get(id);
    }
       public int getIdMember(int id){ 
           return this.idClient.get(id);
    }
       public int getJmlTransaksi(){ 
           return this.idClient.size();      
    }
}


package ayolaundry;

public class Laporan {
      public void laporan(JenisLaundry barang){ 
        int x=barang.getJmlJenisLaundry();
    

        System.out.println(); 
        System.out.println("Tabel Laundry"); 
        System.out.println();
        System.out.println("Jenis Laundry \tHarga"); 
        System.out.println("======================");
        for (int i = 0; i < x; i++) {
        System.out.println(barang.getJenisLaundry(i)+"\t"+barang.getHarga(i));
        }
    }
    public void Laporan (Petugas petugas){
        System.out.println("Nama Petugas \t\tAlamat \t\tTelepon \tJabatan");
        System.out.println("============================================================================");
        System.out.println(petugas.getNama(0)+"\t"+"\t"+"\t"+petugas.getAlamat(0)+"\t"+"\t"+petugas.getTelepon(0)+"\t"+petugas.getJabatan(0));
        System.out.println(petugas.getNama(1)+"\t"+"\t"+"\t"+petugas.getAlamat(1)+"\t"+"\t"+petugas.getTelepon(1)+"\t"+petugas.getJabatan(1));
        System.out.println(petugas.getNama(2)+"\t"+"\t"+"\t"+petugas.getAlamat(2)+"\t"+"\t"+petugas.getTelepon(2)+"\t"+petugas.getJabatan(2));
        System.out.println(petugas.getNama(3)+"\t"+"\t"+"\t"+petugas.getAlamat(3)+"\t"+"\t"+petugas.getTelepon(3)+"\t"+petugas.getJabatan(3));
        
        }
        public void laporan(Client member){ 
            int x=member.getJmlClient();

        System.out.println(); 
        System.out.println("Tabel Pelanggan "); 
        System.out.println();
        System.out.println("Nama \tAlamat \t\tTelepon \tSaldo"); 
          System.out.println("==============================================");
        for (int i = 0; i < x; i++) {
        System.out.println(member.getNama(i)+"\t"+ member.getAlamat(i)+"\t\t"+member.getTelepon(i)+"\t"+ member.getSaldo(i));
        }
    }
        public void laporan(Transaksi transaksi, JenisLaundry barang){ 
            int x=transaksi.getJmlTransaksi();
            
            System.out.println();
            System.out.println("Laporan Transaksi");
            System.out.println();
            System.out.println("Jenis Laundry\tTotal \tHarga \tJumlah");
            System.out.println("==============================================");
            
            int total=0;
            for (int i = 0; i < x; i++){
                int jumlah=transaksi.getBanyaknya(i)*barang.getHarga(transaksi.getIdBarang(i));
                    total+=jumlah; 
                            
                System.out.println(barang.getJenisLaundry(transaksi.getIdBarang(i))+"\t"+transaksi.getBanyaknya(i)+"\t"+barang.getHarga(transaksi.getIdBarang(i))+"\t"+jumlah);
            }
            System.out.println("Total Omset ="+total);
            }
}

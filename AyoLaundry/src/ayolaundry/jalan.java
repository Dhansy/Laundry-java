
package ayolaundry;

public class jalan {
    public static void main (String [] args){
    Client c = new Client (); 
    Petugas p = new Petugas (); 
    JenisLaundry j = new JenisLaundry (); 
    Transaksi t = new Transaksi ();
    Laporan l = new Laporan ();
    
    
    l.Laporan(p);
    l.laporan(j);
    l.laporan(c);
            
    t.prosesTransaksi(c, t, j);
    l.laporan(c);
}
}

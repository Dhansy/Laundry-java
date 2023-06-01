/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siswa;



public class ListSiswa extends hobi {
     //pemeberian nilai pada array "listSiswa" dengan tipe class Siswa
    Siswa[] listSiswa = {
        new Siswa(1, "dandi", "Malang", "0341",true),
        new Siswa(2, "valen", "Malang", "0341",true),
        new Siswa(3, "supri", "Malang", "0341",true),
    };
       public void viewSiswa(){
        System.out.println("------------ List Siswa ------------");
        System.out.println("ID \t Nama \t\t Alamat \t hobi");
        for (int i = 0; i < listSiswa.length; i++) {
            System.out.println(listSiswa[i].getIdSiswa() +" \t "+
                    listSiswa[i].getNama()+" \t\t  "+
                    listSiswa[i].getAlamat()+" \t "+
                    super.hobi);
        }
}
}

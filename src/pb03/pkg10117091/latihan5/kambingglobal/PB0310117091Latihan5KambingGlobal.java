/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb03.pkg10117091.latihan5.kambingglobal;

/* @author
* NAMA  : DIDA HANDIAN
* KELAS : PBO3
* NIM   : 10117091
* Deskripsi Program : 
*/
public class PB0310117091Latihan5KambingGlobal {

    // Variabel jumlahKambing menjadi variabel instance
    int jumlahKambing = 88;
    
    //Method untuk menampilkan jumlah kambing
    public void getJumlahKambing() {
        System.out.println("Jumlah kambing : " + jumlahKambing);
    }
    
    public void tambahKambing() {
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah: " + 
                jumlahKambing);
    }
    
    public static void main(String[] args) {
        PB0310117091Latihan5KambingGlobal kambingSusu = new 
        PB0310117091Latihan5KambingGlobal();
        
        //Menampilkan jumlah kambing yang ada saat program pertama x berjalan
        kambingSusu.getJumlahKambing();
        
        //Menambah satu kambing
        kambingSusu.tambahKambing();
        
        //Menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
    }
    
}

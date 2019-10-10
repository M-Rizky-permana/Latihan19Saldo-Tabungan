/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan19;

/**
 *
 * NAMA :Muhamad Rizky Permana
 * KELAS : IF-2
 * NIM : 10118050
 * Deskripsi Program : Program Saldo Tabungans
 */
public class Latihan19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int saldo = 2500000;
        double bunga = 0.15;
        
        double totalbungan = saldo * bunga;
        double totaliruan = totalbungan + saldo;
        for(int i=1; i<=6;i++){
            
            System.out.println("Saldo di bulan ke-"+i+" Rp "+String.format("%.0f", totaliruan));
            totaliruan = (totaliruan * bunga)+totaliruan ;
        }
    }
    
}

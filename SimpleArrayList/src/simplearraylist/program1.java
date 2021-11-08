/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraylist;
import java.util.ArrayList;
import static java.util.Collections.binarySearch;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class program1 {
    ArrayList<String> data = new ArrayList<>();
    
    void tmbdata() {
        Scanner tmb = new Scanner(System.in);
        System.out.println("Masukkan data string: ");
        data.add(tmb.nextLine());
        System.out.println("Daftar string dalam array list:" + data);
        tmb.nextLine();
    }
    void caridata() {
        Scanner golek = new Scanner(System.in);
        System.out.println("String yang mau dicari: ");
        String cari = golek.nextLine();
        if(binarySearch(data,cari) > -1){
            System.out.println("String " + cari + " ada di index ke " + binarySearch(data,cari) +" di dalam data");
        } else {
            System.out.println("String " + cari + " tidak ada dalam data");
        }
        
    }
    void hapusdata() {
        Scanner hapus = new Scanner(System.in);
        System.out.println("String yang mau dihapus: ");
        String hps = hapus.nextLine();
        if(binarySearch(data,hps) > -1){
            data.remove(binarySearch(data,hps));
            System.out.println("String " + hps + " sudah dihapus di dalam data");
        } else {
            System.out.println("String " + hps + " tidak ada dalam data");
        }
        
    }
    
    void tampildata() {
        System.out.println("Daftar string dalam array list:" + data);
    }
}

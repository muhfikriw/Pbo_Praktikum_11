/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraylist;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Asus
 */
public class SimpleArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        program1 a = new program1();
        while(true){
            int inp;
            System.out.println("---- Program Pythagoras ----");
            System.out.println("1.Tambah data");
            System.out.println("2.Cari Data");
            System.out.println("3.Hapus Data");
            System.out.println("4.Tampil Data");
            System.out.println("5.Keluar");
            
            Scanner input = new Scanner(System.in);
            System.out.println("");
            System.out.println("Pilih Program (nomer)= ");
            inp = input.nextInt();

            switch (inp) {
                case 1:
                    a.tmbdata();
                    break;
                case 2:
                    a.caridata();
                    break;
                case 3:
                    a.hapusdata();
                    break;
                case 4:
                    a.tampildata();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}

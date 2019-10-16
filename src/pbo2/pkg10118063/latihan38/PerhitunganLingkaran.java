/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118063.latihan38;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA   : Naufal Asha
 * KELAS  : IF-2
 * NIM    : 10118063
 */
public class PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setDiameter(inputDiameter());
        lingkaran.hitungLingkaran();
    }

    public static int inputDiameter(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=====Perhitungan Lingkaran=====");
        
        boolean looping = false;
        
        do{
            System.out.println("");
            if(looping){
                System.out.println("Nilai Diameter Tidak Sesuai\n");
                scanner.nextLine();
            }
            
            System.out.print("Masukkan Nilai Diameter : ");
            
            looping = true;
        }while(!scanner.hasNextInt());
        
        return scanner.nextInt();
    }
    
}

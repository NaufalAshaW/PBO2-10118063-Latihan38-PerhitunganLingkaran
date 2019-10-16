/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118063.latihan38;

/**
 *
 * @author 
 * NAMA   : Naufal Asha
 * KELAS  : IF-2
 * NIM    : 10118063
 */
public class Lingkaran {
    private int diameter;

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
    
    private double hitungJariJari(){
        return diameter/2;
    }
    
    private double hitungLuas(){
        return 3.14*Math.pow(hitungJariJari(),2);
    }
    
    private double hitungKeliling(){
        return 2*3.14*hitungJariJari();
    }
    
    private String formatting(double nilai){
        return String.format("%.2f", nilai).replace('.' , ',');
    }
    
    public void hitungLingkaran(){
        System.out.println("\n====Hasil Perhitungan Lingkaran====");
        System.out.println("Jari-jari Lingkaran : " + hitungJariJari() + "cm");
        System.out.println("Luas Lingkaran : " + hitungLuas() + "cm");
        System.out.println("Keliling Lingkaran : " + hitungKeliling() + "cm");
    }
}

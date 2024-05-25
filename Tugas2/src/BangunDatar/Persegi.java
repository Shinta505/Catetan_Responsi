/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatar;

/**
 *
 * @author hp
 */
public class Persegi implements OperasiBangunDatar {
    public double panjang = 0;
    public double lebar = 0;
    public double luas = 0;
    public double keliling = 0;

    public Persegi(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    
    // Membuat sebuah method Luas untuk mengimplementasikan interface OperasiBangunDatar
    @Override
    public double menghitungLuasPersegi() {
        luas = panjang * lebar;
        return luas;
    }
    
    // Membuat sebuah method Keliling untuk mengimplementasikan interface OperasiBangunDatar
    @Override
    public double menghitungKelilingPersegi() {
        keliling = 2 * (panjang + lebar);
        return keliling;
    }    
}

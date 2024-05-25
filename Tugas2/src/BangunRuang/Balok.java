/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunRuang;

import BangunDatar.*;
/**
 *
 * @author hp
 */
public class Balok extends Persegi implements OperasiBangunRuang {
    public double tinggi;
    public double volume = 0;
    public double luasPermukaan = 0;
    
    public Balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
        luas = menghitungLuasPersegi();
        keliling = menghitungKelilingPersegi();
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    // Membuat sebuah method Volume untuk mengimplementasikan interface OperasiBangunDatar
    @Override
    public double menghitungVolumeBalok() {
        volume = super.luas*tinggi; 
        return volume;
    }
    
    // Membuat sebuah method LuasPermukaan untuk mengimplementasikan interface OperasiBangunDatar
    @Override
    public double menghitungLuasPermukaanBalok() {
//      Luas Permukaan Balok = 2 * (Luas alas + Luas sisi tegak)
        luasPermukaan = 2 * (super.luas + (super.keliling * tinggi));
        return luasPermukaan;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Website;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author hp
 */
public class HalamanUtama extends JFrame {
    JLabel sambutan = new JLabel("Welcome, [Mr./Mrs.][username]");
    JLabel tutor = new JLabel("Tentukan panjang, lebar, dan tinggi untuk menghitung Balok.");
    JLabel panjang = new JLabel("Panjang");
    JTextField inputPanjang = new JTextField();
    JLabel lebar = new JLabel("Lebar");
    JTextField inputLebar = new JTextField();
    JLabel tinggi = new JLabel("Tinggi");
    JTextField inputTinggi = new JTextField();
    JButton hitung = new JButton("Hitung");
    JButton reset = new JButton("Reset");
    JLabel hasil = new JLabel("Hasil");
    JLabel hasilAngkaLuas = new JLabel("[Hasil berupa angka]");
    JLabel luasPersegi = new JLabel("Luas Persegi");
    JLabel hasilAngkaKeliling = new JLabel("[Hasil berupa angka]");
    JLabel kelilingPersegi = new JLabel("Keliling Persegi");
    JLabel hasilAngkaVolume = new JLabel("[Hasil berupa angka]");
    JLabel volumeBalok = new JLabel("Volume Balok");
    JLabel hasilAngkaLuasPermukaan = new JLabel("[Hasil berupa angka]");
    JLabel luasPermukaanBalok = new JLabel("Luas Permukaan Balok");
    
    public HalamanUtama() {
        JFrame kotakFrameHalamanUtama = new JFrame();
        
        kotakFrameHalamanUtama.setSize(700, 600);
        kotakFrameHalamanUtama.setTitle("Halaman Utama");
        
        kotakFrameHalamanUtama.setLayout(null);
        
        Font font = sambutan.getFont();
        sambutan.setFont(new Font(font.getName(), Font.PLAIN, 24));
        
        kotakFrameHalamanUtama.add(sambutan);
        kotakFrameHalamanUtama.add(tutor);
        kotakFrameHalamanUtama.add(panjang);
        kotakFrameHalamanUtama.add(lebar);
        kotakFrameHalamanUtama.add(tinggi);
        kotakFrameHalamanUtama.add(inputPanjang);
        kotakFrameHalamanUtama.add(inputLebar);
        kotakFrameHalamanUtama.add(inputTinggi);
        kotakFrameHalamanUtama.add(hitung);
        kotakFrameHalamanUtama.add(reset);
        kotakFrameHalamanUtama.add(hasil);
        kotakFrameHalamanUtama.add(hasilAngkaLuas);
        kotakFrameHalamanUtama.add(luasPersegi);
        kotakFrameHalamanUtama.add(hasilAngkaKeliling);
        kotakFrameHalamanUtama.add(kelilingPersegi);
        kotakFrameHalamanUtama.add(hasilAngkaVolume);
        kotakFrameHalamanUtama.add(volumeBalok);
        kotakFrameHalamanUtama.add(hasilAngkaLuasPermukaan);
        kotakFrameHalamanUtama.add(luasPermukaanBalok);
        
        sambutan.setBounds(20, 20, 500, 30);
        tutor.setBounds(20, 50, 500, 30);
        panjang.setBounds(20, 90, 100, 30);
        inputPanjang.setBounds(100, 90, 560, 30);
        lebar.setBounds(20, 150, 100, 30);
        inputLebar.setBounds(100, 150, 560, 30);
        tinggi.setBounds(20, 210, 100, 30);
        inputTinggi.setBounds(100, 210, 560, 30);
        hitung.setBounds(20, 260, 640, 30);
        reset.setBounds(20, 310, 640, 30);
        hasil.setBounds(290, 360, 100, 30);
        luasPersegi.setBounds(20, 410, 160, 30);
        hasilAngkaLuas.setBounds(200, 410, 300, 30);
        kelilingPersegi.setBounds(20, 440, 160, 30);
        hasilAngkaKeliling.setBounds(200, 440, 300, 30);
        volumeBalok.setBounds(20, 470, 160, 30);
        hasilAngkaVolume.setBounds(200, 470, 300, 30);
        luasPermukaanBalok.setBounds(20, 500, 160, 30);
        hasilAngkaLuasPermukaan.setBounds(200, 500, 300, 30);
        
        hitung.setHorizontalAlignment(JButton.CENTER);
        reset.setHorizontalAlignment(JButton.CENTER);
        hasil.setHorizontalAlignment(JLabel.CENTER);
        
        kotakFrameHalamanUtama.setVisible(true);
        kotakFrameHalamanUtama.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import View.Mahasiswa.ViewMahasiswa;
import View.Dosen.ViewDosen;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author hp
 */
public class HalamanUtama extends JFrame implements ActionListener {
    
    JLabel header = new JLabel("Selamat Datang :)");
    JLabel tutor = new JLabel("Silahkan pilih lihat data dosen atau mahasiswa");
    JButton pilihDosen = new JButton("Data Dosen");
    JButton pilihMahasiswa = new JButton("Data Mahasiswa");

    public HalamanUtama() {
        setTitle("Halaman Utama");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setSize(552, 500);
        
        add(header);
        add(tutor);
        add(pilihDosen);
        add(pilihMahasiswa);
        
        header.setBounds(20, 8, 440, 24);
        tutor.setBounds(20, 38, 500, 30);
        pilihDosen.setBounds(20, 68, 500, 40);
        pilihMahasiswa.setBounds(20, 128, 500, 40);
        
        pilihDosen.addActionListener(this);
        pilihMahasiswa.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == pilihDosen) {
            dispose();
            new ViewDosen();
        } else if(e.getSource() == pilihMahasiswa) {
            dispose();
            new ViewMahasiswa();
        }
    }
    
}

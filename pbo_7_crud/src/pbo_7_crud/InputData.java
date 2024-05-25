/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_7_crud;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author hp
 */
public class InputData extends JFrame {
    JLabel header = new JLabel("Input Mahasiswa");
    JLabel labelInputNama = new JLabel("Nama");
    JLabel labelInputNIM = new JLabel("NIM");
    JTextField inputNama = new JTextField();
    JTextField inputNIM = new JTextField();
    JButton tombolTambah = new JButton("Tambah Mahasiswa");
    JButton tombolKembali = new JButton("Kembali");

    public InputData() {
        setTitle("Daftar Mahasiswa");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setSize(480, 240);

        add(header);
        add(labelInputNama);
        add(labelInputNIM);
        add(inputNama);
        add(inputNIM);
        add(tombolTambah);
        add(tombolKembali);

        header.setBounds(20, 8, 440, 24);
        labelInputNama.setBounds(20, 32, 440, 24);
        inputNama.setBounds(18, 56, 440, 36);
        labelInputNIM.setBounds(20, 96, 440, 24);
        inputNIM.setBounds(18, 120, 440, 36);
        tombolKembali.setBounds(20, 160, 215, 40);
        tombolTambah.setBounds(240, 160, 215, 40);

        /* 
          Memberikan event handling untuk tombol kembali,
          Ketika tombol kembali diklik, maka akan kembali ke halaman ViewData().
         */
        tombolKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new ViewData();
            }
        });

        tombolTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Mengambil input nama dan nim dan disimpan ke dalam variabel
                    String nama = inputNama.getText();
                    String nim = inputNIM.getText();
                    
                    /*
                      Mengecek apakah input dari nama atau nim kosong/tidak.
                      Jika kosong, maka buatlah sebuah exception.
                    */
                    if ("".equals(nama) || "".equals(nim)) {
                        throw new Exception("Nama atau NIM tidak boleh kosong!");
                    }
                    
                    // Menjalankan update data mahasiswa
                    Connector conn = new Connector();
                    conn.insert(nama, nim);
                    
                    // Menampilkan pop-up ketika berhasil menambah data
                    JOptionPane.showMessageDialog(null, "Berhasil menambahkan data.");
                    
                    // Terakhir, program akan pindah ke halaman ViewData()
                    dispose();
                    new ViewData();
                } catch (Exception exception) {
                    // Menampilkan pop-up ketika terjadi error
                    JOptionPane.showMessageDialog(null, "Error: " + exception.getMessage());
                }
            }
        });
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Website;

import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author hp
 */

public class LoginPage extends JFrame {
    
    JLabel sambutan = new JLabel("Selamat Datang!");
    JLabel tutor = new JLabel("Silahkan masuk untuk melanjutkan.");
    JLabel username = new JLabel("Username");
    JTextField inputUsername = new JTextField();
    JLabel password = new JLabel("Password");
    JTextField inputPassword = new JTextField();
    JLabel jenisKelamin = new JLabel("Jenis Kelamin");
    JRadioButton pilihCowo = new JRadioButton("Laki-laki");
    JRadioButton pilihCewe = new JRadioButton("Perempuan");
    JButton tombolLogin = new JButton("Login");

    public LoginPage() {
        JFrame kotakFrameLogin = new JFrame();
        
        kotakFrameLogin.setSize(700, 600);
        kotakFrameLogin.setTitle("Login Page");
        
        kotakFrameLogin.setLayout(null);
        
        Font font = sambutan.getFont();
        sambutan.setFont(new Font(font.getName(), Font.PLAIN, 24));
        
        kotakFrameLogin.add(sambutan);
        kotakFrameLogin.add(tutor);
        kotakFrameLogin.add(username);
        kotakFrameLogin.add(inputUsername);
        kotakFrameLogin.add(password);
        kotakFrameLogin.add(inputPassword);
        kotakFrameLogin.add(jenisKelamin);
        ButtonGroup pilihJenisKelamin = new ButtonGroup();
        pilihJenisKelamin.add(pilihCowo);
        pilihJenisKelamin.add(pilihCewe);
        kotakFrameLogin.add(pilihCowo);
        kotakFrameLogin.add(pilihCewe);
        kotakFrameLogin.add(tombolLogin);
        
        sambutan.setBounds(20, 20, 200, 30);
        tutor.setBounds(20, 50, 300, 30);
        username.setBounds(20, 80, 100, 30);
        inputUsername.setBounds(20, 110, 640, 30);
        password.setBounds(20, 150, 100, 30);
        inputPassword.setBounds(20, 180, 640, 30);
        jenisKelamin.setBounds(20, 220, 100, 30);
        pilihCowo.setBounds(20, 250, 100, 30);
        pilihCewe.setBounds(220, 250, 100, 30);
        tombolLogin.setBounds(20, 300, 640, 30);
        tombolLogin.setHorizontalAlignment(JButton.CENTER);
                
        kotakFrameLogin.setVisible(true);
        kotakFrameLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbcapp;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author hp
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Menyiapkan objek yang diperlukan untuk mengelola database
        Connection connect;      // Digunakan untuk menghubungkan ke DB.
        Statement statement;     // Digunakan untuk melakukan query.
        ResultSet rs;            // Digunakan untuk menyimpan hasil query.

        try {
            // Menghubungkan program ke MySQL berdasarkan konfigurasi pada file "Connector.java";
            connect = new Connector().conn;

            // Membuat objek statement.
            statement = connect.createStatement();

            /* 
                Menyimpan query database ke dalam variabel "query".
                Dalam hal ini, kita akan mengambil seluruh data mahasiswa pada tabel "students".
             */
            String query = "SELECT * FROM students";

            // Mengeksekusi query dan menyimpannya ke dalam variabel "rs".
            rs = statement.executeQuery(query);

            /* 
                Karena hasil query berupa array, supaya dapat mencetak semua data student,
                Kita perlu melakukan looping (perulangan) untuk mencetak tiap-tiap elemen.
             */
            while (rs.next()) {
                // Mencetak tiap-tiap data mahasiswa.
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Nama: " + rs.getString("nama"));
                System.out.println("NIM: " + rs.getString("nim"));
                System.out.println("");
            }

            // Menutup koneksi untuk menghemat penggunaan memory.
            rs.close();
            statement.close();
            connect.close();
        } catch (Exception e) {
            // Menampilkan pesan error jika terjadi adanya error.
            System.out.println("Error: " + e.getMessage());
        }
    }
}

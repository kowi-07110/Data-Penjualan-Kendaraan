package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.*;
import Controller.datapelangganController;
import Controller.datapembelianController;
import java.util.Date;

public class Gui {
    JFrame GUI = new JFrame();
    JTextField textnpmlogin,textnama,textnotelp,textpassworddaftar,texttgllahir,textnpmdaftar,textktp;
    JButton check,reg;
    JLabel login,daftar,top;
    JLabel labellogin,labelnama,labelpasswordlogin,labelnotelp,jeniskelamin,labeltgllahir,labelnpmdaftar,labelpassworddaftar,identitasktp;
    JRadioButton radiopembeli;
    JPasswordField passwordlogin,passworddaftar;
    private boolean ceklogin = false;
    private static datapelangganController pembeli = new datapelangganController();
    private static datapembelianController penjual = new datapembelianController();
    
    public Gui(){
        GUI.setSize(700, 630);
        GUI.setLayout(null);
        GUI.getContentPane().setBackground(Color.PINK);
        top = new JLabel("JUAL KENDARAAN");
        top.setBounds(150, 10, 600, 50);
        top.setFont(new Font("Times New Roman",Font.BOLD,40));
        GUI.add(top);
        login = new JLabel("login");
        login.setBounds(100, 50, 100, 100);
        login.setFont(new Font("Times New Roman",Font.BOLD,30));
        GUI.add(login);
        radiopembeli = new JRadioButton("Login Pembeli");
        radiopembeli.setBounds(30, 150, 150, 30);
        radiopembeli.setBackground(Color.CYAN);
        GUI.add(radiopembeli);
        
        labellogin = new JLabel("Nama");
        labellogin.setBounds(30, 180, 50, 30);
        GUI.add(labellogin);
        textnpmlogin = new JTextField();
        textnpmlogin.setBounds(30, 210, 200, 30);
        GUI.add(textnpmlogin);
        labelpasswordlogin = new JLabel("Password");
        labelpasswordlogin.setBounds(30, 240, 100, 30);
        GUI.add(labelpasswordlogin);
        passwordlogin = new JPasswordField();
        passwordlogin.setBounds(30, 270, 200, 30);
        GUI.add(passwordlogin);
        check = new JButton("check");
        check.setBounds(90, 320, 100, 40);
        check.setBackground(Color.GREEN);
        GUI.add(check);
        daftar = new JLabel("Buat Akun");
        daftar.setFont(new Font("Times New Roman",Font.BOLD,30));
        daftar.setBounds(440, 50, 150, 100);
        GUI.add(daftar);
        
        labelnama = new JLabel("Nama");
        labelnama.setBounds(400, 150, 100, 30);
        GUI.add(labelnama);
        textnpmdaftar = new JTextField();
        textnpmdaftar.setBounds(400, 180, 200, 30);
        GUI.add(textnpmdaftar);
        labelpassworddaftar = new JLabel("password");
        labelpassworddaftar.setBounds(400, 210, 100, 30);
        GUI.add(labelpassworddaftar);
        textpassworddaftar = new JTextField();
        textpassworddaftar.setBounds(400, 240, 200, 30);
        GUI.add(textpassworddaftar);
        labelpassworddaftar = new JLabel("jenis kelamin");
        labelpassworddaftar.setBounds(400, 270, 100, 30);
        GUI.add(labelpassworddaftar);
        passworddaftar = new JPasswordField();
        passworddaftar.setBounds(400, 300, 200, 30);
        GUI.add(passworddaftar);
        labelnotelp = new JLabel("No Telepon");
        labelnotelp.setBounds(400, 330, 100, 30);
        GUI.add(labelnotelp);
        
        textnotelp = new JTextField();
        textnotelp.setBounds(400, 360, 200, 30);
        GUI.add(textnotelp);
        labeltgllahir = new JLabel("Tanggal Lahir (dd/mm/yyyy)");
        labeltgllahir.setBounds(400, 390, 200, 30);
        GUI.add(labeltgllahir);
        texttgllahir = new JTextField();
        texttgllahir.setBounds(400, 420, 200, 30);
        GUI.add(texttgllahir);
        identitasktp = new JLabel("Masukan Nomer Identitas ");
        identitasktp.setBounds(400, 450, 200, 30);
        GUI.add(identitasktp);
        textktp = new JTextField();
        textktp.setBounds(400, 480, 200, 30);
        GUI.add(textktp);
        reg = new JButton("Daftar");
        reg.setBounds(460, 520, 100, 40);
        reg.setBackground(Color.GREEN);
        GUI.add(reg);
        GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GUI.setVisible(true);
        GUI.setLocationRelativeTo(null);

    }
    
            
}

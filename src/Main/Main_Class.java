package Main;

import Controller.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import View.Gui;

public class Main_Class {
    private static Scanner input = new Scanner(System.in);  
    private static datapelangganController pelanggan = new datapelangganController();
    private static datapembelianController pembelian = new datapembelianController();
    private static int cekdata,loop=-1;
    
    public static void main(String[] args) {
        Gui gui =new Gui();
        belimotor();
        int pilih;
        do{
            System.out.println("TOKO Motor Online Milinia");
            System.out.println("1. Daftar ");
            System.out.println("2. Login ");
            System.out.println("3. Exit");
            System.out.print("Masukkan Pilihan = ");
            pilih = input.nextInt();
            switch(pilih){
                case 1 :
                    daftarpelanggan();
                    break;
                case 2 :
                    login();
                    break;
            }
        }while(pilih!=3);
    }
    
    private static void daftarpelanggan(){
        try{
        System.out.println("<==Masukan Data Customer ==>");
        System.out.print("Masukan Nama = ");
        String kowi07110_nama = input.next();
        System.out.print("Masukan Password = ");
        String kowi07110_password = input.next();
        System.out.print("Masukan Nomer Identitas : ");
        int kowi07110_nomerktp = input.nextInt();
        System.out.print("Masukan Alamat : ");
        String kowi07110_alamat = input.next();
        System.out.print("Masukan Nomer Telp : ");
        int kowi07110_notelp = input.nextInt();
        System.out.print("Masukan Tanggal Lahir : ");
        String kowi07110_tanggallahir = input.next();
        System.out.print("Masukan Jenis Kelamin LAKI-LAKI||PEREMPUAN : ");
        String kowi07110_jeniskelamin = input.next();
        pelanggan.insert(kowi07110_nomerktp, kowi07110_notelp, kowi07110_nama, kowi07110_alamat,kowi07110_jeniskelamin,kowi07110_tanggallahir,kowi07110_password);
        }catch(Exception e){
            System.out.println("Format salah gagal daftar");
        }
    }
    
    private static void login(){
        try{
        int pil;
        System.out.print("Masukkan nama          : ");
        String kowi07110_nama = input.next();
        System.out.print("Masukkan password      : ");
        String kowi07110_password = input.next();
        cekdata = pelanggan.cekdataAkun(kowi07110_nama, kowi07110_password);
        System.out.println("\nSelamat datang "+pelanggan.getData(cekdata).getKowi07110_nama()+"\n");
        do{
        System.out.println("Menu ");
        System.out.println("1. Beli Motor");
        System.out.println("2. Lihat daftar belanja");
        System.out.println("3. Update Data Pribadi");
        System.out.println("4. Hapus Daftar Belanja");
        System.out.println("5. Logout");
        System.out.print("Masukkan Pilihan   : ");
        pil = input.nextInt();
        switch(pil){
            case 1:
                daftarmotor();
                break;
            case 2:
                cetakdaftarbelanja();
                break;
            case 3:
                updatedatapelanggan();
                break;
            case 4:
                hapusdatagame();
                break;
        }
        }while(pil<=4);
        }catch(Exception e){
            System.out.println("Nama atau password salah");
        }
    }
    
    private static void belimotor(){
        
        System.out.println("~~Selamat Datang Di Menu Pembelian~~");
        String kowi07110_merkmotor [] = {"YAMAHA","HONDA","DUCATI"};
        String kowi07110_jenismotor [] = {"SCOOTER","BEBEK","SPORT"};
        String kowi07110_harga [] = {"18.000.000","27.000.000","65.000.000"};
        String kowi07110_tglbeli [] = {"02/01/2021","02/01/2021","02/01/2021"};
        
         for(int i=0;i<kowi07110_merkmotor.length;i++){
             pembelian.insert(kowi07110_merkmotor[i],kowi07110_jenismotor[i],kowi07110_harga[i],kowi07110_tglbeli[i]);
         }
    }
    
    private static void daftarmotor(){
        System.out.println("List Motor : ");
        for(int i=0;i<3;i++){
            System.out.println(i+1);
            System.out.println("=========================================");
            System.out.println(" Merk Motor           : "+pembelian.getData(i).getKowi07110_merkmotor());
            System.out.println(" Jenis Motor          : "+pembelian.getData(i).getKowi07110_jenismotor());
            System.out.println(" Harga Motor          : RP."+pembelian.getData(i).getKowi07110_harga());
            System.out.println(" Tanggal Pembelian    : "+pembelian.getData(i).getKowi07110_tglbeli());
            System.out.println("=========================================");
        }
        System.out.print("Silakan Masukan Nomer Motor Yang akan Dibeli : ");
        int idx=input.nextInt();
        loop++;
        pembelian.getData(loop).setIndexakun(idx);
        pembelian.getData(loop).setIndex(idx-1);
        System.out.println("Motor Dengan merek "+pembelian.getData(pembelian.getData(loop).getIndex()).getKowi07110_merkmotor()+" berhasil dimasukan daftar belanja");
    }
    

    
    static void cetakdaftarbelanja(){
        System.out.println("Game Yang Telah Dibeli : ");
                    System.out.println("=========================================");
                    System.out.println(" Merk Motor          : "+pembelian.getData(pembelian.getData(loop).getIndex()).getKowi07110_merkmotor());
                    System.out.println(" Jenis Motor         : "+pembelian.getData(pembelian.getData(loop).getIndex()).getKowi07110_jenismotor());
                    System.out.println(" Harga Motor         : "+pembelian.getData(pembelian.getData(loop).getIndex()).getKowi07110_harga());
                    System.out.println(" Tanggal Pembelian   : "+pembelian.getData(pembelian.getData(loop).getIndex()).getKowi07110_tglbeli());
        
    }
    
    private static void hapusdatagame(){
    if(loop<0){
            System.out.println("Anda Belum Melakukan Pembelian Motor");
    }
    else{
        for(int i=0;i<=loop;i++){
                if(pembelian.getData(i).getIndexakun()==cekdata){
                    System.out.println("No Pembelian : "+(pembelian.getData(i).getIndex()+1));
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println(" Merk Motor          : "+pembelian.getData(pembelian.getData(loop).getIndex()).getKowi07110_merkmotor());
                    System.out.println(" Jenis Motor         : "+pembelian.getData(pembelian.getData(loop).getIndex()).getKowi07110_jenismotor());
                    System.out.println(" Harga Motor         : "+pembelian.getData(pembelian.getData(loop).getIndex()).getKowi07110_harga());
                    System.out.println(" Tanggal Pembelian   : "+pembelian.getData(pembelian.getData(loop).getIndex()).getKowi07110_tglbeli());
                    

                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                }
            }
        
        }
    }      
    private static void updatedatapelanggan(){
        try{
        System.out.println("1. password");
        System.out.println("2. no telp");
        System.out.print("yang mau diupdate no = ");
        int pilih = input.nextInt();
        switch(pilih){
            case 1:
                System.out.print("Masukkan password baru = ");
                String newpassword = input.next();
                pelanggan.getData(cekdata).setKowi07110_password(newpassword);
                System.out.println("Password berhasil diupdate");
                break;
            case 2:
                System.out.print("Masukkan notelp baru = ");
                String newnotelp = input.next();
                pelanggan.getData(cekdata).setKowi07110_notelp(newnotelp);
                System.out.println("No telp berhasil diupdate");
                break;
        }
        }catch(Exception e){
            System.out.println("format salah update gagal");
        }
    }
   
}
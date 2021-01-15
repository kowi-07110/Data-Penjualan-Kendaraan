package Model;


import Entity.Kowi07110_DataPelangganEntity;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class pelangganModel{
    private ArrayList <Kowi07110_DataPelangganEntity> datapelanggan;

    public pelangganModel(){
        datapelanggan = new ArrayList <Kowi07110_DataPelangganEntity>();
    }
    
    public void insert (Kowi07110_DataPelangganEntity Kowi07110_DataPelangganEntity){
        datapelanggan.add(Kowi07110_DataPelangganEntity);
    }
    
    public int cekdata(String kowi07110_nama, String kowi07110_password){
        int loop = 0;
        while(!datapelanggan.get(loop).getKowi07110_nama().equals(kowi07110_nama)&&
                !datapelanggan.get(loop).getKowi07110_password().equals(kowi07110_password)){
            loop++;
        }
        return loop;
    }
    
    public Kowi07110_DataPelangganEntity getdatapelanggan(int index){
        return datapelanggan.get(index);
    }
    
    public boolean cekempty(boolean cek){
        while(datapelanggan.isEmpty()){
            System.out.println("\nBELUM ADA AKUN YANG TERDAFTAR\n");
            cek=true;
            break;
        }
        while(!datapelanggan.isEmpty()){
            cek=false;
            break;
        }
        return cek;
    }
}
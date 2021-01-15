package Controller;

import Entity.Kowi07110_DataPelangganEntity;
import java.util.Date;

public class datapelangganController {

    public datapelangganController() {
    }
    public Kowi07110_DataPelangganEntity getData(int index) {
        return AllObjectModel.datapelangganModel.getdatapelanggan(index);
    }
    
    public void insert(int kowi07110_nomerktp, int kowi07110_notelp, String kowi07110_nama, String kowi07110_alamat, String kowi07110_jeniskelamin, String kowi07110_tanggallahir, String kowi07110_password) {
        AllObjectModel.datapelangganModel.insert(new Kowi07110_DataPelangganEntity(kowi07110_nomerktp,kowi07110_notelp,kowi07110_nama,kowi07110_alamat,kowi07110_jeniskelamin,kowi07110_tanggallahir,kowi07110_password));
    }
    public int cekdataAkun(String kowi07110_nama,String kowi07110_password){
        int cekdata = AllObjectModel.datapelangganModel.cekdata(kowi07110_nama, kowi07110_password);
        return cekdata;
    }
   
    public boolean cekKosong(boolean cek){
        boolean cekakun = AllObjectModel.datapelangganModel.cekempty(cek);
        return cekakun;
    }

    public void insert(int nomerktp, int notelp, String nama, String alamat, String jeniskelamin, String tanggallahir) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

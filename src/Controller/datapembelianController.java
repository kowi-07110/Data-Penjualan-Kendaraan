package Controller;

import Entity.Kowi07110_DataPembelianEntity;
import java.util.Date;

public class datapembelianController {

    public int length;

    public datapembelianController() {
    }
    
    public Kowi07110_DataPembelianEntity getData(int index) {
        return AllObjectModel.datapembelianModel.getdatapembelian(index);
    }
    
    public void insert(String kowi07110_tglbeli, String kowi07110_merkmotor, String kowi07110_jenismotor, String kowi07110_harga) {
        AllObjectModel.datapembelianModel.insert(new Kowi07110_DataPembelianEntity(kowi07110_tglbeli,kowi07110_merkmotor,kowi07110_jenismotor,kowi07110_harga));
    }
    
    public void delete(int index){
        AllObjectModel.datapembelianModel.delete(index);
    }

   

}


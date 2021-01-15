package Model;

import Entity.Kowi07110_DataPembelianEntity;
import java.util.ArrayList;
import java.text.SimpleDateFormat;

public class PembelianModel{
    private ArrayList <Kowi07110_DataPembelianEntity> datapembelian;

    public PembelianModel(){
        datapembelian = new ArrayList <Kowi07110_DataPembelianEntity>();
    }
    
    public void insert (Kowi07110_DataPembelianEntity Kowi07110_DataPembelianEntity){
        datapembelian.add(Kowi07110_DataPembelianEntity);
    }
   
    public Kowi07110_DataPembelianEntity getdatapembelian(int index){
        return datapembelian.get(index);
    }
    
    public void delete(int index){
        datapembelian.remove(index);
    }
}

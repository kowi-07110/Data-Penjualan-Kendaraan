package Entity;
import java.util.Date;

public class Kowi07110_DataPembelianEntity extends Kowi07110_AbstractEntity {
    public String kowi07110_merkmotor,kowi07110_jenismotor,kowi07110_harga;
    private int index,indexakun;

    public Kowi07110_DataPembelianEntity(String kowi07110_merkmotor, String kowi07110_jenismotor, String kowi07110_harga, String kowi07110_tglbeli) {
        super(kowi07110_tglbeli);
        this.kowi07110_merkmotor = kowi07110_merkmotor;
        this.kowi07110_jenismotor = kowi07110_jenismotor;
        this.kowi07110_harga = kowi07110_harga;
    }

    public Kowi07110_DataPembelianEntity(int index, int indexakun) {
        this.index = index;
        this.indexakun = indexakun;
    }

    public String getKowi07110_merkmotor() {
        return kowi07110_merkmotor;
    }

    public void setKowi07110_merkmotor(String kowi07110_merkmotor) {
        this.kowi07110_merkmotor = kowi07110_merkmotor;
    }

    public String getKowi07110_jenismotor() {
        return kowi07110_jenismotor;
    }

    public void setKowi07110_jenismotor(String kowi07110_jenismotor) {
        this.kowi07110_jenismotor = kowi07110_jenismotor;
    }

    public String getKowi07110_harga() {
        return kowi07110_harga;
    }

    public void setKowi07110_harga(String kowi07110_harga) {
        this.kowi07110_harga = kowi07110_harga;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getIndexakun() {
        return indexakun;
    }

    public void setIndexakun(int indexakun) {
        this.indexakun = indexakun;
    }

    @Override
    public String getKowi07110_tglbeli() {
        return kowi07110_tglbeli;
    }

    
}

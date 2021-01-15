package Entity;

import java.util.Date;

public abstract class Kowi07110_AbstractEntity {
    protected String kowi07110_tglbeli;
    

    public Kowi07110_AbstractEntity(String kowi07110_tglbeli) {
        this.kowi07110_tglbeli = kowi07110_tglbeli;
        
    }

    
    public Kowi07110_AbstractEntity() {
    }
    
    public abstract String getKowi07110_tglbeli();

    public void setKowi07110_tglbeli(String kowi07110_tglbeli) {
        this.kowi07110_tglbeli = kowi07110_tglbeli;
    }

    
    
    
}
package sample;

import java.util.Date;

public class Housekeeping{

    boolean hs;
    Date dateOfHs;
    String time;
    void setDateOfHs(Date dateOfHs){
        this.dateOfHs=dateOfHs;
    }

    public void setTime(String time) {
        this.time = time;
    }

    void housekeepingStatus(boolean hs){
        this.hs=hs;
    }
    public void Requests(boolean hs){
        this.hs=hs;
    }
}

package sample;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Manager extends Account{

    private boolean requests;

    public Manager(){}

    public Manager(String fullName, String loginCode, boolean requests) {
        super(fullName, loginCode);
        this.requests = requests;
    }

    public void housekeepingRequests(boolean requests){
        this.requests=requests;
    }
    public void comfortFacilitiesRequests(boolean requests){
        this.requests=requests;
    }
    public void ReservationRequests(boolean requests){
        this.requests=requests;
    }
    public void viewScheduling() throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("https://keep.google.com/u/0/"));
    }

}

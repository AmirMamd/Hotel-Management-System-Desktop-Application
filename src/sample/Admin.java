package sample;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Date;

public class Admin extends Account{

    String serviceName;
    String hotelNameAdded;
    String addAds;

    public Admin(String FullName, String logincode,String serviceName, String hotelNameAdded, String addAds) {
        super(FullName,logincode);
        this.serviceName = serviceName;
        this.hotelNameAdded = hotelNameAdded;
        this.addAds = addAds;
    }

    public Admin(){}

    public void addServices(String serviceName){
        this.serviceName= serviceName;
    }
    public void AddHotel(String hotelNameAdded){
        this.hotelNameAdded=hotelNameAdded;
    }
    public void AddAds(String addAds){
        this.addAds=addAds;
    }
    public void AddStatisticalData() throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("https://engasuedu-my.sharepoint.com/:x:/g/personal/19p5685_eng_asu_edu_eg/EdF0MtlFnj1CmiOQ2iqzL0gB7vyToJ1nel1OnDlCZz3TVw?e=r887FW"));
    }
    public void HousekeepingSchedule() throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("https://engasuedu-my.sharepoint.com/:x:/g/personal/19p5685_eng_asu_edu_eg/EThWzaQXfRJKlUovvPksgXYB9DechiR_x7-y9w7aQp2YhQ?e=NHqTUG"));
    }

}

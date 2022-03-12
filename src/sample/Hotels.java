package sample;

import java.util.Date;

public class Hotels {
    private String name;
    private String rating;
    private String location;
    private String roomType;
    private Date checkin;
    private Date checkout;
    public Hotels(){}
    public Hotels(String name, String rating, String location, String roomType, Date checkin, Date checkout) {
        this.name = name;
        this.rating = rating;
        this.location = location;
        this.roomType = roomType;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public Date getCheckin() {
        return checkin;
    }

    public void setCheckin(Date checkin) {
        this.checkin = checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public void setCheckout(Date checkout) {
        this.checkout = checkout;
    }

}
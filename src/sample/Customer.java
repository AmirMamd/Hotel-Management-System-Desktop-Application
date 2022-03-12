package sample;

import java.util.Date;

public class Customer extends Account{
    String username;
    String phoneNumber;
    String password;
    String HotelName;
    Date checkIn;
    Date checkOut;
    String roomType;
    String service;

    public Customer(String username, String FullName, String phoneNumber, String password, String hotelName, Date checkIn, Date checkOut, String roomType, String service) {
        super(FullName,password);
        this.username = username;
        this.phoneNumber = phoneNumber;
        this.password = password;
        HotelName = hotelName;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.roomType = roomType;
        this.service = service;
    }
    public Customer(String username,String fullName, String phoneNumber, String password){
        this.username = username;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }
    public Customer(){};

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHotelName() {
        return HotelName;
    }

    public void setHotelName(String hotelName) {
        HotelName = hotelName;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

}

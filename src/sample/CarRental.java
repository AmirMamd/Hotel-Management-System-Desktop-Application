package sample;

import java.util.Date;

public class CarRental {
    private Date date;
    private String carType;
    public CarRental(){}
    public CarRental(Date date, String carType) {
        this.date = date;
        this.carType = carType;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }
}

package com.showmy.backend.entity;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "ref_pin_code")
public class PinCode {

    @Id
    @Column(name = "pin_id")
    private int id;
    @Column(name = "pin_code")
    private int pinCode;
    @Column(name = "area")
    private String area;
    @Column(name = "delivery_timeline")
    private int deliveryTimeline;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getDeliveryTimeline() {
        return deliveryTimeline;
    }

    public void setDeliveryTimeline(int deliveryTimeline) {
        this.deliveryTimeline = deliveryTimeline;
    }
}

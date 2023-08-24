package com.showmy.backend.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PinCodeResponse {

    private boolean deliveryAvailable;
    private int deliveryTimeline;

    private int pinCode;

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public int getDeliveryTimeline() {
        return deliveryTimeline;
    }

    public void setDeliveryTimeline(int deliveryTimeline) {
        this.deliveryTimeline = deliveryTimeline;
    }

    public boolean isDeliveryAvailable() {
        return deliveryAvailable;
    }

    public void setDeliveryAvailable(boolean deliveryAvailable) {
        this.deliveryAvailable = deliveryAvailable;
    }
}

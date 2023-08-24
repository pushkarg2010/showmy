package com.showmy.backend.controller;


import com.showmy.backend.responses.PinCodeResponse;
import com.showmy.backend.service.PinCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AppController {

    @Autowired
    private PinCodeService pinCodeService;

    @GetMapping("/pincode/{pincode}")
    public PinCodeResponse getPinCodeAvailable(@PathVariable("pincode") int pinCode) {

        PinCodeResponse response = pinCodeService.getDeliverableAtPincode(pinCode);
        return response;
    }


}

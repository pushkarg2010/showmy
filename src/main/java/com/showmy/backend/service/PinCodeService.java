package com.showmy.backend.service;


import com.showmy.backend.entity.PinCode;
import com.showmy.backend.repository.PinCodeRepository;
import com.showmy.backend.responses.PinCodeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PinCodeService {


    @Autowired
    private PinCodeRepository pinCodeRepository;

    public PinCodeResponse getDeliverableAtPincode(int pinCode) {

        PinCodeResponse response= new PinCodeResponse();

        List<PinCode> pinCodes = pinCodeRepository.findAll();

        Optional<PinCode> found = pinCodes.stream().filter(s -> s.getPinCode() == pinCode ).findAny();

        if(found.isPresent()) {
            response.setPinCode(found.get().getPinCode());
            response.setDeliveryAvailable(true);
            response.setDeliveryTimeline(found.get().getDeliveryTimeline());
        } else {
            response.setPinCode(pinCode);
            response.setDeliveryAvailable(false);
            response.setDeliveryTimeline(0);
        }

        return response;
    }


}

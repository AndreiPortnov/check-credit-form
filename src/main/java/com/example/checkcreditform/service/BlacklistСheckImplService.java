package com.example.checkcreditform.service;

import com.example.checkcreditform.dto.CreditApplicationDTO;
import com.example.checkcreditform.entity.BlacklistEntity;
import com.example.checkcreditform.repository.BlacklistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlacklistСheckImplService implements BlacklistСheckService{
    @Autowired
    BlacklistRepository blacklistRepository;

    @Override
    public boolean isInBlaclist(CreditApplicationDTO creditApplicationDTO) {
        String serial = creditApplicationDTO.getPassportSerialMain();
        String number = creditApplicationDTO.getPassportNumberMain();
        List<BlacklistEntity> checklist = blacklistRepository.getByPassportSerialAndPassportNumber(serial, number);
        for (BlacklistEntity be: checklist){
            if (be.equals(creditApplicationDTO)){
                return false;
            }
        }
        return true;
    }


}

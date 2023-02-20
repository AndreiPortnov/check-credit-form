package com.example.checkcreditform.controller;


import com.example.checkcreditform.dto.CreditApplicationDTO;
import com.example.checkcreditform.service.BlacklistСheckService;
import com.example.checkcreditform.service.SolvencyCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static com.example.checkcreditform.service.StaticConstant.*;

@RestController
@RequestMapping("/security-check")//в константы
public class CheckCreditController {

    @Autowired
    BlacklistСheckService blacklistСheckService;
    @Autowired
    SolvencyCheckService solvencyCheckService;

    @PostMapping("/credit-limit")
    public @ResponseBody String getCheck(@RequestBody CreditApplicationDTO creditApplicationDTO) {

        if (blacklistСheckService.isInBlaclist(creditApplicationDTO) == false){
            return NEGATIVE_APPROVE_BLACKLIST;
        } if (solvencyCheckService.isSolvent(creditApplicationDTO) == false){
            return NEGATIVE_APPROVE_SOLVENCY;
        } return APPROVE;



//        if (creditApplicationDTO.getContactsGuarantor().getEmail().isEmpty()) {
//            return "данные для проверки отсутствуют";
//        }

    }

}

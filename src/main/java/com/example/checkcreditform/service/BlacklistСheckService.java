package com.example.checkcreditform.service;

import com.example.checkcreditform.dto.CreditApplicationDTO;

public interface BlacklistŠ”heckService {
    boolean isInBlaclist(CreditApplicationDTO creditApplicationDTO);
}

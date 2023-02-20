package com.example.checkcreditform.service;

import com.example.checkcreditform.dto.CreditApplicationDTO;

public interface BlacklistСheckService {
    boolean isInBlaclist(CreditApplicationDTO creditApplicationDTO);
}

package com.example.checkcreditform.service;

import com.example.checkcreditform.dto.CreditApplicationDTO;

public interface SolvencyCheckService {
    boolean isSolvent(CreditApplicationDTO creditApplicationDTO);
}

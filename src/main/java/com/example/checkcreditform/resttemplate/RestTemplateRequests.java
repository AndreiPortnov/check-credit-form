package com.example.checkcreditform.resttemplate;


import com.example.checkcreditform.dto.CreditApplicationDTO;

public interface RestTemplateRequests {
    String checkRequestClient(CreditApplicationDTO creditApplicationDTO);
}

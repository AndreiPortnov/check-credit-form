package com.example.checkcreditform.service;

import com.example.checkcreditform.dto.CreditApplicationDTO;
import org.springframework.stereotype.Service;

@Service
public class SolvencyCheckImplService implements SolvencyCheckService{

    @Override
    public boolean isSolvent(CreditApplicationDTO creditApplicationDTO){

        int income = creditApplicationDTO.getIncomePerMonthMain();
        int expense = creditApplicationDTO.getMonthlyExpenseMain();

        int percentageDifference = ((income - expense) * 100) / income;
        int requiredPercentage = (int)(Math.round(income * 0.3)) * 100 / income;

        if (percentageDifference >= requiredPercentage){
            return true;
        }
        return false;
    }
}

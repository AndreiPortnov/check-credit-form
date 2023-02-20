package com.example.checkcreditform.service_test;


import com.example.checkcreditform.dto.CreditApplicationDTO;
import com.example.checkcreditform.service.SolvencyCheckImplService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)

public class SolvencyServiceTest {

    @InjectMocks//куда внедряешь
    private SolvencyCheckImplService solvencyCheckImplService;

    @Mock
    private CreditApplicationDTO creditApplicationDTO;

    @Test
    public void isSolventTest() {
        CreditApplicationDTO creditApplicationDTO1 = new CreditApplicationDTO();
        creditApplicationDTO1.setIncomePerMonthMain(creditApplicationDTO.getIncomePerMonthMain());
        creditApplicationDTO1.setMonthlyExpenseMain(creditApplicationDTO.getMonthlyExpenseMain());


//        Mockito.when(creditApplicationDTO.getIncomePerMonthMain()).thenReturn(100);
//        Mockito.when(creditApplicationDTO.getMonthlyExpenseMain()).thenReturn(80);

//        boolean solvent = solvencyCheckImplService.isSolvent(creditApplicationDTO1);

//        Assert.assertTrue(solvent == false);

    }
}

package com.sofia;

import com.sofia.soap.MathOperation;
import com.sofia.soap.OperationType;
import com.sofia.soap.CalculatorService;
import com.sofia.soap.CalculatorServiceImpService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class SoapTest {
    CalculatorService soapService = new CalculatorServiceImpService().getCalculatorServiceImpPort();

    private static final Logger LOG = LogManager.getLogger(SoapTest.class);

    @Test
    public void testAdd() throws IOException {
        MathOperation operation = new MathOperation(6, OperationType.ADD, 5);
        soapService.doOperation(operation);
    }

}

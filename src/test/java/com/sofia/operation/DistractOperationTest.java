package com.sofia.operation;

import com.google.gson.Gson;
import com.sofia.dto.HistoryRecord;
import com.sofia.dto.MathOperation;
import com.sofia.dto.OperationType;
import com.sofia.rest.ClientService;
import com.sofia.util.GsonConverter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class DistractOperationTest {
    private static final Logger LOG = LogManager.getLogger(MultiplyOperationTest.class);
    private Gson converter = GsonConverter.getConverter();
    ClientService clientService = new ClientService();

    @DataProvider(name = "dastractParams")
    public static Object[][] credentials() {
        return new Object[][] { {1, 6, -5}, {9, 7, 2}};
    }

    @Test(dataProvider = "dastractParams")
    public void testAdd(double firstNum, double secondNum, double expectedResult) throws IOException {
        MathOperation operation = new MathOperation(firstNum, secondNum, OperationType.DISTRACT);
        HistoryRecord record = clientService.doMathOperation(operation);
        assertNotNull(record);
        assertEquals(record.getResult(), expectedResult);
        LOG.info(converter.toJson(record));
        assertNotNull(clientService.getHistoryRecordById(record.getId()));
    }
}

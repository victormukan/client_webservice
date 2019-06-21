package com.sofia.operation;

import com.sofia.BaseTest;
import com.sofia.dto.HistoryRecord;
import com.sofia.dto.MathOperation;
import com.sofia.dto.OperationType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class AddOperationTest extends BaseTest {
    private static final Logger LOG = LogManager.getLogger(AddOperationTest.class);

    @DataProvider(name = "addParams")
    public static Object[][] credentials() {
        return new Object[][] { {1, 6, 7}, {6, 9, 15}, {7, 10, 17}, {6.6, 5, 11.6}};
    }

    @Test(dataProvider = "addParams")
    public void testAdd(double firstNum, double  secondNum, double  expectedResult) {
        MathOperation operation = new MathOperation(firstNum, secondNum, OperationType.ADD);
        HistoryRecord record = clientService.doMathOperation(operation);
        assertNotNull(record);
        assertEquals(record.getResult(), expectedResult);
        LOG.info(converter.toJson(record));
        assertNotNull(clientService.getHistoryRecordById(record.getId()));
    }
}

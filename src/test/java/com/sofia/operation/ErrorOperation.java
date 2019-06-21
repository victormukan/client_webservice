package com.sofia.operation;

import com.google.gson.JsonSyntaxException;
import com.sofia.BaseTest;
import com.sofia.dto.HistoryRecord;
import com.sofia.dto.MathOperation;
import com.sofia.dto.OperationType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import static org.testng.Assert.assertNotNull;

public class ErrorOperation extends BaseTest {
    private static final Logger LOG = LogManager.getLogger(ErrorOperation.class);

    @Test(expectedExceptions = {IllegalStateException.class, JsonSyntaxException.class})
    public void testAdd() {
        MathOperation operation = new MathOperation(7, 0, OperationType.DEVIDE);
        HistoryRecord record = clientService.doMathOperation(operation);
        assertNotNull(record);
        LOG.info(converter.toJson(record));
        assertNotNull(clientService.getHistoryRecordById(record.getId()));
    }
}

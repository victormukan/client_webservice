package com.sofia.history;

import com.google.gson.Gson;
import com.sofia.rest.ClientService;
import com.sofia.dto.HistoryRecord;
import com.sofia.dto.MathOperation;
import com.sofia.dto.OperationType;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.sofia.util.GsonConverter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class GetAllHistoryTest {
    private static final Logger LOG = LogManager.getLogger(HistoryTest.class);
    Gson converter = GsonConverter.getConverter();
    ClientService clientService = new ClientService();

    @BeforeMethod
    public void postTestHistory() throws IOException {
        MathOperation operation = new MathOperation(3, 8, OperationType.MULTIPLY);
        HistoryRecord record = clientService.doMathOperation(operation);
        assertNotNull(clientService.getHistoryRecordById(record.getId()));
        LOG.info(converter.toJson(record));
    }

    @Test
    public void testGetHistory() throws IOException {
        List<HistoryRecord> result = clientService.getAllHistory();
        LOG.info(converter.toJson(result));
        assertEquals((int) (clientService.getHistorySize()), result.size());
    }
}


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

import java.util.List;

import static org.junit.Assert.*;

public class HistoryTest {
    private static final Logger LOG = LogManager.getLogger(HistoryTest.class);
    Gson converter = GsonConverter.getConverter();
    ClientService clientService = new ClientService();

    @BeforeMethod
    public void postTestHistory() {
        MathOperation operation = new MathOperation(3, 4, OperationType.MULTIPLY);
        HistoryRecord record = clientService.doMathOperation(operation);
        System.out.println(converter.toJson(record));

    }

    @Test
    public void testAdd() {
        MathOperation operation = new MathOperation(1, 4, OperationType.ADD);
        HistoryRecord record = clientService.doMathOperation(operation);
        assertNotNull(record);
        LOG.info(converter.toJson(record));
        int id = record.getId();
        assertNotNull(clientService.getHistoryRecordById(id));
    }

    @Test
    public void testGetLimitedHistory() {
        List<HistoryRecord> history = clientService.getLimitedHistory("1m");
        LOG.info(converter.toJson(history));
    }

    @Test
    public void testGetHistoryRecordById() {
        HistoryRecord record = clientService.getHistoryRecordById(4);
        LOG.info(converter.toJson(record));
    }
}

package com.sofia.history;

import com.sofia.BaseTest;
import com.sofia.dto.HistoryRecord;
import com.sofia.dto.MathOperation;
import com.sofia.dto.OperationType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class LimitHistoryTest extends BaseTest {
    private static final Logger LOG = LogManager.getLogger(HistoryTest.class);

    @Test
    public void testCorrectDateHistory() {
        List<HistoryRecord> history = clientService.getLimitedHistory("3h");
        assertNotNull(history);
        history.stream().map(s -> {
            int id = s.getId();
            HistoryRecord record = clientService.getHistoryRecordById(id);
            assertEquals(s.getRequestTime(), record.getRequestTime());
            return record;
        }).collect(Collectors.toList());
        LOG.info(converter.toJson(history));
    }

    @Test
    public void testGetLimitedHistory() throws InterruptedException {
        Thread.sleep(100);
        List<MathOperation> listOperations = new ArrayList<>(Arrays.asList(
                new MathOperation(3, 68, OperationType.MULTIPLY),
                new MathOperation(9, 9, OperationType.ADD),
                new MathOperation(8, 456, OperationType.PROCENT)
        ));

        List<HistoryRecord> listRecord = new ArrayList<>();
        listOperations.stream().map(s -> {
            listRecord.add(clientService.doMathOperation(s));
            return listRecord;
        }).collect(Collectors.toList());

        assertEquals(listOperations.size(), listRecord.size());
        assertEquals(clientService.getLimitedHistory("15s").size(), listOperations.size());
    }

}

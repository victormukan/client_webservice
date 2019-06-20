package com.sofia.history;

import com.google.gson.Gson;
import com.sofia.rest.ClientService;
import com.sofia.dto.HistoryRecord;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import com.sofia.util.GsonConverter;

import java.io.IOException;
import java.util.List;

public class LimitHistoryTest {
    private static final Logger LOG = LogManager.getLogger(HistoryTest.class);
    Gson converter = GsonConverter.getConverter();
    ClientService clientService = new ClientService();

    @Test
    public void testGetLimitedHistory() {
        try {
            List<HistoryRecord> history = clientService.getLimitedHistory("1m");
            LOG.info(converter.toJson(history));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

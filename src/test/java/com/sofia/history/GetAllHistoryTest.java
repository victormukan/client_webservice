package com.sofia.history;

import com.sofia.BaseTest;
import com.sofia.dto.HistoryRecord;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

import static org.junit.Assert.assertEquals;
public class GetAllHistoryTest extends BaseTest {
    private static final Logger LOG = LogManager.getLogger(GetAllHistoryTest.class);

    @Test
    public void testGetHistory() {
        List<HistoryRecord> result = clientService.getAllHistory();
        LOG.info(converter.toJson(result));
        assertEquals((int) (clientService.getHistorySize()), result.size());
        LOG.info("Successfully got all operation history");
    }
}


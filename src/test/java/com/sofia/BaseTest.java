package com.sofia;

import com.google.gson.Gson;
import com.sofia.rest.ClientService;
import com.sofia.util.GsonConverter;

public class BaseTest {
    protected  Gson converter = GsonConverter.getConverter();
    protected ClientService clientService = new ClientService();
}

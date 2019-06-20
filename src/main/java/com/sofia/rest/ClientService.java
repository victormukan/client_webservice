package com.sofia.rest;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sofia.dto.HistoryRecord;
import com.sofia.dto.MathOperation;
import okhttp3.*;
import com.sofia.util.GsonConverter;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class ClientService {
    private OkHttpClient client = new OkHttpClient();
    private String baseUrl = "http://localhost:3000/api";
    private Gson converter = GsonConverter.getConverter();

    public List<HistoryRecord> getAllHistory() {
        Request request = new Request.Builder()
                .url(baseUrl + "/history")
                .build();

        Call call = client.newCall(request);

        List<HistoryRecord> history = null;
        try {
            Response response = call.execute();

            Type listType = new TypeToken<ArrayList<HistoryRecord>>() {
            }.getType();
            history = converter.fromJson(response.body().string(), listType);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return history;
    }

    public List<HistoryRecord> getLimitedHistory(String limitValue) throws IOException{
        Request request = new Request.Builder()
                .url(baseUrl + "/history?limit=" + limitValue)
                .build();

        Call call = client.newCall(request);
        Response response = call.execute();

        Type listType = new TypeToken<ArrayList<HistoryRecord>>(){}.getType();
        return converter.fromJson(response.body().string(), listType);
    }

    public HistoryRecord getHistoryRecordById(int id) throws IOException{
        Request request = new Request.Builder()
                .url(baseUrl + "/history/" + id)
                .build();

        Call call = client.newCall(request);
        Response response = call.execute();

        return converter.fromJson(response.body().string(), HistoryRecord.class);
    }

    public Integer getHistorySize() throws IOException{
        Request request = new Request.Builder()
                .url(baseUrl + "/history/size")
                .build();

        Call call = client.newCall(request);
        Response response = call.execute();

        return Integer.valueOf(response.body().string());
    }

    public HistoryRecord doMathOperation(MathOperation operation) throws IOException {
        MediaType JSON = MediaType.parse("application/json; charset=utf-8");

        RequestBody body = RequestBody.create(JSON, converter.toJson(operation));

        Request request = new Request.Builder()
                .url(baseUrl + "/math")
                .post(body)
                .build();

        Call call = client.newCall(request);
        Response response = call.execute();

        return converter.fromJson(response.body().string(), HistoryRecord.class);
    }

}

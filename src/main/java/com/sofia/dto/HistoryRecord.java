package com.sofia.dto;


import java.time.LocalDateTime;

public class HistoryRecord {

    private int id;
    private double firstNumber;
    private double secondNumber;
    private String mathOperation;
    private double result;
    private LocalDateTime requestTime;

    public HistoryRecord() {
    }

    public HistoryRecord(double firstNumber, double secondNumber, String mathOperation, double result) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.mathOperation = mathOperation;
        this.result = result;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public String getMathOperation() {
        return mathOperation;
    }

    public void setMathOperation(String mathOperation) {
        this.mathOperation = mathOperation;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public LocalDateTime getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(LocalDateTime requestTime) {
        this.requestTime = requestTime;
    }
}

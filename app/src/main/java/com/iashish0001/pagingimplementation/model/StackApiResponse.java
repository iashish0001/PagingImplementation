package com.iashish0001.pagingimplementation.model;

import java.util.List;


public class StackApiResponse {
    private int status;
    private String message;

    @Override
    public String toString() {
        return "StackApiResponse{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", data='" + data + '\'' +
                ", test_titles=" + test_titles +
                '}';
    }

    private String data;
    private List<Item> test_titles;


    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<Item> getTest_titles() {
        return test_titles;
    }

    public void setTest_titles(List<Item> test_titles) {
        this.test_titles = test_titles;
    }


    public StackApiResponse(int status, String message, String data, List<Item> test_titles) {
        this.status = status;
        this.message = message;
        this.data = data;
        this.test_titles = test_titles;
    }


}
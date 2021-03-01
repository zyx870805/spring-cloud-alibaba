package com.example;

public class MysqlDriver implements Driver{
    @Override
    public String connect() {
        return "connect mysql db";
    }
}

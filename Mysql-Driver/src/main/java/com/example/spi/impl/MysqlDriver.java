package com.example.spi.impl;

import com.example.spi.Driver;

public class MysqlDriver implements Driver {


    @Override
    public String connect() {
        return "connnect mysql db";
    }
}

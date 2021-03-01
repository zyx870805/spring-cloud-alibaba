package com.example;

import org.apache.dubbo.common.extension.SPI;

@SPI
public interface Driver {
    String connect();
}

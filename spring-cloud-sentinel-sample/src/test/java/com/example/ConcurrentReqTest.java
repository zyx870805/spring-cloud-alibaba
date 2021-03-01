package com.example;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ConcurrentReqTest {

    public static void main(String[] args) throws IOException {
        URL url = new URL("http://localhost:8080/say");
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
    }
}

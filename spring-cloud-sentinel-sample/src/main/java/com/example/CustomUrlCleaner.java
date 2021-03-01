package com.example;

import com.alibaba.csp.sentinel.adapter.servlet.callback.UrlCleaner;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class CustomUrlCleaner implements UrlCleaner {
    @Override
    public String clean(String originUrl) {
        if (StringUtils.isEmpty(originUrl)) {
            return originUrl;
        }
        if (originUrl.startsWith("/clean")) {
            return "/clean/*";
        }
        return originUrl;
    }
}

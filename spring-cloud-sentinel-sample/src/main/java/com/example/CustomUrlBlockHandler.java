package com.example;

import com.alibaba.csp.sentinel.adapter.servlet.callback.UrlBlockHandler;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@Service
//public class CustomUrlBlockHandler implements UrlBlockHandler {
//    @Override
//    public void blocked(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, BlockException e) throws IOException {
//        httpServletResponse.setHeader("Content-Type", "application/json;charset=UTF-8");
//        String message = "{\"code\":999, \"msg\":\"訪問人數過多\"}";
//        httpServletResponse.getWriter().write(message);
//    }
//}

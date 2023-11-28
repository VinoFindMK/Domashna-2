package com.ukim.finki.domashna2.service;

import com.ukim.finki.domashna2.model.WineryInfo;

import java.util.List;

public class QuoteFilter {
    public static void quoteFilter(List<WineryInfo> wineryData) {

        for (WineryInfo info : wineryData) {
            if(info.address.contains("\"")){
                info.address = info.address.replace("\"", "“");
            }
        }
    }
}

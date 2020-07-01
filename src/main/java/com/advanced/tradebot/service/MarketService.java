package com.advanced.tradebot.service;

import com.advanced.tradebot.model.dto.MarketPickerData;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.stereotype.Service;

@Service
public interface MarketService {

    MarketPickerData getTicker();
    void createOrder();
    void cancelOrder();
    void createReplaceOrder();


}

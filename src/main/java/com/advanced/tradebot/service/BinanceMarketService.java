package com.advanced.tradebot.service;

import com.advanced.tradebot.model.dto.MarketPickerData;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("binance")
public class BinanceMarketService implements MarketService {
    @Override
    public MarketPickerData getTicker() {
        return null;
    }

    @Override
    public void createOrder() {

    }

    @Override
    public void cancelOrder() {

    }

    @Override
    public void createReplaceOrder() {

    }
}

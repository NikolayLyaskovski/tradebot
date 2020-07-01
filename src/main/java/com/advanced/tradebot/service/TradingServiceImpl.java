package com.advanced.tradebot.service;

import com.advanced.tradebot.model.dto.MarketPickerData;
import com.advanced.tradebot.model.enumeration.Market;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TradingServiceImpl implements TradingService {



    private final MarketFactory marketFactory;

    @Autowired
    public TradingServiceImpl(MarketFactory marketFactory) {
        this.marketFactory = marketFactory;
    }


    @Override
    public void createDeal(Market market) {
        MarketPickerData ticker = marketFactory.getMarketService(market).getTicker();

    }
}

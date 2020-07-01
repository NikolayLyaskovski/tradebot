package com.advanced.tradebot.service;

import com.advanced.tradebot.model.enumeration.Market;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MarketFactory {

    private final MarketService krakenMarkedService;
    private final MarketService binanceMarkedService;


    @Autowired
    public MarketFactory(@Qualifier("kraken") MarketService krakenMarkedService,
                         @Qualifier("binance") MarketService binanceMarkedService) {

        this.krakenMarkedService = krakenMarkedService;
        this.binanceMarkedService = binanceMarkedService;
    }


    public MarketService getMarketService(Market market) {
        switch (market) {

            case KRAKEN:
                return krakenMarkedService;
            case BINANCE:
                return binanceMarkedService;
            default:
                throw new IllegalArgumentException("Invalid Market");
        }
    }
}

package com.advanced.tradebot.model.dto;

import java.math.BigDecimal;

public class MarketPickerData {

    private BigDecimal priceAsk;
    private BigDecimal priceBid;
    private BigDecimal pricelast;

    public BigDecimal getPriceAsk() {
        return priceAsk;
    }

    public void setPriceAsk(BigDecimal priceAsk) {
        this.priceAsk = priceAsk;
    }

    public BigDecimal getPriceBid() {
        return priceBid;
    }

    public void setPriceBid(BigDecimal priceBid) {
        this.priceBid = priceBid;
    }

    public BigDecimal getPricelast() {
        return pricelast;
    }

    public void setPricelast(BigDecimal pricelast) {
        this.pricelast = pricelast;
    }
}

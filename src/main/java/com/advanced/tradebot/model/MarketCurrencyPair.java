package com.advanced.tradebot.model;

import com.advanced.tradebot.model.enumeration.Market;

import javax.persistence.*;

@Entity
@Table(name = "market_currency_pair")
public class MarketCurrencyPair {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   @Column
   @Enumerated(EnumType.STRING)
    private Market market;

    @Column
    String currencyPair;

    public Long getId() {
        return id;
    }

//    public void setId(Long id) {
//        this.id = id;
//    }

    public Market getMarket() {
        return market;
    }

    public void setMarket(Market market) {
        this.market = market;
    }

    public String getCurrencyPair() {
        return currencyPair;
    }

    public void setCurrencyPair(String currencyPair) {
        this.currencyPair = currencyPair;
    }
}

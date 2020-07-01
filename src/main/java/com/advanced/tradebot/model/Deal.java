package com.advanced.tradebot.model;

import com.advanced.tradebot.model.enumeration.OrderStatus;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "deals")
public class Deal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    @ManyToOne
    @JoinColumn(name = "market_currency_pair_id")
    private MarketCurrencyPair marketCurrencyPair;

    @Column
    private BigDecimal numberOfItems;

    @Column
    private BigDecimal buyPrice;

    @Column
    private BigDecimal sellPrice;

    @Column
    private BigDecimal expectedIncome;

    @Column
    private BigDecimal actualIncome;

    @Column
    private Instant dateCreated;

    @Column
    private Instant dateUpdated;

    @Column
    private Instant dateCompleted;

    public Long getId() {
        return id;
    }

//    public void setId(Long id) {
//        this.id = id;
//    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public MarketCurrencyPair getMarketCurrencyPair() {
        return marketCurrencyPair;
    }

    public void setMarketCurrencyPair(MarketCurrencyPair marketCurrencyPair) {
        this.marketCurrencyPair = marketCurrencyPair;
    }

    public BigDecimal getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(BigDecimal numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public BigDecimal getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(BigDecimal buyPrice) {
        this.buyPrice = buyPrice;
    }

    public BigDecimal getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(BigDecimal sellPrice) {
        this.sellPrice = sellPrice;
    }

    public BigDecimal getExpectedIncome() {
        return expectedIncome;
    }

    public void setExpectedIncome(BigDecimal expectedIncome) {
        this.expectedIncome = expectedIncome;
    }

    public BigDecimal getActualIncome() {
        return actualIncome;
    }

    public void setActualIncome(BigDecimal actualIncome) {
        this.actualIncome = actualIncome;
    }

    public Instant getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Instant dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Instant getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Instant dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public Instant getDateCompleted() {
        return dateCompleted;
    }

    public void setDateCompleted(Instant dateCompleted) {
        this.dateCompleted = dateCompleted;
    }
}

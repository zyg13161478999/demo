package com.restructure.demo;

/**
 * @author .gang
 * 以函数取代参数 Replace Parameter with Query
 * 1.根据不同参数值作出不同的行为，那么就应该使用本项重构
 * 2.接口更加清楚
 * @date 2021/12/27
 */
public class ReplaceParameterWithQuery {
    private int quantity;
    private int itemPrice;
    private double seasonalDiscount;

    public ReplaceParameterWithQuery() {
        this.quantity = 10;
        this.itemPrice = 2;
        this.seasonalDiscount = 0.8;
    }

    public Double calcFinalPrice() {
        int basePrice = quantity * itemPrice;
        double seasonalDiscount = this.getSeasonalDiscount();
        double feesPrize = this.getFees();
        return discountedPrice(basePrice,seasonalDiscount,feesPrize);
    }

    private Double discountedPrice(int basePrice, double seasonalDiscount, double feesPrize) {
        return basePrice * seasonalDiscount * feesPrize;
    }

    private double getFees() {
        return 0.1 * quantity;
    }

    public double getSeasonalDiscount() {
        return seasonalDiscount;
    }
}

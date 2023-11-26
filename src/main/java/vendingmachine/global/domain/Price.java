package vendingmachine.global.domain;

public class Price {
    private final int price;

    private Price(int price) {
        this.price = price;
    }

    public static Price valueOf(int price) {
        return new Price(price);
    }
}

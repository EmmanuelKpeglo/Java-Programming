package com.company;

public abstract class Trade {

    private String ID;
    private String symbol;
    private int quantity;
    private double price;

    public Trade(String ID, String symbol, int quantity, double price) {
        this.ID = ID;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
    }

    public Trade(String ID, String symbol, int quantity) {
        this.ID = ID;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = 0.0;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
        else {
            this.price = 0.0;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public abstract double calcDividend();

    @Override
    public String toString() {
        return "Trade{" +
                "ID='" + ID + '\'' +
                ", symbol='" + symbol + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

}

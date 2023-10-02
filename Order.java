class Order {
    private int orderId;
    private String symbol;
    private int quantity;
    private double price;
    private OrderType type;

    public Order(int orderId, String symbol, int quantity, double price, OrderType type) {
        this.orderId = orderId;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
        this.type = type;
    }

    // Getters and setters here

    // Other methods, if needed
}

enum OrderType {
    BUY, SELL
}


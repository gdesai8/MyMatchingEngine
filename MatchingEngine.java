class MatchingEngine {
    // A matching engine may manage multiple order books for different symbols.
    // You can add more logic here to handle multiple order books.

    private OrderBook orderBook;

    public MatchingEngine() {
        this.orderBook = new OrderBook();
    }

    public void submitOrder(Order order) {
        orderBook.addOrder(order);
        orderBook.matchOrders();
    }

    // Other methods for managing order books, symbols, etc.
}
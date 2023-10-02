public class Main {
    public static void main(String[] args) {
        MatchingEngine matchingEngine = new MatchingEngine();

        // Example: Submit some buy and sell orders
        matchingEngine.submitOrder(new Order(1, "AAPL", 10, 150.0, OrderType.BUY));
        matchingEngine.submitOrder(new Order(2, "AAPL", 5, 155.0, OrderType.SELL));
        matchingEngine.submitOrder(new Order(3, "AAPL", 8, 160.0, OrderType.BUY));
        matchingEngine.submitOrder(new Order(4, "AAPL", 7, 157.0, OrderType.SELL));
    }
}
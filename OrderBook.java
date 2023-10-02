import java.util.PriorityQueue;
import java.util.Queue;

class OrderBook {
    private Queue<Order> buyOrders;
    private Queue<Order> sellOrders;

    public OrderBook() {
        // Initialize buy and sell order queues, use PriorityQueues for order matching.
        buyOrders = new PriorityQueue<>((o1, o2) -> Double.compare(o2.getPrice(), o1.getPrice()));
        sellOrders = new PriorityQueue<>((o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice()));
    }

    public void addOrder(Order order) {
        if (order.getType() == OrderType.BUY) {
            buyOrders.add(order);
        } else {
            sellOrders.add(order);
        }
    }

    public void matchOrders() {
        while (!buyOrders.isEmpty() && !sellOrders.isEmpty()) {
            Order buyOrder = buyOrders.peek();
            Order sellOrder = sellOrders.peek();

            if (buyOrder.getPrice() >= sellOrder.getPrice()) {
                int matchedQuantity = Math.min(buyOrder.getQuantity(), sellOrder.getQuantity());

                // Handle the trade, update order quantities, etc.
                // You can add more logic here depending on your requirements.

                buyOrder.setQuantity(buyOrder.getQuantity() - matchedQuantity);
                sellOrder.setQuantity(sellOrder.getQuantity() - matchedQuantity);

                if (buyOrder.getQuantity() == 0) {
                    buyOrders.poll();
                }

                if (sellOrder.getQuantity() == 0) {
                    sellOrders.poll();
                }
            } else {
                // No more matching can occur as buy price < sell price.
                break;
            }
        }
    }

    // Other methods to retrieve order book data or additional functionalities.
}
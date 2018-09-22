package commondmode2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fxd on 2018/9/22.
 */
public class Broker {
    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}

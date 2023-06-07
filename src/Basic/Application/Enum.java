package Basic.Application;

import Basic.Application.entities.Order;
import Basic.Application.entities.OrderStatus;

import java.util.Date;

public class Enum {
    public static void main(String[] args) {

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

    }
}

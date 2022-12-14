package deme.backend.springbootbackend.service;

import deme.backend.springbootbackend.model.OrderSession;

import java.util.List;

public interface OrderService {

    OrderSession saveOrderSession(OrderSession orderSession);
    List<OrderSession> getAllOrders();

    OrderSession getOrderByID(int id);

}

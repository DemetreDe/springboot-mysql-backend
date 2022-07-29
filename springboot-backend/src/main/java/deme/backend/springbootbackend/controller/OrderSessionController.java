package deme.backend.springbootbackend.controller;

import deme.backend.springbootbackend.model.OrderSession;
import deme.backend.springbootbackend.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
// Communicates with client
@RestController
@RequestMapping("/api/orders")
public class OrderSessionController {

    private OrderService orderService;

    public OrderSessionController(OrderService orderService) {
        super();
        this.orderService = orderService;
    }

    //POST

    @PostMapping()
    public ResponseEntity<OrderSession> saveOrder(@RequestBody OrderSession orderSession){
        return new ResponseEntity<OrderSession>(orderService.saveOrderSession(orderSession), HttpStatus.CREATED);
    }

    //GET
    @GetMapping
    public List<OrderSession> getAllOrders(){
        return orderService.getAllOrders();
    }

    @GetMapping("{id}")
    public ResponseEntity<OrderSession>  getEmployeeById(@PathVariable("id") int orderID){
        return new ResponseEntity<OrderSession>(orderService.getOrderByID(orderID), HttpStatus.OK);
    }
}

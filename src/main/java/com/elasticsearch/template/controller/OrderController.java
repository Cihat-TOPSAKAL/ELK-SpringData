package com.elasticsearch.template.controller;

import com.elasticsearch.template.component.OrderConverter;
import com.elasticsearch.template.dto.OrderDTO;
import com.elasticsearch.template.entity.Order;
import com.elasticsearch.template.service.Impl.OrderServiceImpl;
import com.elasticsearch.template.exception.ExceptionRunTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/mysql")
@RestController
public class OrderController {

    @Autowired
    OrderServiceImpl orderServiceImpl;

    @GetMapping("/")
    public ResponseEntity<List<OrderDTO>> getAllOrder(){

        List<OrderDTO> orderDTOS = orderServiceImpl.allOrder();
        return ResponseEntity.ok(orderDTOS);
    }

    @PostMapping("/")
    public ResponseEntity<OrderDTO> saveOrder(@RequestBody OrderDTO orderDTO){

        Order order = OrderConverter.toEntity(orderDTO);
        OrderDTO orderDto = orderServiceImpl.addOrder(order);
        return ResponseEntity.ok(orderDto);
    }

    @GetMapping("/{orderId}")
    public ResponseEntity<OrderDTO> findOrder(@PathVariable("orderId") int orderId){

        OrderDTO order = orderServiceImpl.findOrder(orderId);
        return ResponseEntity.ok(order);
    }
}

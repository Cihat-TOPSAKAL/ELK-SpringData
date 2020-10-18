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
        try {
            List<OrderDTO> orderDTOS = orderServiceImpl.allOrder();
            return ResponseEntity.ok(orderDTOS);
        }catch (Exception ex){
            throw new ExceptionRunTime(ex.getMessage());
        }
    }

    @PostMapping("/")
    public ResponseEntity<OrderDTO> saveOrder(@RequestBody OrderDTO orderDTO){
        try {
            Order order = OrderConverter.toEntity(orderDTO);
            OrderDTO orderDto = orderServiceImpl.addOrder(order);
            return ResponseEntity.ok(orderDto);
        }catch (Exception ex){
            throw new ExceptionRunTime(ex.getMessage());
        }
    }

    @GetMapping("/{orderId}")
    public ResponseEntity<List<OrderDTO>> findOrder(@PathVariable("orderId") int orderId){
        try{
            List<OrderDTO> order = orderServiceImpl.findOrder(orderId);
            return ResponseEntity.ok(order);
        }catch (Exception ex){
            throw new ExceptionRunTime(ex.getMessage());
        }
    }
}

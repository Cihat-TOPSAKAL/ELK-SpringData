package com.elasticsearch.template.controller;

import com.elasticsearch.template.component.ESOrderConverter;
import com.elasticsearch.template.dto.OrderDTO;
import com.elasticsearch.template.exception.ExceptionRunTime;
import com.elasticsearch.template.entity.ESOrder;
import com.elasticsearch.template.service.Impl.ESOrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/elk")
@RestController
public class ESOrderController {

    @Autowired
    ESOrderServiceImpl ESOrderServiceImpl;

    @GetMapping("/")
    public ResponseEntity<List<OrderDTO>> getAllOrder(){
        try {
            List<OrderDTO> orderDTOS = ESOrderServiceImpl.allOrder();
            return ResponseEntity.ok(orderDTOS);
        }catch (Exception ex){
            throw new ExceptionRunTime(ex.getMessage());
        }
    }

    @PostMapping("/")
    public ResponseEntity<OrderDTO> saveOrder(@RequestBody OrderDTO orderDTO){
        try {
            ESOrder ESOrder = ESOrderConverter.toEntity(orderDTO);
            OrderDTO orderDto = ESOrderServiceImpl.addOrder(ESOrder);
            return ResponseEntity.ok(orderDto);
        }catch (Exception ex){
            throw new ExceptionRunTime(ex.getMessage());
        }
    }

    /*@GetMapping("/{id}")
    public ResponseEntity<OrderDTO> findOrder(@PathVariable("id") String Id){
        try{
            OrderDTO order = elasticSerchOrderServiceImpl.findOrder(Id);
            return ResponseEntity.ok(order);
        }catch (Exception ex){
            throw new ExceptionRunTime(ex.getMessage());
        }
    }*/

    @GetMapping("/{orderTenderType}")
    public ResponseEntity<List<OrderDTO>> findOrderTenderType(@PathVariable("orderTenderType") int orderTenderType){
        try{
            List<OrderDTO> order = ESOrderServiceImpl.findByorderTenderType(orderTenderType);
            return ResponseEntity.ok(order);
        }catch (Exception ex){
            throw new ExceptionRunTime(ex.getMessage());
        }
    }

}

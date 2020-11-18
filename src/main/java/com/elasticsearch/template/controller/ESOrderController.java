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

    @GetMapping("/{Value}")
    public ResponseEntity<List<OrderDTO>> getSearchAutoComplate(@PathVariable("Value") String Value){
        try{
            List<OrderDTO> order = ESOrderServiceImpl.getSearchAutoComplate(Value);
            return ResponseEntity.ok(order);
        }catch (Exception ex){
            throw new ExceptionRunTime(ex.getMessage());
        }
    }

    @GetMapping("/date")
    public ResponseEntity<List<OrderDTO>> getDateTimeSearch(@RequestParam( value = "startDate",required = false) String startDate,
                                                            @RequestParam(value = "endDate",required = false) String endDate){
        try{
            List<OrderDTO> order = ESOrderServiceImpl.getDateTimeSearch(endDate,startDate);
            return ResponseEntity.ok(order);
        }catch (Exception ex){
            throw new ExceptionRunTime(ex.getMessage());
        }
    }

    @GetMapping("/filter")
    public ResponseEntity<List<OrderDTO>> getFilterSearch(@RequestParam( value = "filtername",required = false) String filterName,
                                                          @RequestParam(value = "value",required = false) String value){
        try{
            List<OrderDTO> order = ESOrderServiceImpl.getFilterSearch(filterName,value);
            return ResponseEntity.ok(order);
        }catch (Exception ex){
            throw new ExceptionRunTime(ex.getMessage());
        }
    }
}

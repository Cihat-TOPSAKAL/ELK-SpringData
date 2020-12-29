package com.elasticsearch.template.controller;

import com.elasticsearch.template.component.ESOrderConverter;
import com.elasticsearch.template.dto.OrderDTO;
import com.elasticsearch.template.entity.ESOrder;
import com.elasticsearch.template.service.Impl.ESOrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/elk")
@RestController
public class ESOrderController {

    @Autowired
    ESOrderServiceImpl ESOrderServiceImpl;

    @GetMapping("/")
    public ResponseEntity<List<OrderDTO>> getAllOrder(){
        List<OrderDTO> orderDTOS = ESOrderServiceImpl.allOrder();
        return ResponseEntity.ok(orderDTOS);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<OrderDTO> findById(@PathVariable("id") int Id){
        OrderDTO orderDTO = ESOrderServiceImpl.findOrder(Id);
        return ResponseEntity.ok(orderDTO);
    }

    @PostMapping("/")
    public ResponseEntity<OrderDTO> saveOrder(@RequestBody OrderDTO orderDTO){
        ESOrder ESOrder = ESOrderConverter.toEntity(orderDTO);
        OrderDTO orderDto = ESOrderServiceImpl.addOrder(ESOrder);
        return ResponseEntity.ok(orderDto);
    }

    @GetMapping("/{Value}")
    public ResponseEntity<List<OrderDTO>> getSearchAutoComplate(@PathVariable("Value") String Value){
        List<OrderDTO> order = ESOrderServiceImpl.getSearchAutoComplate(Value);
        return ResponseEntity.ok(order);
    }

    @GetMapping("/date")
    public ResponseEntity<List<OrderDTO>> getDateTimeSearch(@RequestParam( value = "startDate",required = false) String startDate,
                                                            @RequestParam(value = "endDate",required = false) String endDate){

        List<OrderDTO> order = ESOrderServiceImpl.getDateTimeSearch(endDate,startDate);
        return ResponseEntity.ok(order);
    }

    @GetMapping("/filter")
    public ResponseEntity<List<OrderDTO>> getFilterSearch(@RequestParam( value = "filtername",required = false) String filterName,
                                                          @RequestParam(value = "value",required = false) String value){

        List<OrderDTO> order = ESOrderServiceImpl.getFilterSearch(filterName,value);
        return ResponseEntity.ok(order);
    }

    @GetMapping("/pagination")
    public ResponseEntity<List<OrderDTO>> getPagination(@RequestParam(value = "pagesize", required = false) int pageSize){
        List<OrderDTO> order = ESOrderServiceImpl.getSearchPagination(pageSize);
        return ResponseEntity.ok(order);
    }
}

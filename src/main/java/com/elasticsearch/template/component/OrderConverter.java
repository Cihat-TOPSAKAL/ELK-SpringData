package com.elasticsearch.template.component;

import com.elasticsearch.template.dto.OrderDTO;
import com.elasticsearch.template.entity.Order;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class OrderConverter {

    public static OrderDTO toDTO(Order order){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(order,OrderDTO.class);
    }

    public static Order toEntity(OrderDTO orderDTO){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(orderDTO, Order.class);
    }
}

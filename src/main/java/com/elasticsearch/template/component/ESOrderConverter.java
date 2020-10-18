package com.elasticsearch.template.component;

import com.elasticsearch.template.dto.OrderDTO;
import com.elasticsearch.template.entity.ESOrder;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ESOrderConverter {

    public static OrderDTO toDTO(ESOrder ESOrder){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(ESOrder,OrderDTO.class);
    }

    public static ESOrder toEntity(OrderDTO orderDTO){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(orderDTO, ESOrder.class);
    }
}

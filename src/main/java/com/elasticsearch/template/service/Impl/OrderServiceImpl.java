package com.elasticsearch.template.service.Impl;

import com.elasticsearch.template.component.OrderConverter;
import com.elasticsearch.template.dto.OrderDTO;
import com.elasticsearch.template.entity.Order;
import com.elasticsearch.template.repository.OrderRepository;
import com.elasticsearch.template.service.OrderService;
import com.elasticsearch.template.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderRepository orderRepository;

    public OrderDTO addOrder(Order order){
        order.setOrderTime(DateUtil.DateFormatter());
        Order saveOrder = orderRepository.save(order);
        return OrderConverter.toDTO(saveOrder);
    }

    @Override
    public List<OrderDTO> allOrder(){
        List<Order> order = orderRepository.findAll();
        return order.stream().map(OrderConverter::toDTO).collect(Collectors.toList());
    }

    @Override
    public List<OrderDTO> findOrder(int OrderId){
        List<Order> order = orderRepository.findByorderId(OrderId);
        return order.stream().map(OrderConverter::toDTO).collect(Collectors.toList());
    }
}

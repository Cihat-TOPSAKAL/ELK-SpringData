package com.elasticsearch.template.service;

import com.elasticsearch.template.dto.OrderDTO;

import java.util.List;

public interface OrderService {
    public List<OrderDTO> allOrder();
    public OrderDTO findOrder(int OrderId);
}

package com.elasticsearch.template.repository;

import com.elasticsearch.template.entity.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<Order,Integer> {
    @Override
    List<Order> findAll();

    List<Order> findByorderId(int Id);
}

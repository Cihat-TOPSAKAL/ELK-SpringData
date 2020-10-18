package com.elasticsearch.template.repository;

import com.elasticsearch.template.entity.ESOrder;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface ESOrderRepository extends ElasticsearchRepository<ESOrder,Integer> {
    @Override
    List<ESOrder> findAll();

    List<ESOrder> findByorderTenderType(int tenderType);

    List<ESOrder> findByorderId(int orderId);
}

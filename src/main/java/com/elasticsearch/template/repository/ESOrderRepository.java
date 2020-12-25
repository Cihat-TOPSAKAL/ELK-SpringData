package com.elasticsearch.template.repository;

import com.elasticsearch.template.entity.ESOrder;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface ESOrderRepository extends ElasticsearchRepository<ESOrder, Integer> {
    @Override
    List<ESOrder> findAll();

    ESOrder findByorderId(int orderId);

    // Search for both name and surname
    @Query("{\n" +
            "    \"multi_match\":{\n" +
            "        \"fields\":[\"orderedByName\",\"orderedBySurname\"],\n" +
            "        \"query\":\"?0\",\n" +
            "        \"type\":\"phrase_prefix\"\n" +
            "    }\n" +
            "}")
    List<ESOrder> getSearchAutoComplate(String value);

    // Search for endDate - startDate
    @Query("{\n" +
            "     \"range\": {\n" +
            "      \"orderTime\": {\n" +
            "        \"gte\": \"?1\",\n" +
            "        \"lte\": \"?0\"\n" +
            "      }\n" +
            "    }\n" +
            "} ")
    List<ESOrder> getDateTimeSearch(String endDate, String startDate);


    @Query(" {\n" +
            "     \"term\": {\n" +
            "      \"?0\": {\n" +
            "        \"value\": \"?1\",\n" +
            "        \"boost\": \"1\"\n" +
            "      }\n" +
            "    }\n" +
            " }")
    List<ESOrder> getFilterSearch(String filterName, String value);

    @Query("{\n" +
            " \"match_all\": {},\n" +
            " \"sort\": [\n" +
            " {\n" +
            " \"orderedByName\": \"desc\"\n" +
            " }\n" +
            " ],\n" +
            " \"size\": ?0\n" +
            " }")
    List<ESOrder> getPaginationSearch(int pageSize);
}

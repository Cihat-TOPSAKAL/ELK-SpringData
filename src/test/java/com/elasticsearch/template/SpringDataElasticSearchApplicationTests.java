package com.elasticsearch.template;

import com.elasticsearch.template.entity.ESOrder;
import com.elasticsearch.template.entity.Order;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class SpringDataElasticSearchApplicationTests {
	@Autowired
	RestTemplate restTemplate;
	private String location = "http://localhost:8090/";

	@Test
	void elasticSearchSaveOrderTest() {
		ESOrder ESOrder = new ESOrder();
		ESOrder.setOrderId(123458);
		ESOrder.setOrderPayment("Nakit");
		ESOrder.setOrderTenderType(0);
		ESOrder.setOrderType("eat_in");
		ResponseEntity<ESOrder> reponse = restTemplate.postForEntity(location+"/elk/", ESOrder, ESOrder.class);
		ESOrder ESOrder1 = restTemplate.getForObject(location+"/elk/123458", ESOrder.class);
		MatcherAssert.assertThat(ESOrder.getOrderId(), Matchers.equalTo(ESOrder1.getOrderId()));
	}

	@Test
	void mysqlSearchSaveOrderTest() {
		Order order = new Order();
		order.setOrderId(123458);
		order.setOrderPayment("Nakit");
		order.setOrderTenderType(0);
		order.setOrderType("eat_in");
		ResponseEntity<ESOrder> reponse = restTemplate.postForEntity(location+"/elk/", order, ESOrder.class);
		ESOrder mysqlOrder1 = restTemplate.getForObject(location+"/elk/123458", ESOrder.class);
		MatcherAssert.assertThat(order.getOrderId(), Matchers.equalTo(mysqlOrder1.getOrderId()));
	}
}

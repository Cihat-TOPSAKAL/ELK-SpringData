DROP TABLE IF EXISTS `mysql_order`;

CREATE TABLE `mysql_order` (
  `order_id` int NOT NULL AUTO_INCREMENT,
  `order_payment` varchar(255) DEFAULT NULL,
  `order_tender_type` int DEFAULT NULL,
  `order_time` varchar(255) DEFAULT NULL,
  `order_type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4
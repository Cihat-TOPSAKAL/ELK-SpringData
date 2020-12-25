DROP TABLE IF EXISTS `order`;

CREATE TABLE `order` (
  `order_id` int NOT NULL AUTO_INCREMENT,
  `order_key` varchar(255) DEFAULT NULL,
  `order_payment` varchar(255) DEFAULT NULL,
  `order_time` varchar(255) DEFAULT NULL,
  `ordered_by_address` varchar(255) DEFAULT NULL,
  `ordered_by_email` varchar(255) DEFAULT NULL,
  `ordered_by_name` varchar(255) DEFAULT NULL,
  `ordered_by_phone_number` varchar(255) DEFAULT NULL,
  `ordered_by_surname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4
DROP TABLE IF EXISTS `mysql_order`;

CREATE TABLE `mysql_order` (
  `orderId` varchar(255) NOT NULL AUTO_INCREMENT,
  `orderPayment` varchar(255) DEFAULT NULL,
  `orderTime` varchar(255) DEFAULT NULL,
  `orderedByName` varchar(255) DEFAULT NULL,
  `orderedBySurname` varchar(255) DEFAULT NULL,
  `orderedByAddress` varchar(255) DEFAULT NULL,
  `orderedByPhoneNumber` varchar(255) DEFAULT NULL,
  `orderedByEmail` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4
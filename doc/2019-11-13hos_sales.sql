/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50637
Source Host           : localhost:3306
Source Database       : drugs

Target Server Type    : MYSQL
Target Server Version : 50637
File Encoding         : 65001

Date: 2019-11-13 15:39:41
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for hos_sales
-- ----------------------------
DROP TABLE IF EXISTS `hos_sales`;
CREATE TABLE `hos_sales` (
  `salesmanId` int(11) NOT NULL,
  `hospitalId` int(11) NOT NULL,
  PRIMARY KEY (`salesmanId`,`hospitalId`),
  KEY `hospitalId` (`hospitalId`),
  CONSTRAINT `hos_sales_ibfk_1` FOREIGN KEY (`salesmanId`) REFERENCES `salesman` (`id`),
  CONSTRAINT `hos_sales_ibfk_2` FOREIGN KEY (`hospitalId`) REFERENCES `hospital` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hos_sales
-- ----------------------------
INSERT INTO `hos_sales` VALUES ('1', '1');
INSERT INTO `hos_sales` VALUES ('1', '2');

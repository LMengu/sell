/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50637
Source Host           : 127.0.0.1:3306
Source Database       : drugs

Target Server Type    : MYSQL
Target Server Version : 50637
File Encoding         : 65001

Date: 2019-11-15 17:30:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for hospital
-- ----------------------------
DROP TABLE IF EXISTS `hospital`;
CREATE TABLE `hospital` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '医院ID',
  `hospitalName` varchar(255) NOT NULL COMMENT '医院名称',
  `hospitalAddress` varchar(255) NOT NULL COMMENT '医院地址',
  `hospitalPhone` varchar(255) NOT NULL COMMENT '医院的联系方式',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hospital
-- ----------------------------
INSERT INTO `hospital` VALUES ('1', '西京医院', '陕西西安', '15836749023');
INSERT INTO `hospital` VALUES ('2', '航天医院', '北京昌平', '15924048759');
INSERT INTO `hospital` VALUES ('3', '北京医院', '北京海淀', '15868745213');
INSERT INTO `hospital` VALUES ('4', '唐都医院', '西安灞桥', '13854678542');
INSERT INTO `hospital` VALUES ('5', '尘封医院', '山西大同', '18435925475');

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
INSERT INTO `hos_sales` VALUES ('1', '3');

-- ----------------------------
-- Table structure for medinformation
-- ----------------------------
DROP TABLE IF EXISTS `medinformation`;
CREATE TABLE `medinformation` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '药品信息编号',
  `medName` varchar(255) NOT NULL COMMENT '药品名称',
  `productionDate` datetime NOT NULL COMMENT '生产日期',
  `shelfLife` varchar(255) NOT NULL COMMENT '保质期',
  `speciality` varchar(255) NOT NULL COMMENT '特性',
  `price` double(10,0) NOT NULL COMMENT '价格',
  `repertory` int(11) DEFAULT NULL COMMENT '库存',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of medinformation
-- ----------------------------
INSERT INTO `medinformation` VALUES ('1', '六味地黄丸', '2019-10-10 09:44:51', '5年', '滋阴补肾', '268', '500');
INSERT INTO `medinformation` VALUES ('2', '阿胶', '2019-10-30 09:47:20', '3年', '补血养气', '68', '1000');
INSERT INTO `medinformation` VALUES ('3', '藿香正气液', '2019-10-15 09:55:15', '3年', '用于外感风寒', '30', '1500');
INSERT INTO `medinformation` VALUES ('4', '金银花', '2019-10-01 09:57:15', '2年', '清热解毒', '50', '2000');

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '订单ID',
  `drugsName` varchar(255) DEFAULT NULL COMMENT '药品名称',
  `drugsSpeciality` varchar(255) DEFAULT NULL COMMENT '药品特效',
  `drugsPrice` double(20,0) DEFAULT NULL COMMENT '药品价格',
  `drugsNumber` int(11) DEFAULT NULL COMMENT '药品数量',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES ('1', '六味地黄丸', '滋阴补肾', '268', '2');
INSERT INTO `orders` VALUES ('2', '藿香正气液', '用于外感风寒', '30', '3');
INSERT INTO `orders` VALUES ('3', '感冒灵颗粒', '用于感冒降温', '10', '20');
INSERT INTO `orders` VALUES ('4', '肾宝片', '调和阴阳', '50', '10');

-- ----------------------------
-- Table structure for orders_hos
-- ----------------------------
DROP TABLE IF EXISTS `orders_hos`;
CREATE TABLE `orders_hos` (
  `ordersId` int(11) NOT NULL,
  `hospitalId` int(11) NOT NULL,
  PRIMARY KEY (`ordersId`,`hospitalId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orders_hos
-- ----------------------------
INSERT INTO `orders_hos` VALUES ('1', '2');
INSERT INTO `orders_hos` VALUES ('3', '1');
INSERT INTO `orders_hos` VALUES ('4', '2');
INSERT INTO `orders_hos` VALUES ('4', '3');

-- ----------------------------
-- Table structure for patient
-- ----------------------------
DROP TABLE IF EXISTS `patient`;
CREATE TABLE `patient` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '患者ID',
  `patientName` varchar(50) DEFAULT NULL COMMENT '患者名字',
  `patientSex` varchar(50) DEFAULT NULL COMMENT '患者性别',
  `patientAge` int(11) DEFAULT NULL COMMENT '患者年龄',
  `patientAddress` varchar(50) DEFAULT NULL COMMENT '患者地址',
  `patientCase` varchar(50) DEFAULT NULL COMMENT '患者病历',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of patient
-- ----------------------------
INSERT INTO `patient` VALUES ('1', '宋江', '男', '35', '山东郓城', '感冒');
INSERT INTO `patient` VALUES ('2', '扈三娘', '女', '20', '江苏徐州', '气血不足');
INSERT INTO `patient` VALUES ('3', '王庆帅', '男', '22', '山西翼城', '青春痘肾虚湿热');
INSERT INTO `patient` VALUES ('4', '小玉', '女', '22', '山西侯马', '感冒');
INSERT INTO `patient` VALUES ('5', '张凡', '男', '20', '陕西渭南', '青春痘');

-- ----------------------------
-- Table structure for pat_hos
-- ----------------------------
DROP TABLE IF EXISTS `pat_hos`;
CREATE TABLE `pat_hos` (
  `patientId` int(11) NOT NULL,
  `hospitalId` int(11) NOT NULL,
  PRIMARY KEY (`patientId`,`hospitalId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pat_hos
-- ----------------------------
INSERT INTO `pat_hos` VALUES ('1', '1');
INSERT INTO `pat_hos` VALUES ('2', '1');
INSERT INTO `pat_hos` VALUES ('3', '2');
INSERT INTO `pat_hos` VALUES ('4', '4');
INSERT INTO `pat_hos` VALUES ('4', '5');
INSERT INTO `pat_hos` VALUES ('5', '2');
INSERT INTO `pat_hos` VALUES ('5', '4');

-- ----------------------------
-- Table structure for permission
-- ----------------------------
DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `permissionName` varchar(50) DEFAULT NULL,
  `url` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of permission
-- ----------------------------
INSERT INTO `permission` VALUES ('1', 'user findAll', '/user/findAll.do');
INSERT INTO `permission` VALUES ('2', 'user findById', '/user/findById.do');
INSERT INTO `permission` VALUES ('3', 'role findAll', '/role/findAll');

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `roleName` varchar(50) DEFAULT NULL,
  `roleDesc` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', 'ADMIN', 'VIP');
INSERT INTO `role` VALUES ('2', 'FOX', 'VIP');
INSERT INTO `role` VALUES ('3', 'aaa', 'VIP');

-- ----------------------------
-- Table structure for role_permission
-- ----------------------------
DROP TABLE IF EXISTS `role_permission`;
CREATE TABLE `role_permission` (
  `permissionId` int(11) NOT NULL DEFAULT '0',
  `roleId` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`permissionId`,`roleId`),
  KEY `roleId` (`roleId`),
  CONSTRAINT `role_permission_ibfk_1` FOREIGN KEY (`roleId`) REFERENCES `role` (`id`),
  CONSTRAINT `role_permission_ibfk_2` FOREIGN KEY (`permissionId`) REFERENCES `permission` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role_permission
-- ----------------------------
INSERT INTO `role_permission` VALUES ('1', '1');
INSERT INTO `role_permission` VALUES ('2', '1');
INSERT INTO `role_permission` VALUES ('3', '1');

-- ----------------------------
-- Table structure for salesman
-- ----------------------------
DROP TABLE IF EXISTS `salesman`;
CREATE TABLE `salesman` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '销售员ID',
  `salesmanName` varchar(50) DEFAULT NULL COMMENT '销售名字',
  `salesmanSex` varchar(50) DEFAULT NULL,
  `salesmanAge` int(11) DEFAULT NULL COMMENT '销售员年龄',
  `salesmanAddress` varchar(50) DEFAULT NULL COMMENT '销售员地址',
  `salesmanPhone` varchar(50) DEFAULT NULL COMMENT '销售员的联系方式',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of salesman
-- ----------------------------
INSERT INTO `salesman` VALUES ('1', '张三', '男', '20', '山西运城', '13678490985');
INSERT INTO `salesman` VALUES ('2', '李四', '男', '25', '河北石家庄', '13827598747');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `contact` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `power` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', 'tom', '$2a$10$rfv1lSNuixakbuw/3qslCOKX.2tw/0yd.wae4QYJ1zUsNg.b8Lcqu', '13643653012', '山西省', '1');
INSERT INTO `users` VALUES ('2', 'can', '$2a$10$5L02Wk.Ub6jvWvnCz1MICus96CrNOK5JLBwhEKVXbPS/.O6wqYSRW', '15034599322', '贵州省', '1');
INSERT INTO `users` VALUES ('3', 'fox', '$2a$10$fYeP6kLcFzUl5H41RbvU1uD16Mbo0NTlmFuVeb1eg5u4aJg.vRYji', null, '山西运城', '0');
INSERT INTO `users` VALUES ('4', 'king', '$2a$10$E1fFk3QzTnagviJM8yw.Y.y/8Zp3Rar1Dx4iUEseENpBgB3yyuWXm', null, '陕西西安', '0');
INSERT INTO `users` VALUES ('5', 'zf', '$2a$10$tRjmsjAs8EO.KqMO4C2FmOx35dNYhQVEVwNnqwMZ4UzP63oBZloYW', '159789456123', '陕西西安', '1');
INSERT INTO `users` VALUES ('6', 'guo', '$2a$10$rM0r8BvKlENq9gEmrWr9ZuiqevkMInRN/ipZi7vkVymPrzCwZYBoK', '18435925472', '山西运城', '1');

-- ----------------------------
-- Table structure for users_role
-- ----------------------------
DROP TABLE IF EXISTS `users_role`;
CREATE TABLE `users_role` (
  `userId` int(11) NOT NULL DEFAULT '0',
  `roleId` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`userId`,`roleId`),
  KEY `roleId` (`roleId`),
  CONSTRAINT `users_role_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `users` (`id`),
  CONSTRAINT `users_role_ibfk_2` FOREIGN KEY (`roleId`) REFERENCES `role` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users_role
-- ----------------------------
INSERT INTO `users_role` VALUES ('1', '1');
INSERT INTO `users_role` VALUES ('1', '2');

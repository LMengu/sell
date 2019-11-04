/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50637
Source Host           : localhost:3306
Source Database       : drugs

Target Server Type    : MYSQL
Target Server Version : 50637
File Encoding         : 65001

Date: 2019-11-04 14:05:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for hospital
-- ----------------------------
DROP TABLE IF EXISTS `hospital`;
CREATE TABLE `hospital` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '医院编号',
  `hospital_name` varchar(255) NOT NULL COMMENT '医院名称',
  `hospital_address` varchar(255) NOT NULL COMMENT '医院地址',
  `contace_information` varchar(255) NOT NULL COMMENT '联系方式',
  `sales_person_id` int(11) NOT NULL COMMENT '销售商id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of hospital
-- ----------------------------
INSERT INTO `hospital` VALUES ('1', '唐都医院', '陕西西安', '13992952762', '1');
INSERT INTO `hospital` VALUES ('2', '西京医院', '陕西西安', '15036487521', '2');

-- ----------------------------
-- Table structure for hospital_med_inventory
-- ----------------------------
DROP TABLE IF EXISTS `hospital_med_inventory`;
CREATE TABLE `hospital_med_inventory` (
  `id` int(11) NOT NULL COMMENT '医院药品库存编号',
  `med_price_id` int(11) NOT NULL COMMENT '药品价格id',
  `med_inventory` varchar(255) NOT NULL COMMENT '药品库存',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of hospital_med_inventory
-- ----------------------------
INSERT INTO `hospital_med_inventory` VALUES ('1', '1', '300');
INSERT INTO `hospital_med_inventory` VALUES ('2', '2', '800');
INSERT INTO `hospital_med_inventory` VALUES ('3', '3', '500');

-- ----------------------------
-- Table structure for med_information
-- ----------------------------
DROP TABLE IF EXISTS `med_information`;
CREATE TABLE `med_information` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '药品信息编号',
  `med_name` varchar(255) NOT NULL COMMENT '药品名称',
  `production_date` datetime NOT NULL COMMENT '生产日期',
  `shelf_life` varchar(255) NOT NULL COMMENT '保质期',
  `speciality` varchar(255) NOT NULL COMMENT '特性',
  `price` double(10,0) NOT NULL COMMENT '价格',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of med_information
-- ----------------------------
INSERT INTO `med_information` VALUES ('1', '六味地黄丸', '2019-10-10 09:44:51', '5年', '滋阴补肾', '268');
INSERT INTO `med_information` VALUES ('2', '阿胶', '2019-10-30 09:47:20', '3年', '补血养气', '68');
INSERT INTO `med_information` VALUES ('3', '藿香正气液', '2019-10-15 09:55:15', '3年', '用于外感风寒', '30');
INSERT INTO `med_information` VALUES ('4', '金银花', '2019-10-01 09:57:15', '2年', '清热解毒', '50');

-- ----------------------------
-- Table structure for med_inventory
-- ----------------------------
DROP TABLE IF EXISTS `med_inventory`;
CREATE TABLE `med_inventory` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '药品库存编号',
  `med_information_id` int(11) NOT NULL COMMENT '药品信息id',
  `num` int(11) NOT NULL COMMENT '数量',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of med_inventory
-- ----------------------------
INSERT INTO `med_inventory` VALUES ('1', '1', '300');
INSERT INTO `med_inventory` VALUES ('2', '2', '800');
INSERT INTO `med_inventory` VALUES ('3', '3', '1000');
INSERT INTO `med_inventory` VALUES ('4', '4', '500');

-- ----------------------------
-- Table structure for med_price
-- ----------------------------
DROP TABLE IF EXISTS `med_price`;
CREATE TABLE `med_price` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '药品价格编号',
  `hospital_id` int(11) NOT NULL COMMENT '医院编号',
  `med_information_id` int(11) NOT NULL COMMENT '药品编号',
  `med_price` double(10,0) NOT NULL COMMENT '药品价格',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of med_price
-- ----------------------------
INSERT INTO `med_price` VALUES ('1', '1', '1', '268');
INSERT INTO `med_price` VALUES ('2', '2', '2', '68');
INSERT INTO `med_price` VALUES ('3', '2', '4', '50');

-- ----------------------------
-- Table structure for patient
-- ----------------------------
DROP TABLE IF EXISTS `patient`;
CREATE TABLE `patient` (
  `id` int(11) NOT NULL COMMENT '病人编号',
  `hospital_id` int(11) NOT NULL COMMENT '医院编号',
  `patient_information_id` int(11) NOT NULL COMMENT '病人信息编号',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of patient
-- ----------------------------
INSERT INTO `patient` VALUES ('1', '1', '1');
INSERT INTO `patient` VALUES ('2', '1', '2');
INSERT INTO `patient` VALUES ('3', '2', '3');
INSERT INTO `patient` VALUES ('4', '2', '4');

-- ----------------------------
-- Table structure for patient_information
-- ----------------------------
DROP TABLE IF EXISTS `patient_information`;
CREATE TABLE `patient_information` (
  `id` int(11) NOT NULL COMMENT '病人信息编号',
  `patient_name` varchar(255) NOT NULL COMMENT '病人姓名',
  `patient_sex` varchar(255) NOT NULL COMMENT '病人性别',
  `patient_age` int(11) NOT NULL COMMENT '病人年龄',
  `patient_contact_information` varchar(255) NOT NULL COMMENT '病人联系方式',
  `patient_illness` varchar(255) NOT NULL COMMENT '患病信息',
  `buy_med_information` varchar(255) NOT NULL COMMENT '购药信息',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of patient_information
-- ----------------------------
INSERT INTO `patient_information` VALUES ('1', '宋江', '男', '35', '15065482657', '感冒', '藿香正气液');
INSERT INTO `patient_information` VALUES ('2', '扈三娘', '女', '25', '13856742594', '气血不足', '阿胶');

-- ----------------------------
-- Table structure for permission
-- ----------------------------
DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `permissionName` varchar(50) DEFAULT NULL,
  `url` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of permission
-- ----------------------------
INSERT INTO `permission` VALUES ('1', 'user findAll', '/user/findAll.do');

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `roleName` varchar(50) DEFAULT NULL,
  `roleDesc` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', 'ADMIN', 'VIP');

-- ----------------------------
-- Table structure for role_permission
-- ----------------------------
DROP TABLE IF EXISTS `role_permission`;
CREATE TABLE `role_permission` (
  `permissionId` int(11) NOT NULL DEFAULT '0',
  `roleId` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`permissionId`,`roleId`) USING BTREE,
  KEY `roleId` (`roleId`) USING BTREE,
  CONSTRAINT `role_permission_ibfk_1` FOREIGN KEY (`roleId`) REFERENCES `role` (`id`),
  CONSTRAINT `role_permission_ibfk_2` FOREIGN KEY (`permissionId`) REFERENCES `permission` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of role_permission
-- ----------------------------
INSERT INTO `role_permission` VALUES ('1', '1');

-- ----------------------------
-- Table structure for sales_person
-- ----------------------------
DROP TABLE IF EXISTS `sales_person`;
CREATE TABLE `sales_person` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `salesperson_name` varchar(255) NOT NULL COMMENT '销售员名称',
  `contact_information` varchar(255) NOT NULL COMMENT '联系方式',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of sales_person
-- ----------------------------
INSERT INTO `sales_person` VALUES ('1', '郭俊杰', '15035789625');
INSERT INTO `sales_person` VALUES ('2', '郭晨礡', '18654896235');
INSERT INTO `sales_person` VALUES ('3', '张凡', '12256454794');

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
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', 'tom', '123456', '12312434325', '山西', '1');

-- ----------------------------
-- Table structure for users_role
-- ----------------------------
DROP TABLE IF EXISTS `users_role`;
CREATE TABLE `users_role` (
  `userId` int(11) NOT NULL DEFAULT '0',
  `roleId` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`userId`,`roleId`) USING BTREE,
  KEY `roleId` (`roleId`) USING BTREE,
  CONSTRAINT `users_role_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `users` (`id`),
  CONSTRAINT `users_role_ibfk_2` FOREIGN KEY (`roleId`) REFERENCES `role` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of users_role
-- ----------------------------
INSERT INTO `users_role` VALUES ('1', '1');

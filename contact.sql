/*
MySQL Data Transfer
Source Host: localhost
Source Database: vf
Target Host: localhost
Target Database: vf
Date: 2014/2/17 13:52:07
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for contact
-- ----------------------------
CREATE TABLE `contact` (
  `ID` varchar(36) NOT NULL DEFAULT '',
  `NAME` varchar(100) DEFAULT NULL,
  `SEX` smallint(6) DEFAULT NULL,
  `AGE` smallint(6) DEFAULT NULL,
  `TEL` varchar(20) DEFAULT NULL,
  `COMMENT` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `contact` VALUES ('40288059443dd5f401443dd6d11a0002', 'XXXX', '11', '26', '010-27364237', 'Hello！');
INSERT INTO `contact` VALUES ('40288059443dd5f401443dd6ec210003', 'XXXX', '11', '26', '010-27364237', 'Hello！');

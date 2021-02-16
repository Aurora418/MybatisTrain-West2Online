/*
 Navicat MySQL Data Transfer

 Source Server         : MySql
 Source Server Type    : MySQL
 Source Server Version : 80023
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 80023
 File Encoding         : 65001

 Date: 16/02/2021 15:44:50
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for students
-- ----------------------------
DROP TABLE IF EXISTS `students`;
CREATE TABLE `students`  (
  `Snum` varchar(9) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Sname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Ssex` enum('男','女') CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Tname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Sclass` int NOT NULL,
  PRIMARY KEY (`Snum`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of students
-- ----------------------------
INSERT INTO `students` VALUES ('221801218', 'Ruby', '女', 'Need', 2);
INSERT INTO `students` VALUES ('221801312', '吕庆炜', '男', 'Jody', 3);
INSERT INTO `students` VALUES ('221801314', '林炜', '男', 'Lily', 3);
INSERT INTO `students` VALUES ('221801315', 'Diana', '女', 'Tony', 3);
INSERT INTO `students` VALUES ('221801449', 'Tony', '男', 'Tube', 4);

SET FOREIGN_KEY_CHECKS = 1;

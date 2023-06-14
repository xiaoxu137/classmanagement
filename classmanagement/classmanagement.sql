/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 100414
 Source Host           : localhost:3306
 Source Schema         : classmanagement

 Target Server Type    : MySQL
 Target Server Version : 100414
 File Encoding         : 65001

 Date: 14/06/2023 18:02:25
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for login_info
-- ----------------------------
DROP TABLE IF EXISTS `login_info`;
CREATE TABLE `login_info`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `status` int(11) NOT NULL,
  `desc` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`, `code`) USING BTREE,
  UNIQUE INDEX `code`(`code`) USING BTREE,
  INDEX `logsta`(`status`) USING BTREE,
  CONSTRAINT `logsta` FOREIGN KEY (`status`) REFERENCES `login_status` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 20 CHARACTER SET = sjis COLLATE = sjis_japanese_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of login_info
-- ----------------------------
INSERT INTO `login_info` VALUES (1, '20030001', '111', 1, NULL);
INSERT INTO `login_info` VALUES (2, '20030002', '111', 1, NULL);
INSERT INTO `login_info` VALUES (3, '20030003', '111', 1, NULL);
INSERT INTO `login_info` VALUES (4, '20030004', '111', 1, NULL);
INSERT INTO `login_info` VALUES (5, '20030005', '111', 1, NULL);
INSERT INTO `login_info` VALUES (6, '20030006', '111', 1, NULL);
INSERT INTO `login_info` VALUES (7, '20030007', '111', 1, NULL);
INSERT INTO `login_info` VALUES (8, '20030008', '111', 1, NULL);
INSERT INTO `login_info` VALUES (9, '20030009', '111', 1, NULL);
INSERT INTO `login_info` VALUES (10, '20030010', '111', 1, NULL);
INSERT INTO `login_info` VALUES (11, '20030011', '111', 1, NULL);
INSERT INTO `login_info` VALUES (12, '20030012', '111', 1, NULL);
INSERT INTO `login_info` VALUES (13, '20030013', '111', 0, NULL);
INSERT INTO `login_info` VALUES (14, '20030014', '111', 0, NULL);
INSERT INTO `login_info` VALUES (15, '20030015', '111', 0, NULL);
INSERT INTO `login_info` VALUES (16, '20030016', '111', 0, NULL);
INSERT INTO `login_info` VALUES (17, '20030017', '111', 0, NULL);
INSERT INTO `login_info` VALUES (18, '20030018', '111', 0, NULL);
INSERT INTO `login_info` VALUES (19, '20030019', '111', 0, NULL);

-- ----------------------------
-- Table structure for login_status
-- ----------------------------
DROP TABLE IF EXISTS `login_status`;
CREATE TABLE `login_status`  (
  `id` int(11) NOT NULL,
  `statusdesc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of login_status
-- ----------------------------
INSERT INTO `login_status` VALUES (0, '冻结', NULL);
INSERT INTO `login_status` VALUES (1, '正常', NULL);

-- ----------------------------
-- Table structure for position
-- ----------------------------
DROP TABLE IF EXISTS `position`;
CREATE TABLE `position`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `posdesc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = sjis COLLATE = sjis_japanese_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of position
-- ----------------------------
INSERT INTO `position` VALUES (1, '班主任', NULL);
INSERT INTO `position` VALUES (2, '班长', NULL);
INSERT INTO `position` VALUES (3, '班委', NULL);
INSERT INTO `position` VALUES (4, '学生', NULL);

-- ----------------------------
-- Table structure for stu_gender
-- ----------------------------
DROP TABLE IF EXISTS `stu_gender`;
CREATE TABLE `stu_gender`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gender` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '男',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of stu_gender
-- ----------------------------
INSERT INTO `stu_gender` VALUES (1, '男');
INSERT INTO `stu_gender` VALUES (2, '女');

-- ----------------------------
-- Table structure for student_fra
-- ----------------------------
DROP TABLE IF EXISTS `student_fra`;
CREATE TABLE `student_fra`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `fra` int(255) NOT NULL,
  `desc` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`, `code`) USING BTREE,
  INDEX `frainf`(`code`) USING BTREE,
  CONSTRAINT `frainf` FOREIGN KEY (`code`) REFERENCES `student_info` (`code`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = sjis COLLATE = sjis_japanese_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student_fra
-- ----------------------------
INSERT INTO `student_fra` VALUES (1, '20030001', 90, NULL);
INSERT INTO `student_fra` VALUES (2, '20030002', 100, NULL);
INSERT INTO `student_fra` VALUES (4, '20030004', 100, NULL);
INSERT INTO `student_fra` VALUES (5, '20030005', 100, NULL);
INSERT INTO `student_fra` VALUES (6, '20030006', 100, NULL);
INSERT INTO `student_fra` VALUES (7, '20030007', 75, NULL);
INSERT INTO `student_fra` VALUES (8, '20030008', 95, NULL);
INSERT INTO `student_fra` VALUES (9, '20030009', 100, NULL);
INSERT INTO `student_fra` VALUES (10, '20030010', 100, NULL);
INSERT INTO `student_fra` VALUES (11, '20030011', 100, NULL);
INSERT INTO `student_fra` VALUES (12, '20030012', 100, NULL);

-- ----------------------------
-- Table structure for student_grad
-- ----------------------------
DROP TABLE IF EXISTS `student_grad`;
CREATE TABLE `student_grad`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `subject1` float NULL DEFAULT 0,
  `subject2` float NULL DEFAULT 0,
  `subject3` float NULL DEFAULT 0,
  `subject4` float NULL DEFAULT 0,
  `subject5` float NULL DEFAULT 0,
  `subject6` float NULL DEFAULT 0,
  `subject7` float NULL DEFAULT 0,
  `subject8` float NULL DEFAULT 0,
  `subject9` float NULL DEFAULT 0,
  `date` date NOT NULL,
  `desc` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `gradstu`(`code`) USING BTREE,
  CONSTRAINT `gradstu` FOREIGN KEY (`code`) REFERENCES `student_info` (`code`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 52 CHARACTER SET = sjis COLLATE = sjis_japanese_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student_grad
-- ----------------------------
INSERT INTO `student_grad` VALUES (2, '20030002', 60, 55, 92, 59, 97, 65, 65, 90, 80, '2009-06-06', NULL);
INSERT INTO `student_grad` VALUES (4, '20030004', 97, 93, 52, 74, 83, 77, 72, 71, 96, '2009-06-06', NULL);
INSERT INTO `student_grad` VALUES (5, '20030005', 62, 56, 85, 100, 74, 60, 94, 80, 77, '2009-06-06', NULL);
INSERT INTO `student_grad` VALUES (6, '20030006', 84, 92, 78, 74, 90, 93, 97, 50, 81, '2009-06-06', NULL);
INSERT INTO `student_grad` VALUES (7, '20030007', 81, 68, 77, 80, 55, 68, 75, 53, 59, '2009-06-06', NULL);
INSERT INTO `student_grad` VALUES (8, '20030008', 95, 97, 67, 63, 60, 65, 83, 94, 83, '2009-06-06', NULL);
INSERT INTO `student_grad` VALUES (9, '20030009', 65, 77, 56, 85, 50, 58, 90, 81, 82, '2009-06-06', NULL);
INSERT INTO `student_grad` VALUES (10, '20030010', 85, 99, 81, 63, 75, 50, 96, 74, 53, '2009-06-06', NULL);
INSERT INTO `student_grad` VALUES (11, '20030011', 83, 99, 54, 71, 75, 90, 53, 85, 82, '2009-06-06', NULL);
INSERT INTO `student_grad` VALUES (12, '20030012', 82, 96, 79, 84, 83, 64, 71, 53, 100, '2009-06-06', NULL);
INSERT INTO `student_grad` VALUES (15, '20030001', 70, 97, 64, 74, 81, 62, 89, 93, 52, '2009-06-06', NULL);
INSERT INTO `student_grad` VALUES (20, '20030002', 78, 91, 53, 70, 87, 88, 99, 62, 75, '2009-06-04', NULL);
INSERT INTO `student_grad` VALUES (21, '20030004', 62, 76, 50, 61, 78, 73, 93, 55, 89, '2009-06-04', NULL);
INSERT INTO `student_grad` VALUES (22, '20030005', 78, 54, 76, 82, 82, 76, 90, 72, 98, '2009-06-04', NULL);
INSERT INTO `student_grad` VALUES (23, '20030006', 68, 53, 88, 100, 97, 80, 94, 96, 83, '2009-06-04', NULL);
INSERT INTO `student_grad` VALUES (24, '20030007', 56, 62, 55, 78, 59, 85, 98, 93, 90, '2009-06-04', NULL);
INSERT INTO `student_grad` VALUES (25, '20030008', 73, 77, 95, 62, 67, 69, 64, 84, 99, '2009-06-04', NULL);
INSERT INTO `student_grad` VALUES (26, '20030009', 79, 88, 66, 56, 91, 66, 56, 63, 91, '2009-06-04', NULL);
INSERT INTO `student_grad` VALUES (27, '20030010', 85, 56, 88, 87, 72, 76, 99, 53, 62, '2009-06-04', NULL);
INSERT INTO `student_grad` VALUES (28, '20030011', 99, 92, 63, 89, 54, 89, 78, 98, 67, '2009-06-04', NULL);
INSERT INTO `student_grad` VALUES (29, '20030012', 96, 69, 97, 68, 86, 50, 66, 70, 65, '2009-06-04', NULL);
INSERT INTO `student_grad` VALUES (30, '20030001', 69, 81, 94, 68, 98, 63, 79, 88, 75, '2009-06-04', NULL);
INSERT INTO `student_grad` VALUES (31, '20030002', 85, 63, 83, 52, 82, 54, 83, 67, 56, '2009-06-02', NULL);
INSERT INTO `student_grad` VALUES (32, '20030004', 54, 92, 90, 88, 81, 75, 58, 61, 92, '2009-06-02', NULL);
INSERT INTO `student_grad` VALUES (33, '20030005', 59, 91, 50, 99, 90, 50, 61, 81, 54, '2009-06-02', NULL);
INSERT INTO `student_grad` VALUES (34, '20030006', 50, 94, 66, 76, 62, 54, 84, 70, 73, '2009-06-02', NULL);
INSERT INTO `student_grad` VALUES (35, '20030007', 80, 59, 90, 66, 76, 52, 77, 91, 94, '2009-06-02', NULL);
INSERT INTO `student_grad` VALUES (36, '20030008', 77, 56, 56, 51, 66, 73, 66, 93, 54, '2009-06-02', NULL);
INSERT INTO `student_grad` VALUES (37, '20030009', 73, 79, 96, 91, 73, 99, 93, 68, 60, '2009-06-02', NULL);
INSERT INTO `student_grad` VALUES (38, '20030010', 67, 66, 84, 86, 52, 83, 79, 72, 88, '2009-06-02', NULL);
INSERT INTO `student_grad` VALUES (39, '20030011', 84, 89, 90, 76, 51, 100, 92, 67, 64, '2009-06-02', NULL);
INSERT INTO `student_grad` VALUES (40, '20030012', 78, 68, 62, 95, 66, 60, 58, 73, 95, '2009-06-02', NULL);
INSERT INTO `student_grad` VALUES (41, '20030001', 72, 91, 86, 77, 59, 99, 68, 57, 83, '2009-06-01', '');
INSERT INTO `student_grad` VALUES (42, '20030004', 84, 99, 68, 85, 89, 86, 66, 95, 54, '2009-06-01', NULL);
INSERT INTO `student_grad` VALUES (43, '20030005', 79, 63, 92, 89, 79, 97, 66, 55, 71, '2009-06-01', NULL);
INSERT INTO `student_grad` VALUES (44, '20030006', 99, 67, 91, 82, 75, 90, 59, 58, 80, '2009-06-01', NULL);
INSERT INTO `student_grad` VALUES (45, '20030007', 66, 76, 76, 93, 92, 61, 56, 100, 66, '2009-06-01', NULL);
INSERT INTO `student_grad` VALUES (46, '20030008', 57, 77, 79, 90, 69, 66, 82, 98, 79, '2009-06-01', NULL);
INSERT INTO `student_grad` VALUES (47, '20030009', 60, 57, 60, 73, 77, 95, 69, 93, 51, '2009-06-01', NULL);
INSERT INTO `student_grad` VALUES (48, '20030010', 93, 98, 81, 57, 55, 92, 50, 51, 57, '2009-06-01', NULL);
INSERT INTO `student_grad` VALUES (49, '20030011', 90, 90, 97, 56, 71, 70, 82, 51, 96, '2009-06-01', NULL);
INSERT INTO `student_grad` VALUES (50, '20030012', 99, 97, 96, 53, 80, 88, 51, 51, 93, '2009-06-01', NULL);
INSERT INTO `student_grad` VALUES (51, '20030001', 83, 92, 100, 95, 81, 65, 68, 85, 71, '2009-06-01', NULL);

-- ----------------------------
-- Table structure for student_info
-- ----------------------------
DROP TABLE IF EXISTS `student_info`;
CREATE TABLE `student_info`  (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `stuname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `stugender` int(11) NOT NULL,
  `stubirth` date NULL DEFAULT NULL,
  `stuphone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `stuaddress` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `stuimg` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `stuoutlook` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `stupos` int(255) NOT NULL,
  `desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`, `code`) USING BTREE,
  INDEX `loguser`(`code`) USING BTREE,
  INDEX `gen`(`stugender`) USING BTREE,
  INDEX `stpos`(`stupos`) USING BTREE,
  CONSTRAINT `gen` FOREIGN KEY (`stugender`) REFERENCES `stu_gender` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `loguser` FOREIGN KEY (`code`) REFERENCES `login_info` (`code`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `stpos` FOREIGN KEY (`stupos`) REFERENCES `position` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 65 CHARACTER SET = sjis COLLATE = sjis_japanese_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student_info
-- ----------------------------
INSERT INTO `student_info` VALUES (1, '20030001', '测试员1', 1, '2003-09-09', '11111111111', '河南郑州', NULL, NULL, 1, NULL);
INSERT INTO `student_info` VALUES (2, '20030002', '测试员2', 1, '2003-09-09', '22222222222', '河南郑州', NULL, NULL, 4, NULL);
INSERT INTO `student_info` VALUES (3, '20030003', '测试员3', 1, '2003-09-09', '33333333333', '河南郑州', NULL, NULL, 1, NULL);
INSERT INTO `student_info` VALUES (4, '20030004', '测试员4', 1, '2003-09-06', '44444444444', '河南郑州', NULL, NULL, 3, NULL);
INSERT INTO `student_info` VALUES (5, '20030005', '测试员5', 1, '2003-08-31', '55555555555', '河南郑州', NULL, NULL, 1, NULL);
INSERT INTO `student_info` VALUES (6, '20030006', '测试员6', 2, '2006-09-07', '66666666666', '河南郑州', NULL, NULL, 4, NULL);
INSERT INTO `student_info` VALUES (7, '20030007', '测试员7', 1, '2009-06-03', '77777777777', '河南郑州', NULL, NULL, 4, NULL);
INSERT INTO `student_info` VALUES (8, '20030008', '测试员8', 2, '2009-06-05', '88888888888', '河南郑州', NULL, NULL, 3, NULL);
INSERT INTO `student_info` VALUES (9, '20030009', '测试员9', 1, '2009-09-06', '99999999999', '河南郑州', NULL, NULL, 4, NULL);
INSERT INTO `student_info` VALUES (10, '20030010', '测试员10', 1, '2008-09-06', '10101010101', '河南郑州', NULL, NULL, 3, NULL);
INSERT INTO `student_info` VALUES (11, '20030011', '测试员11', 2, '2009-06-03', '11011011010', '河南郑州', NULL, NULL, 4, NULL);
INSERT INTO `student_info` VALUES (12, '20030012', '测试员12', 2, '2006-06-07', '12121212121', '河南郑州', NULL, NULL, 4, NULL);

-- ----------------------------
-- Table structure for student_violation
-- ----------------------------
DROP TABLE IF EXISTS `student_violation`;
CREATE TABLE `student_violation`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `record_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `deduc_fra` int(11) NOT NULL,
  `date` date NOT NULL,
  `desc` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `deid`(`deduc_fra`) USING BTREE,
  INDEX `vioinfo`(`code`) USING BTREE,
  CONSTRAINT `deid` FOREIGN KEY (`deduc_fra`) REFERENCES `violation_fra` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `vioinfo` FOREIGN KEY (`code`) REFERENCES `student_info` (`code`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = sjis COLLATE = sjis_japanese_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student_violation
-- ----------------------------
INSERT INTO `student_violation` VALUES (1, '20030001', '说话', 1, '2006-09-06', NULL);
INSERT INTO `student_violation` VALUES (2, '20030007', '打架', 3, '2006-06-06', NULL);
INSERT INTO `student_violation` VALUES (3, '20030008', '卫生', 1, '2006-06-06', NULL);
INSERT INTO `student_violation` VALUES (4, '20030007', '没交作业', 4, '2006-06-06', NULL);

-- ----------------------------
-- Table structure for subjectsort
-- ----------------------------
DROP TABLE IF EXISTS `subjectsort`;
CREATE TABLE `subjectsort`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `s1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `s2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `s3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `s4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `s5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `s6` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `s7` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `s8` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `s9` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 2 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of subjectsort
-- ----------------------------
INSERT INTO `subjectsort` VALUES (1, '语文', '数学', '英语', '历史', '物理', '地理', '生物', '化学', '政治');

-- ----------------------------
-- Table structure for violation_fra
-- ----------------------------
DROP TABLE IF EXISTS `violation_fra`;
CREATE TABLE `violation_fra`  (
  `id` int(11) NOT NULL,
  `violation_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `deduction` int(11) NOT NULL,
  `desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = sjis COLLATE = sjis_japanese_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of violation_fra
-- ----------------------------
INSERT INTO `violation_fra` VALUES (1, '纪律', 10, NULL);
INSERT INTO `violation_fra` VALUES (2, '卫生', 5, NULL);
INSERT INTO `violation_fra` VALUES (3, '打架', 20, NULL);
INSERT INTO `violation_fra` VALUES (4, '作业', 5, NULL);

SET FOREIGN_KEY_CHECKS = 1;

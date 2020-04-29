/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 80018
 Source Host           : localhost:3306
 Source Schema         : db_lab

 Target Server Type    : MySQL
 Target Server Version : 80018
 File Encoding         : 65001

 Date: 18/04/2020 20:58:46
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for building
-- ----------------------------
DROP TABLE IF EXISTS `building`;
CREATE TABLE `building`  (
  `buildingId` int(11) NOT NULL AUTO_INCREMENT,
  `buildingName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `campus` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`buildingId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of building
-- ----------------------------
INSERT INTO `building` VALUES (1, '正心', '本部');

-- ----------------------------
-- Table structure for class
-- ----------------------------
DROP TABLE IF EXISTS `class`;
CREATE TABLE `class`  (
  `classId` int(1) NOT NULL AUTO_INCREMENT,
  `departmentId` int(1) NOT NULL,
  `grade` int(1) NOT NULL,
  PRIMARY KEY (`classId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of class
-- ----------------------------
INSERT INTO `class` VALUES (1, 1, 3);
INSERT INTO `class` VALUES (2, 1, 3);
INSERT INTO `class` VALUES (3, 2, 3);

-- ----------------------------
-- Table structure for college
-- ----------------------------
DROP TABLE IF EXISTS `college`;
CREATE TABLE `college`  (
  `collegeId` int(11) NOT NULL AUTO_INCREMENT,
  `collegeName` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`collegeId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of college
-- ----------------------------
INSERT INTO `college` VALUES (1, '计算机');

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course`  (
  `courseId` int(11) NOT NULL AUTO_INCREMENT,
  `courseName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `credit` int(1) NOT NULL,
  PRIMARY KEY (`courseId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES (1, '数据库', 3);
INSERT INTO `course` VALUES (2, '操作系统', 4);

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department`  (
  `departmentId` int(11) NOT NULL AUTO_INCREMENT,
  `departmentName` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `collegeId` int(11) NOT NULL,
  PRIMARY KEY (`departmentId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES (1, '计算机工程', 1);
INSERT INTO `department` VALUES (2, '信息安全', 1);

-- ----------------------------
-- Table structure for lecture
-- ----------------------------
DROP TABLE IF EXISTS `lecture`;
CREATE TABLE `lecture`  (
  `lectureId` int(11) NOT NULL AUTO_INCREMENT,
  `teachId` int(11) NOT NULL,
  `courseId` int(11) NOT NULL,
  `roomId` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`lectureId`) USING BTREE,
  INDEX `teacher_course`(`teachId`) USING BTREE,
  CONSTRAINT `teacher_course` FOREIGN KEY (`teachId`) REFERENCES `teacher` (`teachId`) ON DELETE CASCADE ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of lecture
-- ----------------------------
INSERT INTO `lecture` VALUES (1, 1, 1, 1);

-- ----------------------------
-- Table structure for room
-- ----------------------------
DROP TABLE IF EXISTS `room`;
CREATE TABLE `room`  (
  `roomId` int(11) NOT NULL AUTO_INCREMENT,
  `buildingId` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`roomId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of room
-- ----------------------------
INSERT INTO `room` VALUES (1, 1);
INSERT INTO `room` VALUES (2, 1);

-- ----------------------------
-- Table structure for score
-- ----------------------------
DROP TABLE IF EXISTS `score`;
CREATE TABLE `score`  (
  `stuId` int(11) NOT NULL,
  `lectureId` int(11) NOT NULL,
  `score` int(11) NOT NULL,
  PRIMARY KEY (`stuId`, `lectureId`) USING BTREE,
  INDEX `score_lecture`(`lectureId`) USING BTREE,
  CONSTRAINT `score_lecture` FOREIGN KEY (`lectureId`) REFERENCES `lecture` (`lectureId`) ON DELETE CASCADE ON UPDATE RESTRICT,
  CONSTRAINT `stu_score` FOREIGN KEY (`stuId`) REFERENCES `student` (`stuId`) ON DELETE CASCADE ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of score
-- ----------------------------
INSERT INTO `score` VALUES (1, 1, 60);
INSERT INTO `score` VALUES (8, 1, 88);

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `stuId` int(10) NOT NULL AUTO_INCREMENT,
  `stuName` char(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `classId` int(1) NOT NULL,
  `gender` char(3) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `stuAge` int(1) NULL DEFAULT NULL,
  `stuPhone` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `entertime` timestamp(0) NOT NULL,
  PRIMARY KEY (`stuId`) USING BTREE,
  INDEX `stu_classId`(`classId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (1, '吴昊', 1, '男', 22, '13144516882', '2020-04-14 20:36:12');
INSERT INTO `student` VALUES (3, '小陈', 3, '女', 24, '165423542354', '2020-04-14 20:37:06');
INSERT INTO `student` VALUES (4, '冯帅', 3, '男', 20, '15045166541', '2020-04-14 11:59:55');
INSERT INTO `student` VALUES (7, 'hello', 2, '男', 22, '110112119114', '2020-04-02 11:43:35');
INSERT INTO `student` VALUES (8, 'new', 3, '女', 16, '15045166541', '2020-04-02 11:43:35');
INSERT INTO `student` VALUES (10, 'new', 2, '女', 22, '15045166541', '2020-04-18 03:55:16');
INSERT INTO `student` VALUES (11, 'empty', 1, '男', 15, '13144516666', '2020-04-17 09:32:58');
INSERT INTO `student` VALUES (12, 'new', 2, '女', 20, '13144516666', '2020-04-18 03:54:05');

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher`  (
  `teachId` int(1) NOT NULL AUTO_INCREMENT,
  `teachName` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `teachAge` int(1) NULL DEFAULT NULL,
  `teachBirth` timestamp(0) NULL DEFAULT NULL,
  `teachSalary` int(1) NOT NULL,
  `departmentId` int(1) NOT NULL,
  `teachPhone` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `gender` char(3) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`teachId`) USING BTREE,
  INDEX `teach_departmentId`(`departmentId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES (1, '战神', 50, '2020-04-14 20:35:15', 66666, 1, '15798453215', '男');
INSERT INTO `teacher` VALUES (2, '小陈', 46, '2020-04-14 20:34:02', 1000, 1, '15698746542', '女');
INSERT INTO `teacher` VALUES (4, '小孙', 45, '2020-04-14 12:02:45', 100000, 1, '15789456324', '男');
INSERT INTO `teacher` VALUES (5, '王天', 45, '2020-04-14 12:02:45', 233333, 1, '15945632154', '女');
INSERT INTO `teacher` VALUES (7, '小李', 56, '2020-04-17 10:57:57', 123456, 2, '15478965412', '男');
INSERT INTO `teacher` VALUES (8, '小李', 56, '2020-04-17 10:57:57', 123456, 2, '15478965412', '男');
INSERT INTO `teacher` VALUES (10, '小李', 45, '2020-04-18 03:26:09', 100000, 2, '15789456324', '男');
INSERT INTO `teacher` VALUES (12, '小陈', 45, '2020-04-17 10:57:57', 100000, 1, '15789456324', '男');
INSERT INTO `teacher` VALUES (13, '小李', 45, '2020-04-18 03:26:09', 100000, 1, '15789456324', '男');
INSERT INTO `teacher` VALUES (16, '小苏', 45, '2020-04-18 03:26:09', 100000, 1, '15789456324', '女');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `username` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `password` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`username`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('admin', 'admin');

-- ----------------------------
-- View structure for stuinfo
-- ----------------------------
DROP VIEW IF EXISTS `stuinfo`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `stuinfo` AS select `student`.`stuId` AS `stuId`,`student`.`stuName` AS `stuName`,`student`.`classId` AS `classId`,`college`.`collegeName` AS `collegeName`,`department`.`departmentName` AS `departmentname`,`student`.`gender` AS `gender`,`student`.`stuAge` AS `stuAge`,`student`.`entertime` AS `entertime`,`class`.`grade` AS `grade`,`student`.`stuPhone` AS `stuPhone` from (((`student` join `class` on((`student`.`classId` = `class`.`classId`))) join `department` on((`class`.`departmentId` = `department`.`departmentId`))) join `college` on((`department`.`collegeId` = `college`.`collegeId`)));

SET FOREIGN_KEY_CHECKS = 1;

/*
 Navicat Premium Data Transfer

 Source Server         : FabrikaOtomasyonu
 Source Server Type    : MySQL
 Source Server Version : 100128
 Source Host           : localhost:3306
 Source Schema         : fabrika

 Target Server Type    : MySQL
 Target Server Version : 100128
 File Encoding         : 65001

 Date: 12/12/2017 19:22:28
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for bankserver
-- ----------------------------
DROP TABLE IF EXISTS `bankserver`;
CREATE TABLE `bankserver`  (
  `Bankid` int(11) NOT NULL AUTO_INCREMENT,
  `BankAdi` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `BankSoyadi` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `BankNum` bigint(255) NULL DEFAULT NULL,
  `BankTarih` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `BankKod` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `BankThread` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `BankKayit` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`Bankid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 53 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of bankserver
-- ----------------------------
INSERT INTO `bankserver` VALUES (51, 'SAMET', 'HALİFE', 7995899866331275, '755', '38101', '0', '0');

-- ----------------------------
-- Table structure for maliyettable
-- ----------------------------
DROP TABLE IF EXISTS `maliyettable`;
CREATE TABLE `maliyettable`  (
  `Urid` int(11) NOT NULL AUTO_INCREMENT,
  `UrSure` int(255) NULL DEFAULT NULL,
  `UrisciMaliyet` decimal(6, 2) NULL DEFAULT NULL,
  `UrEnerjiMaliyet` decimal(6, 2) NULL DEFAULT NULL,
  `UrVergiKira` decimal(6, 2) NULL DEFAULT NULL,
  `UrModel` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  PRIMARY KEY (`Urid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of maliyettable
-- ----------------------------
INSERT INTO `maliyettable` VALUES (2, 20, 20.50, 30.60, 40.70, 'A 180');
INSERT INTO `maliyettable` VALUES (3, 25, 21.45, 35.00, 42.50, 'A 200');

-- ----------------------------
-- Table structure for modeller
-- ----------------------------
DROP TABLE IF EXISTS `modeller`;
CREATE TABLE `modeller`  (
  `Modelid` int(11) NOT NULL AUTO_INCREMENT,
  `ModelSeri` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `ModelUrl` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `ModelAdi` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  PRIMARY KEY (`Modelid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 26 CHARACTER SET = utf8 COLLATE = utf8_turkish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of modeller
-- ----------------------------
INSERT INTO `modeller` VALUES (1, 'Style+', 'https://www.aloparca.com/oto-yedek-parca/ustkategori/motor-ve-parcalari', 'A 180');
INSERT INTO `modeller` VALUES (2, 'Style', 'https://www.aloparca.com/oto-yedek-parca/KIA/SORENTO/Kapali_arazi_arabasi/2017/3.5_V6/143', 'A 180');
INSERT INTO `modeller` VALUES (3, 'Urban', 'https://www.aloparca.com/oto-yedek-parca/KIA/SORENTO/Kapali_arazi_arabasi/2017/2.4_GDI_4WD/141', 'A 180');
INSERT INTO `modeller` VALUES (4, 'AMG', 'https://www.aloparca.com/oto-yedek-parca/ustkategori/motor-ve-parcalari', 'A 200');
INSERT INTO `modeller` VALUES (5, 'AMG WhiteArt', 'https://www.aloparca.com/oto-yedek-parca/KIA/SORENTO/Kapali_arazi_arabasi/2017/3.5_V6/143', 'A 200');
INSERT INTO `modeller` VALUES (6, 'Urban', 'https://www.aloparca.com/oto-yedek-parca/KIA/SORENTO/Kapali_arazi_arabasi/2017/2.4_GDI_4WD/141', 'A 200');
INSERT INTO `modeller` VALUES (7, 'Style+', 'https://www.aloparca.com/oto-yedek-parca/BMW/X1/Kombi/2017/sDrive_16_i/105', 'A 180 d');
INSERT INTO `modeller` VALUES (8, 'Urban', 'https://www.aloparca.com/oto-yedek-parca/BMW/X3/Kapali_arazi_arabasi/2017/xDrive_25_i/160', 'A 180 d');
INSERT INTO `modeller` VALUES (9, 'AMG', 'https://www.aloparca.com/oto-yedek-parca/BMW/Z4/Cabriolet/2017/3.0_i/170', 'A 180 d');
INSERT INTO `modeller` VALUES (10, 'AMG WhiteArt', 'https://www.aloparca.com/oto-yedek-parca/BMW/Z4/Cabriolet/2017/2.5_i/141', 'A 180 d');
INSERT INTO `modeller` VALUES (11, 'Style', 'https://www.aloparca.com/oto-yedek-parca/MERCEDES_BENZ/CITAN_415/Kutu/2017/109_CDI/66', 'A 180 d');
INSERT INTO `modeller` VALUES (12, 'Style', 'https://www.aloparca.com/oto-yedek-parca/MERCEDES_BENZ/C_SERISI_T_Model/Steysin/2017/C_200_d/100', 'B 180');
INSERT INTO `modeller` VALUES (13, 'Urban', 'https://www.aloparca.com/oto-yedek-parca/MERCEDES_BENZ/M_CLASS/Kapali_arazi_arabasi/2017/ML_350_CDI_4_matic_164.125/170', 'B 180');
INSERT INTO `modeller` VALUES (14, 'AMG', 'https://www.aloparca.com/oto-yedek-parca/MERCEDES_BENZ/SPRINTER/Kutu/2017/310_CDI_906.631._906.633._906.635._906.637/70', 'B 180');
INSERT INTO `modeller` VALUES (15, 'AMG', 'https://www.aloparca.com/oto-yedek-parca/MERCEDES_BENZ/SPRINTER/Duz_kasa_kamyon_Sasi/2017/411_CDI/80', 'B 200');
INSERT INTO `modeller` VALUES (16, 'Urban', 'https://www.aloparca.com/oto-yedek-parca/KIA/SORENTO/Kapali_arazi_arabasi/2017/3.5_V6/143', 'B 180 d');
INSERT INTO `modeller` VALUES (17, 'Style', 'https://www.aloparca.com/oto-yedek-parca/ustkategori/motor-ve-parcalari', 'B 180 d');
INSERT INTO `modeller` VALUES (18, 'AMG', 'https://www.aloparca.com/oto-yedek-parca/MERCEDES_BENZ/GLK_SERISI/Kapali_arazi_arabasi/2017/200_CDI_204.901/105', 'B 180 d');
INSERT INTO `modeller` VALUES (19, 'AMG', 'https://www.aloparca.com/oto-yedek-parca/MERCEDES_BENZ/SPRINTER/Damperli_kamyon/2017/616_CDI_905.612._905.622._905.623/115', 'C 180 Estate');
INSERT INTO `modeller` VALUES (20, 'Avantgarde', 'https://www.aloparca.com/oto-yedek-parca/MERCEDES_BENZ/SLK_SERISI/Coupe/2017/5.4_722_Edition/478', 'C 180 Estate');
INSERT INTO `modeller` VALUES (21, 'Exclusive', 'https://www.aloparca.com/oto-yedek-parca/MERCEDES_BENZ/E_SERISI_T_Model/Steysin/2017/E_220_BlueTEC_4_matic/125', 'C 180 Estate');
INSERT INTO `modeller` VALUES (22, 'AMG', 'https://www.aloparca.com/oto-yedek-parca/MERCEDES_BENZ/GLK_SERISI/Kapali_arazi_arabasi/2017/200_CDI_204.901/105', 'C 180 Cabriolet');
INSERT INTO `modeller` VALUES (23, 'AMG', 'https://www.aloparca.com/oto-yedek-parca/MERCEDES_BENZ/GLK_SERISI/Kapali_arazi_arabasi/2017/350_CDI_4_matic_204.993/195', 'C 300 Cabriolet');
INSERT INTO `modeller` VALUES (24, 'Exclusive', 'https://www.aloparca.com/oto-yedek-parca/BENTLEY/CONTINENTAL_Coupe/Coupe', 'GLC 250 d 4MATIC');
INSERT INTO `modeller` VALUES (25, 'Exclusive', 'https://www.aloparca.com/oto-yedek-parca/BENTLEY/CONTINENTAL_FLYING_SPUR/Sedan/2017/6/412', 'GLC 250 d 4MATIC');

-- ----------------------------
-- Table structure for musterikayit
-- ----------------------------
DROP TABLE IF EXISTS `musterikayit`;
CREATE TABLE `musterikayit`  (
  `musid` int(255) NOT NULL AUTO_INCREMENT,
  `musAd` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `musSoyadi` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `musTel` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `musUnvan` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `musSirket` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `musMail` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `musSifre` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  PRIMARY KEY (`musid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 84 CHARACTER SET = utf8 COLLATE = utf8_turkish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of musterikayit
-- ----------------------------
INSERT INTO `musterikayit` VALUES (82, 'SAMET', 'HALİFE', '5355736676', 'MÜHENDİS', 'WİSSEN', 'samet@gmail.com', 'samet');

-- ----------------------------
-- Procedure structure for MusteriKayit
-- ----------------------------
DROP PROCEDURE IF EXISTS `MusteriKayit`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `MusteriKayit`(IN `Adi` varchar(255),IN `Soyadi` varchar(255),IN `Tel` varchar(255),IN `Unvan` varchar(255),IN `Sirket` varchar(255),IN `Sifre` varchar(255),IN `Mail` varchar(255))
BEGIN
	
	INSERT INTO musterikayit VALUES(null,Adi,Soyadi,Tel,Unvan,Sirket,Sifre,Mail);
	

END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for SiparisSayfasi
-- ----------------------------
DROP PROCEDURE IF EXISTS `SiparisSayfasi`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `SiparisSayfasi`(IN `ModelAdi` varchar(255),IN `ModelFiyat` varchar(255))
BEGIN
	
	insert into modeller VALUES(null,ModelAdi,ModelFiyat);
	

END
;;
delimiter ;

-- ----------------------------
-- Triggers structure for table musterikayit
-- ----------------------------
DROP TRIGGER IF EXISTS `BankAdis`;
delimiter ;;
CREATE TRIGGER `BankAdis` AFTER INSERT ON `musterikayit` FOR EACH ROW BEGIN


set @num=FLOOR(RAND()*((POW(10,16)-POW(10,15)))+POW(10,15));

set @tarih=FLOOR(RAND()*((POW(10,3)-POW(10,2)))+POW(10,2));

set @kod=FLOOR(RAND()*((POW(10,5)-POW(10,4)))+POW(10,4));

set @thread=0;

set @kayit=0;

insert into bankserver values(null,new.musAd,new.musSoyadi,@num,@tarih,@kod,@thread,@kayit);

END
;;
delimiter ;

SET FOREIGN_KEY_CHECKS = 1;

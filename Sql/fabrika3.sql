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

 Date: 05/12/2017 23:56:02
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
  `BankTarih` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  PRIMARY KEY (`Bankid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of bankserver
-- ----------------------------
INSERT INTO `bankserver` VALUES (10, 'Samet', 'Halife', '121121122');
INSERT INTO `bankserver` VALUES (11, 'Merve', 'Acer', '5565656565');
INSERT INTO `bankserver` VALUES (12, 'Ömer', 'Hayyam', '6565656565');

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
) ENGINE = InnoDB AUTO_INCREMENT = 28 CHARACTER SET = utf8 COLLATE = utf8_turkish_ci ROW_FORMAT = Compact;

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
INSERT INTO `modeller` VALUES (12, 'C 200 d', 'https://www.aloparca.com/oto-yedek-parca/MERCEDES_BENZ/C_SERISI_T_Model/Steysin/2017/C_200_d/100', NULL);
INSERT INTO `modeller` VALUES (13, 'E 180', 'https://www.aloparca.com/oto-yedek-parca/MERCEDES_BENZ/M_CLASS/Kapali_arazi_arabasi/2017/ML_350_CDI_4_matic_164.125/170', NULL);
INSERT INTO `modeller` VALUES (14, 'E 300', 'https://www.aloparca.com/oto-yedek-parca/MERCEDES_BENZ/SPRINTER/Kutu/2017/310_CDI_906.631._906.633._906.635._906.637/70', NULL);
INSERT INTO `modeller` VALUES (15, 'E 220 d 4MATIC', 'https://www.aloparca.com/oto-yedek-parca/MERCEDES_BENZ/SPRINTER/Duz_kasa_kamyon_Sasi/2017/411_CDI/80', NULL);
INSERT INTO `modeller` VALUES (16, 'E 350 d 4MATIC', 'https://www.aloparca.com/oto-yedek-parca/KIA/SORENTO/Kapali_arazi_arabasi/2017/3.5_V6/143', NULL);
INSERT INTO `modeller` VALUES (17, 'S 350 d 4MATIC Long', 'https://www.aloparca.com/oto-yedek-parca/ustkategori/motor-ve-parcalari', NULL);
INSERT INTO `modeller` VALUES (18, 'Yeni S 400 d 4MATIC', 'https://www.aloparca.com/oto-yedek-parca/MERCEDES_BENZ/GLK_SERISI/Kapali_arazi_arabasi/2017/200_CDI_204.901/105', NULL);
INSERT INTO `modeller` VALUES (19, 'Yeni S 400 d 4MATIC Long', 'https://www.aloparca.com/oto-yedek-parca/MERCEDES_BENZ/SPRINTER/Damperli_kamyon/2017/616_CDI_905.612._905.622._905.623/115', NULL);
INSERT INTO `modeller` VALUES (20, 'Yeni Mercedes-AMG S 63 4MATIC+ Long', 'https://www.aloparca.com/oto-yedek-parca/MERCEDES_BENZ/SLK_SERISI/Coupe/2017/5.4_722_Edition/478', NULL);
INSERT INTO `modeller` VALUES (21, 'Mercedes-Maybach S 500 4MATIC', 'https://www.aloparca.com/oto-yedek-parca/MERCEDES_BENZ/E_SERISI_T_Model/Steysin/2017/E_220_BlueTEC_4_matic/125', NULL);
INSERT INTO `modeller` VALUES (22, 'Mercedes-Maybach S 600', 'https://www.aloparca.com/oto-yedek-parca/MERCEDES_BENZ/GLK_SERISI/Kapali_arazi_arabasi/2017/200_CDI_204.901/105', NULL);
INSERT INTO `modeller` VALUES (23, 'Yeni Mercedes-Maybach S 450 4MATIC', 'https://www.aloparca.com/oto-yedek-parca/MERCEDES_BENZ/GLK_SERISI/Kapali_arazi_arabasi/2017/350_CDI_4_matic_204.993/195', NULL);
INSERT INTO `modeller` VALUES (24, 'Yeni Mercedes-Maybach S 560 4MATIC', 'https://www.aloparca.com/oto-yedek-parca/BENTLEY/CONTINENTAL_Coupe/Coupe', NULL);
INSERT INTO `modeller` VALUES (25, 'Yeni Mercedes-Maybach S 650', 'https://www.aloparca.com/oto-yedek-parca/BENTLEY/CONTINENTAL_FLYING_SPUR/Sedan/2017/6/412', NULL);
INSERT INTO `modeller` VALUES (27, 'ALİ', 'BİLMEM', 'NE');

-- ----------------------------
-- Table structure for musterikayit
-- ----------------------------
DROP TABLE IF EXISTS `musterikayit`;
CREATE TABLE `musterikayit`  (
  `musid` int(255) NOT NULL AUTO_INCREMENT,
  `musAd` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `musSoyadi` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `musTel` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `musUnvan` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `musSirket` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `musMail` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `musSifre` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  PRIMARY KEY (`musid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 45 CHARACTER SET = utf8 COLLATE = utf8_turkish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for urunler
-- ----------------------------
DROP TABLE IF EXISTS `urunler`;
CREATE TABLE `urunler`  (
  `Urunid` int(11) NOT NULL AUTO_INCREMENT,
  `UrunAdi` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `UrunSoyadi` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `UrunKod` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  PRIMARY KEY (`Urunid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of urunler
-- ----------------------------
INSERT INTO `urunler` VALUES (1, 'A 180', 'Style', 'https://www.aloparca.com/oto-yedek-parca/KIA/SORENTO/Kapali_arazi_arabasi/2017/3.5_V6/143');

-- ----------------------------
-- Procedure structure for kayit
-- ----------------------------
DROP PROCEDURE IF EXISTS `kayit`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `kayit`(IN `isim` varchar(255))
BEGIN
	
	INSERT INTO kullanici values(null,isim);

END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for MusteriKayit
-- ----------------------------
DROP PROCEDURE IF EXISTS `MusteriKayit`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `MusteriKayit`(IN `Adi` varchar(255),IN `Soyadi` varchar(255),IN `Tel` int(10),IN `Unvan` varchar(255),IN `Sirket` varchar(255),IN `Sifre` varchar(255),IN `Mail` varchar(255))
BEGIN
	
	INSERT INTO kullanici VALUES(null,Adi);
	

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

insert into bankserver values(null,new.musAd,new.musSoyadi,'');

END
;;
delimiter ;

SET FOREIGN_KEY_CHECKS = 1;

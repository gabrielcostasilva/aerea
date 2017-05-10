CREATE DATABASE  IF NOT EXISTS `projeto02` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `projeto02`;
-- MySQL dump 10.13  Distrib 5.7.17, for macos10.12 (x86_64)
--
-- Host: projeto02.cdwyove4plgx.us-east-1.rds.amazonaws.com    Database: projeto02
-- ------------------------------------------------------
-- Server version	5.6.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `AVIAO`
--

DROP TABLE IF EXISTS `AVIAO`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `AVIAO` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `NOMEPILOTO` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `AVIAO`
--

LOCK TABLES `AVIAO` WRITE;
/*!40000 ALTER TABLE `AVIAO` DISABLE KEYS */;
INSERT INTO `AVIAO` VALUES (1,'John Michael'),(2,'Elton John'),(3,'Catherine Zeta Jones'),(4,'Bill Gates');
/*!40000 ALTER TABLE `AVIAO` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Aviao_NOMETRIPULACAO`
--

DROP TABLE IF EXISTS `Aviao_NOMETRIPULACAO`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Aviao_NOMETRIPULACAO` (
  `Aviao_ID` bigint(20) DEFAULT NULL,
  `NOMETRIPULACAO` varchar(255) DEFAULT NULL,
  KEY `FK_Aviao_NOMETRIPULACAO_Aviao_ID` (`Aviao_ID`),
  CONSTRAINT `FK_Aviao_NOMETRIPULACAO_Aviao_ID` FOREIGN KEY (`Aviao_ID`) REFERENCES `AVIAO` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Aviao_NOMETRIPULACAO`
--

LOCK TABLES `Aviao_NOMETRIPULACAO` WRITE;
/*!40000 ALTER TABLE `Aviao_NOMETRIPULACAO` DISABLE KEYS */;
INSERT INTO `Aviao_NOMETRIPULACAO` VALUES (1,'Howard Aiken'),(1,'John Atanasoff'),(1,'Charles Babbage'),(2,'John Backus'),(2,'Jean Bartik'),(2,'Tim Berners-Lee'),(3,'George Boole'),(3,'Per Brinch Hansen'),(3,'Fred Brooks'),(4,'Nikolay Brusentsov'),(4,'Vannevar Bush'),(4,'David Caminer');
/*!40000 ALTER TABLE `Aviao_NOMETRIPULACAO` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `DESTINOVOO`
--

DROP TABLE IF EXISTS `DESTINOVOO`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `DESTINOVOO` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `NOME` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `DESTINOVOO`
--

LOCK TABLES `DESTINOVOO` WRITE;
/*!40000 ALTER TABLE `DESTINOVOO` DISABLE KEYS */;
INSERT INTO `DESTINOVOO` VALUES (1,'Shanghai'),(2,'Karachi'),(3,'Beijing'),(4,'Dhaka'),(5,'Delhi'),(6,'Lagos'),(7,'Istanbul');
/*!40000 ALTER TABLE `DESTINOVOO` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ORIGEMVOO`
--

DROP TABLE IF EXISTS `ORIGEMVOO`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ORIGEMVOO` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `NOME` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ORIGEMVOO`
--

LOCK TABLES `ORIGEMVOO` WRITE;
/*!40000 ALTER TABLE `ORIGEMVOO` DISABLE KEYS */;
INSERT INTO `ORIGEMVOO` VALUES (1,'Shanghai'),(2,'Tokyo'),(3,'Mumbai'),(4,'São Paulo'),(5,'Lahore'),(6,'Cairo'),(7,'Jakarta');
/*!40000 ALTER TABLE `ORIGEMVOO` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `VOO`
--

DROP TABLE IF EXISTS `VOO`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `VOO` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `DATAVOO` date DEFAULT NULL,
  `DESTINO_ID` bigint(20) DEFAULT NULL,
  `ORIGEM_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_VOO_DESTINO_ID` (`DESTINO_ID`),
  KEY `FK_VOO_ORIGEM_ID` (`ORIGEM_ID`),
  CONSTRAINT `FK_VOO_DESTINO_ID` FOREIGN KEY (`DESTINO_ID`) REFERENCES `DESTINOVOO` (`ID`),
  CONSTRAINT `FK_VOO_ORIGEM_ID` FOREIGN KEY (`ORIGEM_ID`) REFERENCES `ORIGEMVOO` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `VOO`
--

LOCK TABLES `VOO` WRITE;
/*!40000 ALTER TABLE `VOO` DISABLE KEYS */;
INSERT INTO `VOO` VALUES (1,'2017-05-10',2,1),(2,'2017-05-10',3,2),(3,'2017-05-10',6,7),(4,'2017-05-10',3,2),(5,'2017-05-10',4,3),(6,'2017-05-11',5,4);
/*!40000 ALTER TABLE `VOO` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `VOO_AVIAO`
--

DROP TABLE IF EXISTS `VOO_AVIAO`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `VOO_AVIAO` (
  `voos_ID` bigint(20) NOT NULL,
  `avioes_ID` bigint(20) NOT NULL,
  PRIMARY KEY (`voos_ID`,`avioes_ID`),
  KEY `FK_VOO_AVIAO_avioes_ID` (`avioes_ID`),
  CONSTRAINT `FK_VOO_AVIAO_avioes_ID` FOREIGN KEY (`avioes_ID`) REFERENCES `AVIAO` (`ID`),
  CONSTRAINT `FK_VOO_AVIAO_voos_ID` FOREIGN KEY (`voos_ID`) REFERENCES `VOO` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `VOO_AVIAO`
--

LOCK TABLES `VOO_AVIAO` WRITE;
/*!40000 ALTER TABLE `VOO_AVIAO` DISABLE KEYS */;
INSERT INTO `VOO_AVIAO` VALUES (6,1),(5,2),(6,3),(5,4);
/*!40000 ALTER TABLE `VOO_AVIAO` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Voo_PASSAGEIROS`
--

DROP TABLE IF EXISTS `Voo_PASSAGEIROS`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Voo_PASSAGEIROS` (
  `DOCUMENTO` varchar(255) DEFAULT NULL,
  `NOME` varchar(255) DEFAULT NULL,
  `Voo_ID` bigint(20) DEFAULT NULL,
  KEY `FK_Voo_PASSAGEIROS_Voo_ID` (`Voo_ID`),
  CONSTRAINT `FK_Voo_PASSAGEIROS_Voo_ID` FOREIGN KEY (`Voo_ID`) REFERENCES `VOO` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Voo_PASSAGEIROS`
--

LOCK TABLES `Voo_PASSAGEIROS` WRITE;
/*!40000 ALTER TABLE `Voo_PASSAGEIROS` DISABLE KEYS */;
INSERT INTO `Voo_PASSAGEIROS` VALUES ('09809','Michael',3),('23984923','John',3),('3092823','Andy',4),('409583','Anton',4),('239482','Altair',5),('949384','Meire',5),('39408390','Ilda',6),('094358304','Macedonia',6);
/*!40000 ALTER TABLE `Voo_PASSAGEIROS` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-05-10 20:42:54

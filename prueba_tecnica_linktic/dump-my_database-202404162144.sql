-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: my_database
-- ------------------------------------------------------
-- Server version	8.3.0

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `amparos`
--

DROP TABLE IF EXISTS `amparos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `amparos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) DEFAULT NULL,
  `codigo` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `amparos`
--

LOCK TABLES `amparos` WRITE;
/*!40000 ALTER TABLE `amparos` DISABLE KEYS */;
INSERT INTO `amparos` VALUES (1,'Muerte accidental',1),(2,'Desmembración',2),(3,'Auxilio funerario',3),(4,'Renta vitalicia',4);
/*!40000 ALTER TABLE `amparos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `asegurados`
--

DROP TABLE IF EXISTS `asegurados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `asegurados` (
  `id` int NOT NULL AUTO_INCREMENT,
  `apellidos` varchar(255) DEFAULT NULL,
  `fecha_nacimiento` date DEFAULT NULL,
  `nombres` varchar(255) DEFAULT NULL,
  `numero_identificacion` varchar(255) DEFAULT NULL,
  `sexo` enum('MASCULINO','FEMENINO') DEFAULT NULL,
  `tipo_identificacion` enum('CC','CE') DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `asegurados`
--

LOCK TABLES `asegurados` WRITE;
/*!40000 ALTER TABLE `asegurados` DISABLE KEYS */;
INSERT INTO `asegurados` VALUES (1,'APELLIDO1','1945-01-10','NOMBRE1','79000001','MASCULINO','CC'),(2,'APELLIDO2','1950-01-10','NOMBRE2','79000002','MASCULINO','CC'),(3,'APELLIDO3','1955-01-10','NOMBRE3','79000003','MASCULINO','CC'),(4,'APELLIDO4','1960-01-10','NOMBRE4','51000001','FEMENINO','CE'),(5,'APELLIDO5','1965-01-10','NOMBRE5','51000002','FEMENINO','CE'),(6,'APELLIDO6','1970-01-10','NOMBRE6','51000003','FEMENINO','CE');
/*!40000 ALTER TABLE `asegurados` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `primas`
--

DROP TABLE IF EXISTS `primas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `primas` (
  `id` int NOT NULL AUTO_INCREMENT,
  `edad_maxima` int DEFAULT NULL,
  `edad_minima` int DEFAULT NULL,
  `porcentaje_prima` double DEFAULT NULL,
  `codigo` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKmw85e1wubb53fvp6otjg50ypd` (`codigo`),
  CONSTRAINT `FKmw85e1wubb53fvp6otjg50ypd` FOREIGN KEY (`codigo`) REFERENCES `amparos` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `primas`
--

LOCK TABLES `primas` WRITE;
/*!40000 ALTER TABLE `primas` DISABLE KEYS */;
INSERT INTO `primas` VALUES (1,45,18,0.02304,1),(2,75,46,0.02012,1),(3,50,18,0.1809,2),(4,70,51,0.16043,2),(5,60,18,0.14123,3),(6,70,61,0.1545,3),(7,50,18,0.12123,4),(8,70,51,0.1345,4);
/*!40000 ALTER TABLE `primas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'my_database'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-04-16 21:44:28

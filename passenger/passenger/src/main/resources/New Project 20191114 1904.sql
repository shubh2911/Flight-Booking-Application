-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.1.67-community


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema flightbooking
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ flightbooking;
USE flightbooking;

--
-- Table structure for table `flightbooking`.`flight`
--

DROP TABLE IF EXISTS `flight`;
CREATE TABLE `flight` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `booked_seat` int(11) NOT NULL,
  `dest` varchar(255) NOT NULL,
  `endtime` varchar(255) NOT NULL,
  `fare` int(11) NOT NULL,
  `hops` varchar(255) NOT NULL,
  `src` varchar(255) NOT NULL,
  `starttime` varchar(255) NOT NULL,
  `total_seats` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `flightbooking`.`flight`
--

/*!40000 ALTER TABLE `flight` DISABLE KEYS */;
INSERT INTO `flight` (`id`,`booked_seat`,`dest`,`endtime`,`fare`,`hops`,`src`,`starttime`,`total_seats`) VALUES 
 (1,3,'Mumbai','12.00 pm',5000,'2','Pune','7.00 am',3),
 (2,1,'Mumbai','12.00 pm',5000,'2','Pune','7.00 am',100),
 (3,0,'Delhi','12.00 pm',5000,'2','Pune','7.00 am',100);
/*!40000 ALTER TABLE `flight` ENABLE KEYS */;


--
-- Table structure for table `flightbooking`.`passenger`
--

DROP TABLE IF EXISTS `passenger`;
CREATE TABLE `passenger` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `bookingdate` varchar(255) NOT NULL,
  `bookingtime` varchar(255) NOT NULL,
  `flightid` bigint(20) NOT NULL,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `flightbooking`.`passenger`
--

/*!40000 ALTER TABLE `passenger` DISABLE KEYS */;
INSERT INTO `passenger` (`id`,`bookingdate`,`bookingtime`,`flightid`,`name`) VALUES 
 (1,'2019/10/18','21:04:21',1,'Dinesh'),
 (2,'2019-18-10','7:pm',1,'Dinesh'),
 (3,'2019-18-10','7:pm',1,'Ganesh'),
 (4,'2019-18-10','7:pm',2,'Ganesh');
/*!40000 ALTER TABLE `passenger` ENABLE KEYS */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

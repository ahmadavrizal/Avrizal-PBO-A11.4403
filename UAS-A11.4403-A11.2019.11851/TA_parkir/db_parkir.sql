-- phpMyAdmin SQL Dump
-- version 3.4.5
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jul 06, 2021 at 09:18 AM
-- Server version: 5.5.16
-- PHP Version: 5.3.8

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `db_parkir`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_parkir`
--

CREATE TABLE IF NOT EXISTS `tb_parkir` (
  `no_tiket` int(15) NOT NULL AUTO_INCREMENT,
  `no_pol` varchar(15) NOT NULL,
  `jenis` enum('Mobil','Motor') NOT NULL,
  `tgl_masuk` date NOT NULL,
  `tgl_keluar` date DEFAULT NULL,
  `jam_masuk` time NOT NULL,
  `jam_keluar` time DEFAULT NULL,
  `biaya` int(15) NOT NULL DEFAULT '0',
  PRIMARY KEY (`no_tiket`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=19 ;

--
-- Dumping data for table `tb_parkir`
--

INSERT INTO `tb_parkir` (`no_tiket`, `no_pol`, `jenis`, `tgl_masuk`, `tgl_keluar`, `jam_masuk`, `jam_keluar`, `biaya`) VALUES
(1, 'AD 1245 XA', 'Motor', '2017-05-27', '2017-05-28', '13:53:33', '11:23:50', 52000),
(2, 'AE 1404 ZY', 'Mobil', '2017-05-28', '2017-05-28', '00:27:50', '11:31:59', 16000),
(3, 'AB 1937 VX', 'Motor', '2017-05-28', '2017-05-28', '00:34:03', '11:36:37', 13000),
(4, 'DK 1394 BJ', 'Motor', '2017-05-28', '2017-05-28', '01:01:41', '11:25:36', 12000),
(5, 'AA 6574 VC', 'Motor', '2017-05-28', '2017-05-28', '11:28:11', '11:28:49', 2000),
(6, 'AE 5408 YZ', 'Motor', '2017-05-28', '2017-05-29', '11:35:22', '04:28:25', 52000),
(7, 'B 6543 AC', 'Mobil', '2017-05-28', '2017-06-04', '11:35:40', '22:59:35', 355000),
(8, 'H 1389 BZ', 'Motor', '2017-05-28', '2017-05-28', '11:35:59', '23:45:36', 14000),
(9, 'AE 2051 YQ', 'Motor', '2017-04-27', '2017-04-27', '02:03:04', '03:05:06', 3000),
(10, 'AE 3985 ZA', 'Motor', '2017-05-28', '2017-05-28', '14:22:04', '14:22:31', 2000),
(11, 'ZA 5421 BJ', 'Motor', '2017-05-29', NULL, '04:28:00', NULL, 0),
(12, 'AB 5964 NM', 'Mobil', '2017-05-29', NULL, '04:28:12', NULL, 0),
(13, 'AE 1234 ZA', 'Motor', '2017-05-29', '2017-05-29', '05:11:34', '05:34:43', 2000),
(14, 'AB 5432 BA', 'Mobil', '2017-05-29', '2017-05-29', '05:37:34', '06:41:56', 6000),
(15, 'H 5678 NH', 'Motor', '2017-05-29', '2017-05-29', '06:33:00', '06:33:23', 2000),
(16, 'AB 1234 ZZ', 'Motor', '2017-05-29', '2017-06-04', '07:04:02', '20:46:23', 302000),
(17, 'B 4568 ZA', 'Motor', '2017-06-04', NULL, '20:32:18', NULL, 0),
(18, 'AE 1234 ZE', 'Mobil', '2017-06-04', NULL, '22:15:01', NULL, 0);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

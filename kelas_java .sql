-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 18, 2020 at 03:05 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kelas_java`
--
CREATE DATABASE IF NOT EXISTS `kelas_java` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `kelas_java`;

-- --------------------------------------------------------

--
-- Table structure for table `data_siswa_kelas7`
--

CREATE TABLE IF NOT EXISTS `data_siswa_kelas7` (
  `id_siswa` int(11) NOT NULL,
  `first_name` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `nilai_ipa` int(3) DEFAULT NULL,
  `nilai_ips` int(3) DEFAULT NULL,
  `nilai_bhsind` int(3) DEFAULT NULL,
  `nilai_bhsing` int(3) DEFAULT NULL,
  `nilai_mat` int(3) DEFAULT NULL,
  `nilai_rata` double DEFAULT NULL,
  PRIMARY KEY (`id_siswa`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `data_siswa_kelas7`
--

INSERT INTO `data_siswa_kelas7` (`id_siswa`, `first_name`, `last_name`, `nilai_ipa`, `nilai_ips`, `nilai_bhsind`, `nilai_bhsing`, `nilai_mat`, `nilai_rata`) VALUES
(1, 'Aditya', 'Cahyo', 100, 100, 100, 100, 100, 100),
(2, 'Amanda', 'Pesulima', 90, 90, 90, 90, 90, 90),
(3, 'Bambang', 'Wibowo', 95, 90, 90, 90, 90, 91),
(4, 'Cornelius', 'Takar', 0, 0, 0, 0, 0, 0),
(5, 'Grace', 'Sinurat', 0, 0, 0, 0, 0, 0),
(6, 'Joshua', 'Gulo', 0, 0, 0, 0, 0, 0),
(7, 'Melati', 'Ratna', 0, 0, 0, 0, 0, 0),
(8, 'Natacha', 'Toisutta', 0, 0, 0, 0, 0, 0),
(9, 'Nathanael', 'Pekan', 0, 0, 0, 0, 0, 0),
(10, 'Putri', 'Batari', 0, 0, 0, 0, 0, 0),
(11, 'Rahman', 'Yohanes', 0, 0, 0, 0, 0, 0),
(12, 'Samuel', 'Sormin', 0, 0, 0, 0, 0, 0),
(13, 'Surya', 'Agus', 0, 0, 0, 0, 0, 0),
(14, 'Tobias', 'Bukit', 0, 0, 0, 0, 0, 0),
(15, 'Wahyu', 'Mahmud', 0, 0, 0, 0, 0, 0),
(16, 'Bambang', 'Rio', 90, 90, 90, 90, 90, 90);

-- --------------------------------------------------------

--
-- Table structure for table `data_siswa_kelas8`
--

CREATE TABLE IF NOT EXISTS `data_siswa_kelas8` (
  `id_siswa` int(11) NOT NULL,
  `first_name` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `nilai_ipa` int(3) DEFAULT NULL,
  `nilai_ips` int(3) DEFAULT NULL,
  `nilai_bhsind` int(3) DEFAULT NULL,
  `nilai_bhsing` int(3) DEFAULT NULL,
  `nilai_mat` int(3) DEFAULT NULL,
  `nilai_rata` double DEFAULT NULL,
  PRIMARY KEY (`id_siswa`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `data_siswa_kelas8`
--

INSERT INTO `data_siswa_kelas8` (`id_siswa`, `first_name`, `last_name`, `nilai_ipa`, `nilai_ips`, `nilai_bhsind`, `nilai_bhsing`, `nilai_mat`, `nilai_rata`) VALUES
(1, 'Abdul', 'Susilo', 0, 0, 0, 0, 0, 0),
(2, 'Aditya', 'Jusuf', 0, 0, 0, 0, 0, 0),
(3, 'Bethari', 'Wangi', 0, 0, 0, 0, 0, 0),
(4, 'Darma', 'Ahmad', 0, 0, 0, 0, 0, 0),
(5, 'Hasan', 'Susilo', 0, 0, 0, 0, 0, 0),
(6, 'Iskandar', 'Shinta', 0, 0, 0, 0, 0, 0),
(7, 'Krisna', 'Agung', 0, 0, 0, 0, 0, 0),
(8, 'Muhammad', 'Sri', 0, 0, 0, 0, 0, 0),
(9, 'Purnama', 'Taufik', 0, 0, 0, 0, 0, 0),
(10, 'Putra', 'Citra', 0, 0, 0, 0, 0, 0),
(11, 'Shinta', 'Citra', 0, 0, 0, 0, 0, 0),
(12, 'Suryo', 'Utari', 0, 0, 0, 0, 0, 0),
(13, 'Vina', 'Imran', 0, 0, 0, 0, 0, 0),
(14, 'Widya', 'Shinta', 0, 0, 0, 0, 0, 0),
(15, 'Yohanes', 'Ridwan', 0, 0, 0, 0, 0, 0),
(18, 'aa', 'aaaaa', 90, 90, 90, 90, 90, 90);

-- --------------------------------------------------------

--
-- Table structure for table `data_siswa_kelas9`
--

CREATE TABLE IF NOT EXISTS `data_siswa_kelas9` (
  `id_siswa` int(11) NOT NULL,
  `first_name` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `nilai_ipa` int(3) DEFAULT NULL,
  `nilai_to_ipa` int(3) DEFAULT NULL,
  `nilai_ips` int(3) DEFAULT NULL,
  `nilai_to_ips` int(3) DEFAULT NULL,
  `nilai_bhsind` int(3) DEFAULT NULL,
  `nilai_to_bhsind` int(3) DEFAULT NULL,
  `nilai_bhsing` int(3) DEFAULT NULL,
  `nilai_to_bhsing` int(3) DEFAULT NULL,
  `nilai_mat` int(3) DEFAULT NULL,
  `nilai_to_mat` int(3) DEFAULT NULL,
  `nilai_rata` double DEFAULT NULL,
  `nilai_rata_to` double DEFAULT NULL,
  PRIMARY KEY (`id_siswa`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `data_siswa_kelas9`
--

INSERT INTO `data_siswa_kelas9` (`id_siswa`, `first_name`, `last_name`, `nilai_ipa`, `nilai_to_ipa`, `nilai_ips`, `nilai_to_ips`, `nilai_bhsind`, `nilai_to_bhsind`, `nilai_bhsing`, `nilai_to_bhsing`, `nilai_mat`, `nilai_to_mat`, `nilai_rata`, `nilai_rata_to`) VALUES
(1, 'Anisa', 'Ridwan', 95, 95, 95, 95, 95, 95, 95, 95, 95, 95, NULL, NULL),
(2, 'Arif', 'Yohanes', 100, 95, 30, 35, 75, 70, 90, 100, 100, 35, NULL, NULL),
(3, 'Bambang', 'Setiawan', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, NULL, NULL),
(4, 'Budi', 'Cepat', 10, 95, 30, 35, 75, 70, 90, 100, 100, 35, NULL, NULL),
(5, 'Eko', 'Setiawan', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, NULL, NULL),
(6, 'Fatimah', 'Sari', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, NULL, NULL),
(7, 'Ismail', 'Wati', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, NULL, NULL),
(8, 'Kevin', 'Wilma', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, NULL, NULL),
(9, 'Mawar', 'Wayan', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, NULL, NULL),
(10, 'Putri', 'Faisal', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, NULL, NULL),
(11, 'Sari', 'Aminah', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, NULL, NULL),
(12, 'Slamet', 'Gusti', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, NULL, NULL),
(13, 'Tri', 'Anwar', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, NULL, NULL),
(14, 'Wibawa', 'Cahaya', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, NULL, NULL),
(15, 'Yuda', 'Wahyu', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, NULL, NULL),
(16, 'bb', 'bb', 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80);

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE IF NOT EXISTS `login` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(35) NOT NULL,
  `password` varchar(35) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`id`, `username`, `password`) VALUES
(1, 'admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(32) NOT NULL,
  `fullname` varchar(32) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

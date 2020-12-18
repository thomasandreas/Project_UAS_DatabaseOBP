-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 11, 2020 at 11:57 AM
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

CREATE TABLE `data_siswa_kelas7` (
  `id_siswa` int(11) NOT NULL,
  `first_name` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `nilai_ipa` int(3) DEFAULT NULL,
  `nilai_ips` int(3) DEFAULT NULL,
  `nilai_bhsind` int(3) DEFAULT NULL,
  `nilai_bhsing` int(3) DEFAULT NULL,
  `nilai_mat` int(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `data_siswa_kelas7`
--

INSERT INTO `data_siswa_kelas7` (`id_siswa`, `first_name`, `last_name`, `nilai_ipa`, `nilai_ips`, `nilai_bhsind`, `nilai_bhsing`, `nilai_mat`) VALUES
(1, 'Aditya', 'Cahyo', 0, 0, 0, 0, 0),
(2, 'Amanda', 'Pesulima', 0, 0, 0, 0, 0),
(3, 'Bambang', 'Wibowo', 0, 0, 0, 0, 0),
(4, 'Cornelius', 'Takar', 0, 0, 0, 0, 0),
(5, 'Grace', 'Sinurat', 0, 0, 0, 0, 0),
(6, 'Joshua', 'Gulo', 0, 0, 0, 0, 0),
(7, 'Melati', 'Ratna', 0, 0, 0, 0, 0),
(8, 'Natacha', 'Toisutta', 0, 0, 0, 0, 0),
(9, 'Nathanael', 'Pekan', 0, 0, 0, 0, 0),
(10, 'Putri', 'Batari', 0, 0, 0, 0, 0),
(11, 'Rahman', 'Yohanes', 0, 0, 0, 0, 0),
(12, 'Samuel', 'Sormin', 0, 0, 0, 0, 0),
(13, 'Surya', 'Agus', 0, 0, 0, 0, 0),
(14, 'Tobias', 'Bukit', 0, 0, 0, 0, 0),
(15, 'Wahyu', 'Mahmud', 0, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `data_siswa_kelas8`
--

CREATE TABLE `data_siswa_kelas8` (
  `id_siswa` int(11) NOT NULL,
  `first_name` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `nilai_ipa` int(3) DEFAULT NULL,
  `nilai_ips` int(3) DEFAULT NULL,
  `nilai_bhsind` int(3) DEFAULT NULL,
  `nilai_bhsing` int(3) DEFAULT NULL,
  `nilai_mat` int(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `data_siswa_kelas8`
--

INSERT INTO `data_siswa_kelas8` (`id_siswa`, `first_name`, `last_name`, `nilai_ipa`, `nilai_ips`, `nilai_bhsind`, `nilai_bhsing`, `nilai_mat`) VALUES
(1, 'Abdul', 'Susilo', 0, 0, 0, 0, 0),
(2, 'Aditya', 'Jusuf', 0, 0, 0, 0, 0),
(3, 'Bethari', 'Wangi', 0, 0, 0, 0, 0),
(4, 'Darma', 'Ahmad', 0, 0, 0, 0, 0),
(5, 'Hasan', 'Susilo', 0, 0, 0, 0, 0),
(6, 'Iskandar', 'Shinta', 0, 0, 0, 0, 0),
(7, 'Krisna', 'Agung', 0, 0, 0, 0, 0),
(8, 'Muhammad', 'Sri', 0, 0, 0, 0, 0),
(9, 'Purnama', 'Taufik', 0, 0, 0, 0, 0),
(10, 'Putra', 'Citra', 0, 0, 0, 0, 0),
(11, 'Shinta', 'Citra', 0, 0, 0, 0, 0),
(12, 'Suryo', 'Utari', 0, 0, 0, 0, 0),
(13, 'Vina', 'Imran', 0, 0, 0, 0, 0),
(14, 'Widya', 'Shinta', 0, 0, 0, 0, 0),
(15, 'Yohanes', 'Ridwan', 0, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `data_siswa_kelas9`
--

CREATE TABLE `data_siswa_kelas9` (
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
  `nilai_to_mat` int(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `data_siswa_kelas9`
--

INSERT INTO `data_siswa_kelas9` (`id_siswa`, `first_name`, `last_name`, `nilai_ipa`, `nilai_to_ipa`, `nilai_ips`, `nilai_to_ips`, `nilai_bhsind`, `nilai_to_bhsind`, `nilai_bhsing`, `nilai_to_bhsing`, `nilai_mat`, `nilai_to_mat`) VALUES
(1, 'Anisa', 'Ridwan', 95, 95, 95, 95, 95, 95, 95, 95, 95, 95),
(2, 'Arif', 'Yohanes', 100, 95, 30, 35, 75, 70, 90, 100, 100, 35),
(3, 'Bambang', 'Setiawan', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(4, 'Budi', 'Cepat', 10, 95, 30, 35, 75, 70, 90, 100, 100, 35),
(5, 'Eko', 'Setiawan', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(6, 'Fatimah', 'Sari', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(7, 'Ismail', 'Wati', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(8, 'Kevin', 'Wilma', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(9, 'Mawar', 'Wayan', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(10, 'Putri', 'Faisal', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(11, 'Sari', 'Aminah', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(12, 'Slamet', 'Gusti', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(13, 'Tri', 'Anwar', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(14, 'Wibawa', 'Cahaya', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(15, 'Yuda', 'Wahyu', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `employees`
--

CREATE TABLE `employees` (
  `id` int(11) NOT NULL,
  `fullname` varchar(50) NOT NULL,
  `gender` varchar(20) NOT NULL,
  `position` varchar(50) NOT NULL,
  `salary` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `employees`
--

INSERT INTO `employees` (`id`, `fullname`, `gender`, `position`, `salary`) VALUES
(1, 'Alice', 'Female', 'Director', 4500),
(2, 'Bob', 'Male', 'Operation Manager', 3500),
(3, 'Charlie', 'Male', 'Finance Manager', 3500),
(4, 'Dean', 'Male', 'Staff', 2000),
(5, 'Eve', 'Female', 'Staff', 2000);

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `id` int(11) NOT NULL,
  `username` varchar(35) NOT NULL,
  `password` varchar(35) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`id`, `username`, `password`) VALUES
(1, 'admin', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `data_siswa_kelas7`
--
ALTER TABLE `data_siswa_kelas7`
  ADD PRIMARY KEY (`id_siswa`);

--
-- Indexes for table `data_siswa_kelas8`
--
ALTER TABLE `data_siswa_kelas8`
  ADD PRIMARY KEY (`id_siswa`);

--
-- Indexes for table `data_siswa_kelas9`
--
ALTER TABLE `data_siswa_kelas9`
  ADD PRIMARY KEY (`id_siswa`);

--
-- Indexes for table `employees`
--
ALTER TABLE `employees`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `employees`
--
ALTER TABLE `employees`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

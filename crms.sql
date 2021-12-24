-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 02, 2021 at 03:03 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 7.3.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `crms`
--

-- --------------------------------------------------------

--
-- Table structure for table `car`
--

CREATE TABLE `car` (
  `id` int(11) NOT NULL,
  `car_no` varchar(5) NOT NULL,
  `car_reg_no` varchar(10) NOT NULL,
  `Brand` varchar(15) NOT NULL,
  `Model` varchar(50) NOT NULL,
  `Available` varchar(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `car`
--

INSERT INTO `car` (`id`, `car_no`, `car_reg_no`, `Brand`, `Model`, `Available`) VALUES
(1, 'A0001', 'MH01JL3003', 'Honda', 'Lazy', 'No'),
(3, 'A0002', 'MH51R7558', 'Honda', 'Etios', 'Yes'),
(4, 'A0003', 'MH05HK2453', 'Hundai', 'iON', 'Yes'),
(7, 'A0005', 'MH05HG2312', 'Hundai', 'i20', 'Yes'),
(8, 'A0006', 'MH05RR6969', 'Ford', 'EcoSport', 'No'),
(9, 'A0007', 'MH02JK2345', 'Maruti Suzuki', 'Alto', 'No'),
(18, 'A0004', 'MH12GF2345', 'Honda', 'Civic', 'Yes'),
(39, 'A0008', 'MH27GH7890', 'Tata', 'Nano', 'Yes');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `id` int(11) NOT NULL,
  `customer_id` int(5) NOT NULL,
  `customer_name` varchar(25) NOT NULL,
  `mobile` bigint(12) NOT NULL,
  `email` varchar(50) NOT NULL,
  `address` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`id`, `customer_id`, `customer_name`, `mobile`, `email`, `address`) VALUES
(1, 1001, 'Kirito', 9876543210, 'kirito@gmail.com', 'BTM Layout, Bangalore'),
(2, 1002, 'Asuna', 1234567890, 'asuna@gmail.com', 'Tavarekere , Bangalore 560029'),
(3, 1003, 'Naruto', 7894563210, 'naruto@gmail.com', 'Marathalli, Bangalore 560103'),
(4, 1004, 'Praveen', 8553400662, 'praveen@gmail.com', 'BTM layout'),
(5, 1005, 'Akash', 789456123, 'as@gmail.com', 'dsfcsdf'),
(6, 1006, 'Chinmay', 7028258752, 'chinmay@test.com', 'PCMC'),
(15, 1007, 'Pratik', 7984568514, 'pratik@test.com', 'Gujrat'),
(16, 1008, 'Gaurav', 4852158962, 'gaurav@test.com', 'Nashik');

-- --------------------------------------------------------

--
-- Table structure for table `rent`
--

CREATE TABLE `rent` (
  `id` int(11) NOT NULL,
  `car_no` varchar(10) NOT NULL,
  `customer_id` int(5) NOT NULL,
  `fee` int(6) NOT NULL,
  `rent_date` varchar(15) NOT NULL,
  `due_date` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `rent`
--

INSERT INTO `rent` (`id`, `car_no`, `customer_id`, `fee`, `rent_date`, `due_date`) VALUES
(10, 'A0001', 1002, 500, '30-08-2021', '31-08-2021'),
(11, 'A0006', 1003, 500, '2021-09-01', '2021-09-01'),
(15, 'A0007', 1003, 500, '2021-09-09', '2021-09-10'),
(21, 'A0001', 1006, 700, '2021-12-02', '2021-12-09'),
(23, 'A0001', 1006, 700, '2021-12-02', '2021-12-09');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `car`
--
ALTER TABLE `car`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `rent`
--
ALTER TABLE `rent`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `car`
--
ALTER TABLE `car`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=40;

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `rent`
--
ALTER TABLE `rent`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

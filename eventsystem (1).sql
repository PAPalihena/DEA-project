-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 23, 2020 at 07:57 PM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `eventsystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `commentbox`
--

CREATE TABLE `commentbox` (
  `id` int(100) NOT NULL,
  `fullname` text NOT NULL,
  `email` text NOT NULL,
  `comment` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `commentbox`
--

INSERT INTO `commentbox` (`id`, `fullname`, `email`, `comment`) VALUES
(1, 'E.K.D.O.P.karunarathne', 'osdakarunarathne@gmail.com', 'good service. thank you'),
(2, 'Praveen Palihena', 'palihena.praveen@gmail.com', ' Nice. '),
(3, 'Vimukthi Nimesh', 'VimuNEMh@gmail.com', 'quick service and quality '),
(5, 'M.S.D.ERushan', 'rushanisri@gmail.com', 'good service');

-- --------------------------------------------------------

--
-- Table structure for table `event`
--

CREATE TABLE `event` (
  `id` int(11) NOT NULL,
  `username` varchar(20) NOT NULL,
  `type` varchar(20) NOT NULL,
  `budget` varchar(50) NOT NULL,
  `contactno` varchar(12) NOT NULL,
  `address` varchar(100) NOT NULL,
  `dueDate` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `event`
--

INSERT INTO `event` (`id`, `username`, `type`, `budget`, `contactno`, `address`, `dueDate`) VALUES
(1, 'abc', 'Birthday Party', '1000000', '072-4346565', 'adsasdfasdgasdgasdg', '2020/09/03'),
(2, 'abc', 'Bridal Show', '31000', '1213231123', 'bsfsfgnsfgnsfgn', '2020/10/09'),
(3, 'abc', 'Bridal Show', '31000', '1213231123', 'bsfsfgnsfgnsfgn', '2020/10/09'),
(4, 'abc', 'Bridal Show', '31000', '1213231123', 'bsfsfgnsfgnsfgn', '2020/10/09'),
(5, 'abc', 'Halloween Party', '34333', '1213231123', 'bsfsfgnsfgnsfgn', '2020/10/09'),
(6, 'abc', 'Batch Party', '44000', '1213231123', 'bsfsfgnsfgnsfgn', '2020/10/09'),
(7, 'abc', 'Bridal Show', '31000', '1213231123', 'bsfsfgnsfgnsfgn', '2020/10/09'),
(8, 'null', 'Birthday Party', '42222', '1213231123', '', ''),
(9, 'abc', 'Birthday Party', '25000', '1213231123', 'bsfsfgnsfgnsfgn', '2020/10/09'),
(10, 'abc', 'Batch Party', '44000', '1234567', 'no.23 , mr road,kandy', '2020/10/09');

-- --------------------------------------------------------

--
-- Table structure for table `pricing`
--

CREATE TABLE `pricing` (
  `component` varchar(50) NOT NULL,
  `price` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pricing`
--

INSERT INTO `pricing` (`component`, `price`) VALUES
('balloons', '1000'),
('photography', '10000'),
('Music', '20000'),
('Lightning', '3000'),
('Food', '20000'),
('Drinks', '1000'),
('Photography', '30000'),
('Games', '3000'),
('decorations', '3000'),
('Gas Balloons', '1000'),
('Painting', '2000'),
('Magic', '5000'),
('Music', '12321'),
('Candies', '22222'),
('Bounzers', '33333'),
('Face Printing', '4000'),
('Food and Beverages', '30000'),
('Magic show', '3000'),
('Decoration', '1121'),
('Beverages', '30000'),
('Horror movies', '1333'),
('Spooky Music', '4244'),
('Candles', '1666'),
('Consumers', '4770');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `fname` varchar(20) NOT NULL,
  `lname` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`fname`, `lname`, `email`, `username`, `password`) VALUES
('VIMUKTHI', '', '', '', ''),
('praveen', 'palihena', 'dsafdfaf2gmai.com', 'abc', '123'),
('Enoch', 'Palihena', 'palihena.enoch@gmail.com', 'enoc', '4321'),
('hggjj', 'jknjknk', 'jkvvkhvhkgv', 'ert', '654'),
('fdhsh', 'hgfdjdfj', 'gdfjdjdj', 'fgjdfj', 'dgkhdgkjh'),
('fg', 'kjkb', 'xdfxf', 'hjhgjg65', '765'),
('we', 'rt', 'ytryr', 'sfgsfg', '467'),
('Tiruni', 'Karunarathne', 'tirukarunaratne@gmail.com', 'tpk', '321'),
('VIMUKTHI', 'Nimesh', 'aaa@s.com', 'Vimu', '111'),
('fgdhdhhgj', 'gdfhdfgh', 'gdfjdhjdhj', 'vxcbx', 'sbgsbsf');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `commentbox`
--
ALTER TABLE `commentbox`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `event`
--
ALTER TABLE `event`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `commentbox`
--
ALTER TABLE `commentbox`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `event`
--
ALTER TABLE `event`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

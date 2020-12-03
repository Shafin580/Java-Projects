-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 22, 2019 at 12:50 AM
-- Server version: 10.3.16-MariaDB
-- PHP Version: 7.3.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `free_slot_schedule`
--

-- --------------------------------------------------------

--
-- Table structure for table `faculty`
--

CREATE TABLE `faculty` (
  `ID` int(15) NOT NULL,
  `Name` varchar(15) NOT NULL,
  `pass` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `faculty`
--

INSERT INTO `faculty` (`ID`, `Name`, `pass`) VALUES
(163, 'Rezwan', '456'),
(165, 'Shahriar', '466');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `ID` varchar(10) NOT NULL,
  `Name` varchar(15) NOT NULL,
  `CGPA` float(3,2) NOT NULL,
  `Semester` varchar(4) NOT NULL,
  `Dept` varchar(5) NOT NULL,
  `pass` varchar(30) NOT NULL,
  `Serial` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`ID`, `Name`, `CGPA`, `Semester`, `Dept`, `pass`, `Serial`) VALUES
('18-36467-1', 'shafin', 3.80, '5th', 'CSE', '123', 1),
('18-36467-2', 'shafin2', 3.64, '5th', 'CSE', '124', 2),
('18-36467-3', 'shafin3', 3.70, '5th', 'CSE', '125', 3),
('18-36467-4', 'shafin4', 3.80, '5th', 'CSE', '126', 4),
('18-36467-5', 'shafin5', 3.90, '5th', 'CSE', '127', 5),
('18-36467-6', 'shafin6', 3.80, '5th', 'CSE', '128', 6),
('18-36467-7', 'shafin7', 3.80, '5th', 'CSE', '129', 7),
('18-36467-8', 'shafin8', 3.64, '5th', 'CSE', '130', 8);

-- --------------------------------------------------------

--
-- Table structure for table `volunteer`
--

CREATE TABLE `volunteer` (
  `ID` varchar(10) NOT NULL,
  `Name` varchar(15) NOT NULL,
  `pass` varchar(30) NOT NULL,
  `Time_slot` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `volunteer`
--

INSERT INTO `volunteer` (`ID`, `Name`, `pass`, `Time_slot`) VALUES
('18-36555-1', 'Toishi', '788', '10:00 AM-11:00 AM'),
('18-36757-1', 'Sami', '789', '11:00 AM-12:00 PM');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `faculty`
--
ALTER TABLE `faculty`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`Serial`) USING BTREE,
  ADD UNIQUE KEY `ID` (`ID`) USING BTREE;

--
-- Indexes for table `volunteer`
--
ALTER TABLE `volunteer`
  ADD PRIMARY KEY (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

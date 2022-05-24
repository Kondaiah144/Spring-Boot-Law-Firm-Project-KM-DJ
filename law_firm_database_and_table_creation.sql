CREATE DATABASE  IF NOT EXISTS `law_firm_registry`;
USE `law_firm_registry`;
--
-- Table structure for table `law-firm`
--
DROP TABLE IF EXISTS `law-firm`;
CREATE TABLE `law-firm` (
  `firm_id` int(11) NOT NULL AUTO_INCREMENT,
  `firm_reg_number` int(20) DEFAULT NULL,
  `firm_name` varchar(45) DEFAULT NULL, 
  `firm_address` varchar(45) DEFAULT NULL, 
  `state` varchar(45) DEFAULT NULL, 
  `firm_category` varchar(45) DEFAULT NULL, 
  `open_hr` varchar(45) DEFAULT NULL, 
  `close_hr` varchar(45) DEFAULT NULL, 
  `firm_email` varchar(45) DEFAULT NULL,
  `firm_contact_no` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`firm_id`)
);

INSERT INTO `law-firm` VALUES 
(192476349,'6979159465', 'DJ law firm', '234, main street, danger dr','VA', '9 am', '5 pm', 'dj.lawfirm@lawcare.com', '868365982')

-- Table structure for table `client`
--
DROP TABLE IF EXISTS `client`;
CREATE TABLE `client` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `client_name` int(20) DEFAULT NULL,
  `firm_category` varchar(45) DEFAULT NULL, 
  `email` varchar(45) DEFAULT NULL, 
  `gender` varchar(45) DEFAULT NULL, 
  `city` varchar(45) DEFAULT NULL, 
  `state` varchar(45) DEFAULT NULL,
  `country` varchar(45) DEFAULT NULL,
  `zip_code` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`client`)
);

INSERT INTO `client` VALUES 
(1,'Kondaiah ', 'Business Law', 'km@gmail.com','male', 'McLean', 'VA', 'USA', '22301')
CREATE SCHEMA IF NOT EXISTS `NativeDB` DEFAULT CHARACTER SET latin1 ;
-- -----------------------------------------------------
-- Schema nativedb
-- -----------------------------------------------------
USE `NativeDB` ;
--

--
-- Table structure for table `module`
--

CREATE TABLE `module` (
  `id_module` int(11) NOT NULL,
  `path` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `parents_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_module`),
  KEY `parents_id` (`parents_id`),
  CONSTRAINT `module_ibfk_1` FOREIGN KEY (`parents_id`) REFERENCES `module` (`id_module`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


--
-- Table structure for table `group`
--
CREATE TABLE `group` (
  `id_group` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `module_id_module` int(11) NOT NULL,
  PRIMARY KEY (`id_group`),
  KEY `fk_group_module1_idx` (`module_id_module`),
  CONSTRAINT `fk_group_module1` FOREIGN KEY (`module_id_module`) REFERENCES `module` (`id_module`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id_user` int(11) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `password` varchar(255) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `date_of_birth` date DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `phone` int(11) DEFAULT NULL,
  `username` varchar(255) NOT NULL,
  `group_id_group` int(11) NOT NULL,
  `frecuency_of_use` varchar(15) DEFAULT NULL,
  `status_user` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id_user`),
  KEY `fk_user_group1_idx` (`group_id_group`),
  CONSTRAINT `fk_user_group1` FOREIGN KEY (`group_id_group`) REFERENCES `group` (`id_group`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Table structure for table `category`
--


CREATE TABLE `category` (
  `id_category` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `value` int(11) DEFAULT NULL,
  `parents_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_category`),
  KEY `parents_id` (`parents_id`),
  CONSTRAINT `category_ibfk_1` FOREIGN KEY (`parents_id`) REFERENCES `category` (`id_category`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


--
-- Table structure for table `clasification`
--

CREATE TABLE `clasification` (
  `id_clasification` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `description` longtext,
  PRIMARY KEY (`id_clasification`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


--
-- Table structure for table `feedback`
--

CREATE TABLE `feedback` (
  `id_feedback` int(11) NOT NULL,
  `clasification_id_clasification` int(11) NOT NULL,
  `user_id_user` int(11) NOT NULL,
  `comment` longtext,
  PRIMARY KEY (`id_feedback`),
  KEY `fk_feedback_clasification1_idx` (`clasification_id_clasification`),
  KEY `fk_feedback_user1_idx` (`user_id_user`),
  CONSTRAINT `fk_feedback_clasification1` FOREIGN KEY (`clasification_id_clasification`) REFERENCES `clasification` (`id_clasification`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_feedback_user1` FOREIGN KEY (`user_id_user`) REFERENCES `user` (`id_user`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;




--
-- Table structure for table `localization`
--

CREATE TABLE `localization` (
  `id_localization` int(11) NOT NULL,
  `length` varchar(255) DEFAULT NULL,
  `altitude` varchar(255) DEFAULT NULL,
  `user_id_user` int(11) NOT NULL,
  PRIMARY KEY (`id_localization`),
  KEY `fk_localization_user1_idx` (`user_id_user`),
  CONSTRAINT `fk_localization_user1` FOREIGN KEY (`user_id_user`) REFERENCES `user` (`id_user`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


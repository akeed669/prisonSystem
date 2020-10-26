create database hellsPrison;
GRANT ALL PRIVILEGES ON hellsPrison.* TO 'ENTER_YOUR_USERNAME';
use hellsPrisonTest;


CREATE TABLE `guards` (
  `guardId` int(11) NOT NULL AUTO_INCREMENT,
  `fName` varchar(70) NOT NULL,
  `lName` varchar(70) NOT NULL,
  `prisonArea` varchar(70) NOT NULL,
  `username` varchar(255) NOT NULL,
  `passphrase` varchar(255) NOT NULL,
  `Weapon` varchar(255) NOT NULL,
  PRIMARY KEY (`guardId`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `guardassignment` (
  `assignmentID` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `assignmentType` varchar(255) NOT NULL,
  `assignmentDescription` varchar(255) NOT NULL,
  `assignmentDate` date NOT NULL,
  PRIMARY KEY (`assignmentID`),
  KEY `username` (`username`),
  CONSTRAINT `guardassignment_ibfk_1` FOREIGN KEY (`username`) REFERENCES `guards` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `guardmessage` (
  `messageID` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `messageDescription` varchar(255) NOT NULL,
  `searchDate` date NOT NULL,
  PRIMARY KEY (`messageID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `inmates` (
  `inmateId` int(11) NOT NULL AUTO_INCREMENT,
  `fName` varchar(70) DEFAULT NULL,
  `lName` varchar(70) DEFAULT NULL,
  `inmateGender` varchar(7) NOT NULL,
  `cellBlock` varchar(5) NOT NULL,
  `inmateStatus` varchar(255) DEFAULT NULL,
  `username` varchar(255) NOT NULL,
  `passphrase` varchar(255) NOT NULL,
  PRIMARY KEY (`inmateId`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=62 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `inmatejob` (
  `jobID` int(11) NOT NULL AUTO_INCREMENT,
  `jobCategory` varchar(255) NOT NULL,
  `jobDescription` varchar(255) NOT NULL,
  `assignmentDate` date NOT NULL,
  `username` varchar(255) NOT NULL,
  PRIMARY KEY (`jobID`),
  KEY `username` (`username`),
  CONSTRAINT `inmatejob_ibfk_1` FOREIGN KEY (`username`) REFERENCES `inmates` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `inmatenotes1` (
  `noteID` int(11) NOT NULL AUTO_INCREMENT,
  `noteDescription` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `guardName` varchar(255) NOT NULL,
  PRIMARY KEY (`noteID`),
  KEY `username` (`username`),
  KEY `guardName` (`guardName`),
  CONSTRAINT `inmatenotes1_ibfk_1` FOREIGN KEY (`username`) REFERENCES `inmates` (`username`),
  CONSTRAINT `inmatenotes1_ibfk_2` FOREIGN KEY (`guardName`) REFERENCES `guards` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `inmatepunishment2` (
  `punishmentID` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `punishmentType` varchar(255) NOT NULL,
  `punishmentDate` date NOT NULL,
  `punishmentSeverity` varchar(255) NOT NULL,
  PRIMARY KEY (`punishmentID`),
  KEY `username` (`username`),
  CONSTRAINT `inmatepunishment2_ibfk_1` FOREIGN KEY (`username`) REFERENCES `inmates` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `warden` (
  `username` varchar(255) NOT NULL,
  `passphrase` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


INSERT INTO `hellsprisontest`.`warden`
(`username`,
`passphrase`)
VALUES
('admin','admin');

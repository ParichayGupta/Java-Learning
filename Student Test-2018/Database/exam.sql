/*
SQLyog - Free MySQL GUI v5.17
Host - 5.0.17-nt : Database - exam
*********************************************************************
Server version : 5.0.17-nt
*/

SET NAMES utf8;

SET SQL_MODE='';

create database if not exists `exam`;

USE `exam`;

SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO';

/*Table structure for table `2018034reg` */

DROP TABLE IF EXISTS `2018034reg`;

CREATE TABLE `2018034reg` (
  `SUB` varchar(20) default NULL,
  `ATT` varchar(20) default NULL,
  `WAN` varchar(20) default NULL,
  `MARK` varchar(20) default NULL,
  `TOTAL` varchar(20) default NULL,
  `TIME` varchar(20) default NULL,
  `ACC` varchar(20) default NULL,
  `DATE` varchar(20) default NULL,
  `STTIME` varchar(20) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `2018034reg` */

insert into `2018034reg` (`SUB`,`ATT`,`WAN`,`MARK`,`TOTAL`,`TIME`,`ACC`,`DATE`,`STTIME`) values ('c','12','4','80','100','00:31 mm:ss','80 %','27/03/2018','08:58 PM');
insert into `2018034reg` (`SUB`,`ATT`,`WAN`,`MARK`,`TOTAL`,`TIME`,`ACC`,`DATE`,`STTIME`) values ('java','6','1','50','70','00:18 mm:ss','71 %','27/03/2018','10:23 PM');
insert into `2018034reg` (`SUB`,`ATT`,`WAN`,`MARK`,`TOTAL`,`TIME`,`ACC`,`DATE`,`STTIME`) values ('java','5','2','30','80','00:20 mm:ss','37 %','07/04/2018','12:26 PM');
insert into `2018034reg` (`SUB`,`ATT`,`WAN`,`MARK`,`TOTAL`,`TIME`,`ACC`,`DATE`,`STTIME`) values ('ques','14','4','100','120','00:50 mm:ss','83 %','19/04/2018','05:20 PM');
insert into `2018034reg` (`SUB`,`ATT`,`WAN`,`MARK`,`TOTAL`,`TIME`,`ACC`,`DATE`,`STTIME`) values ('ques','0','0','0','120','00:4 mm:ss','0 %','20/04/2018','12:16 AM');
insert into `2018034reg` (`SUB`,`ATT`,`WAN`,`MARK`,`TOTAL`,`TIME`,`ACC`,`DATE`,`STTIME`) values ('jscript','0','0','0','20','00:1 mm:ss','0 %','20/04/2018','12:18 AM');

/*Table structure for table `2018035reg` */

DROP TABLE IF EXISTS `2018035reg`;

CREATE TABLE `2018035reg` (
  `SUB` varchar(20) default NULL,
  `ATT` varchar(20) default NULL,
  `WAN` varchar(20) default NULL,
  `MARK` varchar(20) default NULL,
  `TOTAL` varchar(20) default NULL,
  `TIME` varchar(20) default NULL,
  `ACC` varchar(20) default NULL,
  `DATE` varchar(20) default NULL,
  `STTIME` varchar(20) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `2018035reg` */

insert into `2018035reg` (`SUB`,`ATT`,`WAN`,`MARK`,`TOTAL`,`TIME`,`ACC`,`DATE`,`STTIME`) values ('java','3','0','30','70','00:11 mm:ss','42 %','01/04/2018','08:34 PM');

/*Table structure for table `2018036reg` */

DROP TABLE IF EXISTS `2018036reg`;

CREATE TABLE `2018036reg` (
  `SUB` varchar(20) default NULL,
  `ATT` varchar(20) default NULL,
  `WAN` varchar(20) default NULL,
  `MARK` varchar(20) default NULL,
  `TOTAL` varchar(20) default NULL,
  `TIME` varchar(20) default NULL,
  `ACC` varchar(20) default NULL,
  `DATE` varchar(20) default NULL,
  `STTIME` varchar(20) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `2018036reg` */

insert into `2018036reg` (`SUB`,`ATT`,`WAN`,`MARK`,`TOTAL`,`TIME`,`ACC`,`DATE`,`STTIME`) values ('c','1','1','0','100','00:19 mm:ss','0 %','16/04/2018','03:43 PM');
insert into `2018036reg` (`SUB`,`ATT`,`WAN`,`MARK`,`TOTAL`,`TIME`,`ACC`,`DATE`,`STTIME`) values ('java','8','3','50','80','00:22 mm:ss','62 %','16/04/2018','04:17 PM');

/*Table structure for table `2018038reg` */

DROP TABLE IF EXISTS `2018038reg`;

CREATE TABLE `2018038reg` (
  `SUB` varchar(20) default NULL,
  `ATT` varchar(20) default NULL,
  `WAN` varchar(20) default NULL,
  `MARK` varchar(20) default NULL,
  `TOTAL` varchar(20) default NULL,
  `TIME` varchar(20) default NULL,
  `ACC` varchar(20) default NULL,
  `DATE` varchar(20) default NULL,
  `STTIME` varchar(20) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `2018038reg` */

insert into `2018038reg` (`SUB`,`ATT`,`WAN`,`MARK`,`TOTAL`,`TIME`,`ACC`,`DATE`,`STTIME`) values ('java','8','3','50','80','00:12 mm:ss','62 %','20/04/2018','04:11 PM');
insert into `2018038reg` (`SUB`,`ATT`,`WAN`,`MARK`,`TOTAL`,`TIME`,`ACC`,`DATE`,`STTIME`) values ('c','11','3','80','100','00:30 mm:ss','80 %','20/04/2018','04:11 PM');
insert into `2018038reg` (`SUB`,`ATT`,`WAN`,`MARK`,`TOTAL`,`TIME`,`ACC`,`DATE`,`STTIME`) values ('jscript','2','2','0','20','00:5 mm:ss','0 %','20/04/2018','04:12 PM');
insert into `2018038reg` (`SUB`,`ATT`,`WAN`,`MARK`,`TOTAL`,`TIME`,`ACC`,`DATE`,`STTIME`) values ('ques','12','2','100','120','00:43 mm:ss','83 %','20/04/2018','04:12 PM');
insert into `2018038reg` (`SUB`,`ATT`,`WAN`,`MARK`,`TOTAL`,`TIME`,`ACC`,`DATE`,`STTIME`) values ('js','1','0','10','10','00:10 mm:ss','100 %','20/04/2018','04:52 PM');

/*Table structure for table `2018039reg` */

DROP TABLE IF EXISTS `2018039reg`;

CREATE TABLE `2018039reg` (
  `SUB` varchar(20) default NULL,
  `ATT` varchar(20) default NULL,
  `WAN` varchar(20) default NULL,
  `MARK` varchar(20) default NULL,
  `TOTAL` varchar(20) default NULL,
  `TIME` varchar(20) default NULL,
  `ACC` varchar(20) default NULL,
  `DATE` varchar(20) default NULL,
  `STTIME` varchar(20) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `2018039reg` */

insert into `2018039reg` (`SUB`,`ATT`,`WAN`,`MARK`,`TOTAL`,`TIME`,`ACC`,`DATE`,`STTIME`) values ('java','1','0','10','80','00:15 mm:ss','12 %','25/04/2018','12:08 PM');

/*Table structure for table `2018040reg` */

DROP TABLE IF EXISTS `2018040reg`;

CREATE TABLE `2018040reg` (
  `SUB` varchar(20) default NULL,
  `ATT` varchar(20) default NULL,
  `WAN` varchar(20) default NULL,
  `MARK` varchar(20) default NULL,
  `TOTAL` varchar(20) default NULL,
  `TIME` varchar(20) default NULL,
  `ACC` varchar(20) default NULL,
  `DATE` varchar(20) default NULL,
  `STTIME` varchar(20) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `2018040reg` */

insert into `2018040reg` (`SUB`,`ATT`,`WAN`,`MARK`,`TOTAL`,`TIME`,`ACC`,`DATE`,`STTIME`) values ('java','3','1','20','80','00:15 mm:ss','25 %','29/04/2018','11:57 AM');

/*Table structure for table `areg` */

DROP TABLE IF EXISTS `areg`;

CREATE TABLE `areg` (
  `NAME` varchar(20) default NULL,
  `PASSWORD` varchar(30) default NULL,
  `DOB` varchar(20) default NULL,
  `SUBJECT` varchar(20) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `areg` */

insert into `areg` (`NAME`,`PASSWORD`,`DOB`,`SUBJECT`) values ('ad','ad','1/1/1990','Java');
insert into `areg` (`NAME`,`PASSWORD`,`DOB`,`SUBJECT`) values ('Sagar Institute','sandeep','2/2/1919','java');

/*Table structure for table `c` */

DROP TABLE IF EXISTS `c`;

CREATE TABLE `c` (
  `SNO` int(11) default NULL,
  `QUESTION` varchar(1000) default NULL,
  `OP1` varchar(30) default NULL,
  `OP2` varchar(30) default NULL,
  `OP3` varchar(30) default NULL,
  `OP4` varchar(30) default NULL,
  `ANSWER` varchar(30) default NULL,
  `MARKS` varchar(4) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `c` */

insert into `c` (`SNO`,`QUESTION`,`OP1`,`OP2`,`OP3`,`OP4`,`ANSWER`,`MARKS`) values (1,'In which is not Support in C Language?','Method','Class','Inheritence','Object','Inheritence','10');
insert into `c` (`SNO`,`QUESTION`,`OP1`,`OP2`,`OP3`,`OP4`,`ANSWER`,`MARKS`) values (2,'C support a Special Feature which is?','Pointer','Function','Methods','Classes','Pointer','10');
insert into `c` (`SNO`,`QUESTION`,`OP1`,`OP2`,`OP3`,`OP4`,`ANSWER`,`MARKS`) values (3,'Choose the option not applicable for the constructor?','Can not be called explicit','Can not be OverLoaded','Can not be Override','None of These','Can not be Override','10');
insert into `c` (`SNO`,`QUESTION`,`OP1`,`OP2`,`OP3`,`OP4`,`ANSWER`,`MARKS`) values (4,' Which of the following is not a correct variable type?','short','real','int','double','real','10');
insert into `c` (`SNO`,`QUESTION`,`OP1`,`OP2`,`OP3`,`OP4`,`ANSWER`,`MARKS`) values (5,'What is ccccc','A','B','C','D','D','10');
insert into `c` (`SNO`,`QUESTION`,`OP1`,`OP2`,`OP3`,`OP4`,`ANSWER`,`MARKS`) values (6,'C	','XXX','ABC','ABC','ABC','ABC','10');
insert into `c` (`SNO`,`QUESTION`,`OP1`,`OP2`,`OP3`,`OP4`,`ANSWER`,`MARKS`) values (7,'Que	','A','B','C','D','A','10');
insert into `c` (`SNO`,`QUESTION`,`OP1`,`OP2`,`OP3`,`OP4`,`ANSWER`,`MARKS`) values (8,'jhjhjhhjh','jh','jh','jh','jh','jh','10');
insert into `c` (`SNO`,`QUESTION`,`OP1`,`OP2`,`OP3`,`OP4`,`ANSWER`,`MARKS`) values (9,'kj','lk','lk','lk','lk','lk','10');
insert into `c` (`SNO`,`QUESTION`,`OP1`,`OP2`,`OP3`,`OP4`,`ANSWER`,`MARKS`) values (10,'hihih','hj','hj','hj','hj','hj','10');

/*Table structure for table `java` */

DROP TABLE IF EXISTS `java`;

CREATE TABLE `java` (
  `SNO` int(11) default NULL,
  `QUESTION` varchar(1000) default NULL,
  `OP1` varchar(30) default NULL,
  `OP2` varchar(30) default NULL,
  `OP3` varchar(30) default NULL,
  `OP4` varchar(30) default NULL,
  `ANSWER` varchar(30) default NULL,
  `MARKS` varchar(4) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `java` */

insert into `java` (`SNO`,`QUESTION`,`OP1`,`OP2`,`OP3`,`OP4`,`ANSWER`,`MARKS`) values (1,'Java Inheritence','Extern Keyword','implements','Inherit','extends','extends','10');
insert into `java` (`SNO`,`QUESTION`,`OP1`,`OP2`,`OP3`,`OP4`,`ANSWER`,`MARKS`) values (2,'xxxxxxxxxxxxxxxxxxxxxxxx','AB','BC','CD','DE','AB','10');
insert into `java` (`SNO`,`QUESTION`,`OP1`,`OP2`,`OP3`,`OP4`,`ANSWER`,`MARKS`) values (3,'Gandhiji Was Born on','2 Oct','1 Oct','8 Sep','8 May','2 Oct','10');
insert into `java` (`SNO`,`QUESTION`,`OP1`,`OP2`,`OP3`,`OP4`,`ANSWER`,`MARKS`) values (4,'hjjhjgyfyd','jhjh','jhj','jh','hjhjh','hjhjh','10');
insert into `java` (`SNO`,`QUESTION`,`OP1`,`OP2`,`OP3`,`OP4`,`ANSWER`,`MARKS`) values (5,'java','A','B','C','D','C','10');
insert into `java` (`SNO`,`QUESTION`,`OP1`,`OP2`,`OP3`,`OP4`,`ANSWER`,`MARKS`) values (6,'Java','tech','mathamatics','HTML','CSS','tech','10');
insert into `java` (`SNO`,`QUESTION`,`OP1`,`OP2`,`OP3`,`OP4`,`ANSWER`,`MARKS`) values (7,'Shivraj	','A','B','C','D','B','10');
insert into `java` (`SNO`,`QUESTION`,`OP1`,`OP2`,`OP3`,`OP4`,`ANSWER`,`MARKS`) values (8,'ppppppp	','A','B','C','ghgh','A','10');

/*Table structure for table `js` */

DROP TABLE IF EXISTS `js`;

CREATE TABLE `js` (
  `SNO` int(4) default NULL,
  `QUESTION` varchar(1000) default NULL,
  `OP1` varchar(30) default NULL,
  `OP2` varchar(30) default NULL,
  `OP3` varchar(30) default NULL,
  `OP4` varchar(30) default NULL,
  `ANSWER` varchar(30) default NULL,
  `MARKS` varchar(4) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `js` */

insert into `js` (`SNO`,`QUESTION`,`OP1`,`OP2`,`OP3`,`OP4`,`ANSWER`,`MARKS`) values (1,'var x=10;\nWhat is this?','Variable Declaration','function Creation','method overloading','final variable','Variable Declaration','10');
insert into `js` (`SNO`,`QUESTION`,`OP1`,`OP2`,`OP3`,`OP4`,`ANSWER`,`MARKS`) values (2,'js idialogy is a basic knowledge of job sequentially\nrequirement which is published by java organic catagory of web Architetcure.\nnow what is the main purpose of js installation.','for Validation','Goto Server','Goto Container','Serializable','for Validation','10');

/*Table structure for table `jscript` */

DROP TABLE IF EXISTS `jscript`;

CREATE TABLE `jscript` (
  `SNO` int(4) default NULL,
  `QUESTION` varchar(1000) default NULL,
  `OP1` varchar(30) default NULL,
  `OP2` varchar(30) default NULL,
  `OP3` varchar(30) default NULL,
  `OP4` varchar(30) default NULL,
  `ANSWER` varchar(30) default NULL,
  `MARKS` varchar(4) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `jscript` */

insert into `jscript` (`SNO`,`QUESTION`,`OP1`,`OP2`,`OP3`,`OP4`,`ANSWER`,`MARKS`) values (1,'A','A','B','C','D','D','10');
insert into `jscript` (`SNO`,`QUESTION`,`OP1`,`OP2`,`OP3`,`OP4`,`ANSWER`,`MARKS`) values (2,'D','D','S','F','G','F','10');

/*Table structure for table `ques` */

DROP TABLE IF EXISTS `ques`;

CREATE TABLE `ques` (
  `SNO` int(11) default NULL,
  `QUESTION` varchar(1000) default NULL,
  `OP1` varchar(30) default NULL,
  `OP2` varchar(30) default NULL,
  `OP3` varchar(30) default NULL,
  `OP4` varchar(30) default NULL,
  `ANSWER` varchar(30) default NULL,
  `MARKS` varchar(3) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `ques` */

insert into `ques` (`SNO`,`QUESTION`,`OP1`,`OP2`,`OP3`,`OP4`,`ANSWER`,`MARKS`) values (1,'Which of the following is not an example of Operating System ?','Microsoft Office','Windows Vista','Unix','Ubuntu','Microsoft Office','10');
insert into `ques` (`SNO`,`QUESTION`,`OP1`,`OP2`,`OP3`,`OP4`,`ANSWER`,`MARKS`) values (2,'What is the Capital of Madhya Pradesh ?','Indore','Bhopal','Jabalpur','Ratlam','Bhopal','10');
insert into `ques` (`SNO`,`QUESTION`,`OP1`,`OP2`,`OP3`,`OP4`,`ANSWER`,`MARKS`) values (3,'What is the Unit of Computer Data in below?','Kilo','Kilo Byte','Mp3','Rar','Kilo Byte','10');
insert into `ques` (`SNO`,`QUESTION`,`OP1`,`OP2`,`OP3`,`OP4`,`ANSWER`,`MARKS`) values (4,'Who is the First women Prime Minister of India?','Indira Gandhi','Sonia Gandhi','Shushma Swaraj','Jaylalita','India Gandi','10');
insert into `ques` (`SNO`,`QUESTION`,`OP1`,`OP2`,`OP3`,`OP4`,`ANSWER`,`MARKS`) values (5,'which is the Higher Level language?','C','C++','COBOL','C/C++/COBOL','C/C++/COBOL','10');
insert into `ques` (`SNO`,`QUESTION`,`OP1`,`OP2`,`OP3`,`OP4`,`ANSWER`,`MARKS`) values (6,'FTP is?','Mail transfer protocol','File transfer protocol','Fund Transformation protocol','Firwell transfer Protocol','File transfer protocol','10');
insert into `ques` (`SNO`,`QUESTION`,`OP1`,`OP2`,`OP3`,`OP4`,`ANSWER`,`MARKS`) values (7,'Who is the first Prime Minister of India?','Jawahar Lal Nehru','Rajendra Prasad','Radhakrishnan Sarvpalli','Indira Gandhi','Jawahar Lal Nehru','10');
insert into `ques` (`SNO`,`QUESTION`,`OP1`,`OP2`,`OP3`,`OP4`,`ANSWER`,`MARKS`) values (8,'which one largest Rever in India	','Narmda','Ganga','Sindhu','Mandakini','Ganga','10');
insert into `ques` (`SNO`,`QUESTION`,`OP1`,`OP2`,`OP3`,`OP4`,`ANSWER`,`MARKS`) values (9,'Who is the first president of India?','Rajendra Prasad','Manmohan Singh','Jawahar Lal Nehru','Indira gandhi','Rajendra Prasad','10');
insert into `ques` (`SNO`,`QUESTION`,`OP1`,`OP2`,`OP3`,`OP4`,`ANSWER`,`MARKS`) values (10,'Which is the capital of India?','Dehli','Indore','Mumbai','Harda','Dehli','10');
insert into `ques` (`SNO`,`QUESTION`,`OP1`,`OP2`,`OP3`,`OP4`,`ANSWER`,`MARKS`) values (11,'Which one contry is called Gold Sparrow?','China','Pakistan','India','Nepal','India','10');
insert into `ques` (`SNO`,`QUESTION`,`OP1`,`OP2`,`OP3`,`OP4`,`ANSWER`,`MARKS`) values (12,'Where are Indore?','Madhya Pradesh','UttarPradesh','Maharastra','Rajasthan','Madhya Pradesh','10');

/*Table structure for table `sreg` */

DROP TABLE IF EXISTS `sreg`;

CREATE TABLE `sreg` (
  `NAME` varchar(30) default NULL,
  `PASSWORD` varchar(30) default NULL,
  `DOB` varchar(20) default NULL,
  `SUBJECT` varchar(20) default NULL,
  `ID` int(11) NOT NULL auto_increment,
  `LAST` varchar(30) default NULL,
  `CN` varchar(12) default NULL,
  `EMAIL` varchar(50) default NULL,
  `ADDRESS` varchar(50) default NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `sreg` */

insert into `sreg` (`NAME`,`PASSWORD`,`DOB`,`SUBJECT`,`ID`,`LAST`,`CN`,`EMAIL`,`ADDRESS`) values ('sandeep','sandeep','29/09/1997','java',2018034,'gurjar','9165964092','sandeepgurjar603@gmail.com','1421/24 Nanda Nagar Indore');
insert into `sreg` (`NAME`,`PASSWORD`,`DOB`,`SUBJECT`,`ID`,`LAST`,`CN`,`EMAIL`,`ADDRESS`) values ('abcd','abcd','1/1/1919','c',2018035,'abcd','898898989','abcd@gmail.com','subhash nagar indore');
insert into `sreg` (`NAME`,`PASSWORD`,`DOB`,`SUBJECT`,`ID`,`LAST`,`CN`,`EMAIL`,`ADDRESS`) values ('shivraj','sandeep','1/2/1920','c',2018036,'rajput',NULL,NULL,NULL);
insert into `sreg` (`NAME`,`PASSWORD`,`DOB`,`SUBJECT`,`ID`,`LAST`,`CN`,`EMAIL`,`ADDRESS`) values ('Praveen','praveen','1/1/1919','java',2018038,'Patil','9009604991','Ppraveen203@gmail.com','Nanda nagar Indore');
insert into `sreg` (`NAME`,`PASSWORD`,`DOB`,`SUBJECT`,`ID`,`LAST`,`CN`,`EMAIL`,`ADDRESS`) values ('Rahul','rahul','2/2/1921','java',2018039,'chouhan','456545545','s=rahul@gmail.com','rau bypass');
insert into `sreg` (`NAME`,`PASSWORD`,`DOB`,`SUBJECT`,`ID`,`LAST`,`CN`,`EMAIL`,`ADDRESS`) values ('nikki','123456','22/8/1997','java',2018040,'tomar',NULL,NULL,NULL);

/*Table structure for table `statusreg` */

DROP TABLE IF EXISTS `statusreg`;

CREATE TABLE `statusreg` (
  `SUB` varchar(20) default NULL,
  `ATT` varchar(20) default NULL,
  `WAN` varchar(20) default NULL,
  `MARK` varchar(20) default NULL,
  `TOTAL` varchar(20) default NULL,
  `TIME` varchar(20) default NULL,
  `ACC` varchar(20) default NULL,
  `NAME` varchar(30) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `statusreg` */

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;

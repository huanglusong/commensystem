/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 5.7.24 : Database - commentsystem
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`commentsystem` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `commentsystem`;

/*Table structure for table `firstlevelcomment` */

DROP TABLE IF EXISTS `firstlevelcomment`;

CREATE TABLE `firstlevelcomment` (
  `flc_id` int(11) NOT NULL AUTO_INCREMENT,
  `sayingId` int(11) NOT NULL,
  `commenter` varchar(50) NOT NULL,
  `commenterAvatar` varchar(50) NOT NULL,
  `commentContent` varchar(500) NOT NULL,
  `commentTime` datetime DEFAULT NULL,
  PRIMARY KEY (`flc_id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;

/*Data for the table `firstlevelcomment` */

insert  into `firstlevelcomment`(`flc_id`,`sayingId`,`commenter`,`commenterAvatar`,`commentContent`,`commentTime`) values (2,2,'huanghdidi','nihao','first_comment','2019-05-03 23:54:52'),(4,2,'huanghedidi','nihao','insert a flc','2019-05-04 01:12:31'),(5,2,'huanghedidi222','nihao','insert a flc','2019-05-04 01:13:51'),(6,1,'from browser','images/mario.jpg','我的父亲没有散文诗',NULL);

/*Table structure for table `saying` */

DROP TABLE IF EXISTS `saying`;

CREATE TABLE `saying` (
  `saying_id` int(11) NOT NULL AUTO_INCREMENT,
  `sayingContent` varchar(500) NOT NULL,
  `author` varchar(50) DEFAULT NULL,
  `sayingAvatar` varchar(50) DEFAULT NULL,
  `likes` varchar(500) DEFAULT NULL,
  `createTime` datetime DEFAULT NULL,
  PRIMARY KEY (`saying_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `saying` */

insert  into `saying`(`saying_id`,`sayingContent`,`author`,`sayingAvatar`,`likes`,`createTime`) values (1,'我喜欢，父亲的散文诗','huanghedidi','images/li.jpg','1,2,3,4','2019-05-06 12:32:06'),(2,'second_test','huanghedidi',NULL,'11','2019-05-03 23:54:15');

/*Table structure for table `secondlevelcomment` */

DROP TABLE IF EXISTS `secondlevelcomment`;

CREATE TABLE `secondlevelcomment` (
  `slc_id` int(11) NOT NULL AUTO_INCREMENT,
  `sayingId` int(11) NOT NULL,
  `flcId` int(11) NOT NULL,
  `replier` varchar(50) NOT NULL,
  `toCommenter` varchar(50) NOT NULL,
  `replyContent` varchar(50) NOT NULL,
  `replyTime` datetime NOT NULL,
  PRIMARY KEY (`slc_id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

/*Data for the table `secondlevelcomment` */

insert  into `secondlevelcomment`(`slc_id`,`sayingId`,`flcId`,`replier`,`toCommenter`,`replyContent`,`replyTime`) values (18,1,6,'timelessmemory','from browser',' 他的背影瘦弱像一张纸','2019-05-07 11:48:49');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`username`,`password`) values (1,'admin','123456');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

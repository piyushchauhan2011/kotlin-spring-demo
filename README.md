# kotlin-spring-demo

To use mysql instead of h2 in-memory database, checkout to mysql-demo branch.
Use the below schema for the database.
`application.properties` holds the value of username, password and database of mysql.

```
CREATE DATABASE kotlin-demo;
CREATE TABLE `customers` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `first_name` varchar(50) DEFAULT NULL,
  `last_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;
```

Cheers!!
# Spring - Hibernate Reverse Engineering(reveng)

## reveng- to generate entity classes from tables

## steps
 Clone the project
 create new user in mysql or update application.properties file

## commands

To start the process
```
 gradlew hbm2java
```

to add mysql db and data
```
mysql -u root -p < searchapp_db.sql

mysql -u root -p searchapp < searchapp_db_data.sql
```

to make a build
```
gradlew clean build
```

run
```
java -jar build/libs/Snapshot-xxx
```

## Acknowledgments

* Open Source community
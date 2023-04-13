# SecureVault
coding java 20 and java spring boot tester


#Command line  
Фолдер луугаа очиж байгаад асаах
./mvnw package
cd target/
 ls *.jar 
 java -jar mycodexapp-0.0.1-SNAPSHOT.jar

Шууд асаах
./mvnw sprint-boot:run

<!-- ADD support for spring boot actuator -->
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
<!-- ADD support for spring boot security -->
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-security</artifactId>
</dependency>

<!-- Resource Application Properties -->
management.endpoints.web.exposure.exclude=health,info

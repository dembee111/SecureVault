# SecureVault
coding java 20 and java spring boot tester


#Command line  
Фолдер луугаа очиж байгаад асаах<br />
./mvnw package<br />
cd target/<br />
 ls *.jar <br />
 java -jar mycodexapp-0.0.1-SNAPSHOT.jar<br />

Шууд асаах<br />
./mvnw sprint-boot:run

<!-- ADD support for spring boot actuator --><br />
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-actuator</artifactId>
</dependency><br />
<!-- ADD support for spring boot security --><br />
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-security</artifactId>
</dependency>

<!-- Resource Application Properties -->
management.endpoints.web.exposure.exclude=health,info

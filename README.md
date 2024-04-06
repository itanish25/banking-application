[Reference](https://www.javaguides.net/2023/08/banking-application-using-spring-boot.html)
<br>
<br>
[Reference for Configuring a Datasource Programmatically](https://www.baeldung.com/spring-boot-configure-data-source-programmatic#:~:text=3.%20Configuring%20a%20DataSource%20Programmatically)

***PROJECT - 1***

**Steps:**
1. Make sure Apache Tomcat is setup in your system to run the application at 'localhost:8080' port.
2. JAVA 17 is required
3. Download Mysql:
   (a) For Windows, run mysql on MYSQL command line
   (b) For MAC, run mysql in terminal usind command -> mysql -u root -p
4. Make a database with name banking_app in mysql
5. Change the database credentials in file src/main/resources/application.properties
6. Run mvn clean install
7. Run run the BankingApplication.java class.
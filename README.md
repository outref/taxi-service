# ![Taxi Service](https://raw.githubusercontent.com/outref/readme-recources/main/awesomedriver.jpg)
# <img src="https://raw.githubusercontent.com/outref/readme-recources/main/logo.jpg"  width="55" height="23">  Taxi Service
```
This application provides a minimalistic web-interface with authentication and 
registration functionalities that enables users to perform CRUD operations 
on the information stored in DB.
```
## 🚀 Demo
Please, check out a working  <b>👉 [LIVE DEMO](http://16.170.215.162:8080/taxi-service) 👈</b>


## 🎯 Features
- Registration as a Driver.
- Driver authentication (login).
- Create/update/delete cars.
- Create/update/delete manufacturers.
- Display table of all drivers.
- Display table of all cars (and their drivers).
- Display table of current user's cars.
- Connect driver to a car.
- Log out from application.

## 📖 Structure
![structure](https://raw.githubusercontent.com/outref/readme-recources/main/structure.jpg)
- <b> taxi/ </b> - folder contains all of application's logic
- <b> controller/ </b> - folder contains all the controllers (servlets) to handle requests, such as: <b>IndexController</b>, <b>LoginController</b>, <b> AddCarController </b>, <b> DisplayAllCarsController </b>, and all other controllers for cars, drivers and manufacturers.
- <b> dao/ </b> - folder contains all the Dao classes to perform operations on the DB.
- <b> ecxeption/ </b> - holds all custom exception classes.
- <b> lib/ </b> - contains <b> Injector </b> class to perform DI and custom annotations.
- <b> model/ </b> - model classes of <b> Driver </b>, <b> Car </b> and <b> Manufacturer </b>.
- <b> service/ </b> - service layer of the application.
- <b> util/ </b> - contains utility class for database connection.
- <b> web.filter/ </b> - contains <b> <b> AuthenticationFilter </b> </b> class that provides authentication control.
- <b> resources/ </b> - contains <b> init_db.sql </b> that helps to initialize DB before running the application.
- <b> webapp/ </b> - folder with web resources (presentation layer of the application).
- <b> WEB-INF/views/ </b> - contains the dynamic web-resources - .jsp files to display the web-pages.
- <b> web-resources/ </b> - folder with static resources, such as css styles and images.
- <b> web.xml </b> - file that provides servlet mapping.

Application is structured according to N-Tier structure pattern with Presentation, Service and Data layers.

## 🤖 Technologies
- <b>Java 11</b>
- <b>JDBC</b> for relational DB connection.
- <b>Java Servlet + JSP</b> to handle requests and display dynamic web-pages.
- <b>Maven</b> build tool.
- <b>Bootstrap</b> for front-end.
- Live demo is deployed using <b>Apache Tomcat</b> running om Amazon <b>AWS EC2</b> instance connected to <b>RDS MySQL</b> database.

## ⚙️ How to run locally
1. Clone this repository to your local machine using `git clone`.
2. Navigate to the project directory using `cd <path to directory>/taxi-service`.
3. Ensure that you have Java, Apache Tomcat and any relational DB management system (like MySQL) installed on your system.
4. Copy initialization commands from `src/main/resources/init_db.sql` and  run them in your RDBMS CLI or GUI.
5. Configure the database settings in `src/main/resources/db.properties`.
6. Build the application using `mvn package`.
7. Copy the generated WAR file to the `webapps/` directory of your Tomcat installation and rename it to `taxi-service.war` .
8. Start Tomcat by running the `startup.sh` (or `startup.bat` on Windows) script in the `bin/` directory of your Tomcat installation.
9. Open your web browser and go to `http://localhost:8080/taxi-service` to view the application.
10.Enjoy!  



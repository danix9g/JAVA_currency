@echo off
cd /d %~dp0
echo Cleaning and running Spring Boot application...
mvn clean spring-boot:run

echo.
echo Press any key to exit...
pause

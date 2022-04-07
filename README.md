
**Single Test**

`mvn clean -Dtest=YourClassName test`

**Generate Allure reports**

`allure serve allure-results`


**Install Selenoid**

`curl -s https://aerokube.com/cm/bash | bash && ./cm selenoid start — vnc
`

**Mac give execution permissions to binary**

`chmod +x cm`

**Run Selenoid**

`./cm selenoid start — vnc` 
`./cm selenoid-ui start`
`./cm selenoid-ui stop`

**Server**

`http://localhost:8080/`
`localhost:4444/wd/hub`
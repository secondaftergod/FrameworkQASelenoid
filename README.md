
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

**Jenkins**

`/opt/homebrew/opt/openjdk@11/bin/java -Dmail.smtp.starttls.enable=true -jar /opt/homebrew/opt/jenkins-lts/libexec/jenkins.war --httpListenAddress=127.0.0.1 --httpPort=8080`

***Sample commands***:

*Install the latest LTS version:*
`brew install jenkins-lts`

*Install a specific LTS version:*
`brew install jenkins-lts@YOUR_VERSION`

*Start the Jenkins service:*
`brew services start jenkins-lts`

*Restart the Jenkins service:*
`brew services restart jenkins-lts`

*Update the Jenkins version:*
`brew upgrade jenkins-lts`
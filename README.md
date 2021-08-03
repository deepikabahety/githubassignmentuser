Step 1) Download the repo from the git 
Repo and Branch details:
Repository Name – deepikabahety/githubassignmentuser
Branch Name – feature/qa_made_yours
Pull the code in your local machine 

Step 2) Make sure the chrome driver version is same as local chrome browser version and place the exe file in the location below of the project directory
“\com.github.user\tools\ChromeDriver" (driver version should be same as local chrome browser version)

Step 3) Compile and Run 
a)	Open the command prompt and go to project directory (“com.github.user”)
b)	Enter the command “mvn clean install -U -DskipTests”  - this will download all the maven dependencies and might take some time to complete, there can be user input required
( like press Enter) in the middle of the step while downloading
c)	Once the above is complete please enter the following command to run the test  
mvn test  -Dgithubuser={username}
(Ex- “mvn test -Dgithubuser=torvalds”)

 

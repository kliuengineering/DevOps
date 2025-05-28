# Installations

## Basics
- Install Java 17+ from Oracle
  - Add a system path, eg, `C:\Program Files\Common Files\Oracle\Java\javapath`
- Download and install the stand-alone ZIP version of Eclipse IDE `https://www.eclipse.org/downloads/packages/`
- Install Maven from `https://maven.apache.org/download.cgi`
  - Add the following system paths, eg:
    - M2_HOME -> `C:\Programs\Maven\apache-maven-3.9.9-bin\apache-maven-3.9.9`
    - MAVEN_HOME -> `C:\Programs\Maven\apache-maven-3.9.9-bin\apache-maven-3.9.9`
    - Path -> append this -> `%M2_HOME%\bin`
- Eclipse + Maven setup example: `https://www.youtube.com/watch?v=nCJoia7wosc&list=PLhW3qG5bs-L8oRay6qeS70vJYZ3SBQnFa&ab_channel=AutomationStepbyStep`
  - pom.xml -> dependency + library maintenance
    - use `https://mvnrepository.com/` for searching dependencies to install
    - select `dependencies` bottom pane -> `add...` -> fill in the required info `group id`, `artifact id`, `version` from website above
    - following the above logic, add the following as well:
      - JUnit
      - TestNG
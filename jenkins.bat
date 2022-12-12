pipeline{
    agent any
    environment{
        JAVA_HOME = "C:/java/jdk-11.0.1"
        MAVEN_HOME ="C:/Users/sadha/Downloads/apache-maven-3.8.6"
    }
    stages{
     
        stage("initialize"){
            steps{
            
                git branch: 'main', url: 'https://github.com/singhSadhana7/DevOps.git'
            
            }
            

        }
       
        stage("build"){
            steps{
            
                bat "mvn clean install"
            
            }
            

        }
        
        stage("sonar analysis"){
            steps{
            
               withSonarQubeEnv("sonarReport"){
                   
                bat "mvn sonar:sonar"
               }
            }
        
    }
    
}

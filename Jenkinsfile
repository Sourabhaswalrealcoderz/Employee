pipeline {
    agent any
    tools{
    maven "maven"
    }
   

    stages {
        stage('Git') {
            steps {
                echo 'GITHUB'
                git branch: 'development', credentialsId: '123', url: 'https://github.com/Sourabhaswalrealcoderz/Employee.git'
            }
        }
        
         stage('BUILD') {
            steps {
                echo 'BUILDING'
                sh " mvn install"
               
               
                
            }
        }
        
         stage('TEST') {
            steps {
                echo 'TESTING'
            }
        }
        
         stage('DEPLOY') {
            steps {
                echo 'DEPLOYMENT'
            }
        }
    }
}

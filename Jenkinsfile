pipeline {
    agent any
   

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

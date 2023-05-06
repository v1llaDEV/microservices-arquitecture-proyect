pipeline {
    options {
            disableConcurrentBuilds()
        }
    agent any
        tools {
            maven 'Maven3'
        }
    stages {
        stage('BUILD'){
            steps{
                git 'https://github.com/v1llaDEV/naming-server-eureka.git'
                sh 'mvn clean package -Dmaven.test.skip'

            }
        }
        stage('DOCKERIZE'){
            steps{
                echo 'clean old containers'
                sh 'docker rm naming-server-eureka --force'
                echo 'clean old images'
                sh 'docker rmi naming-server-eureka --force'
                echo 'Build image'
                sh 'docker build . -t naming-server-eureka'
            }
        }

        stage('DEPLOY'){
            steps{
                 echo 'Deploying'
                  sh 'docker run -p 8761:8761 -d --name naming-server-eureka --network tomcat-mysql-network naming-server-eureka'
            }
        }
    }
}
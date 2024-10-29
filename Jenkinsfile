


pipeline {
    agent any

    tools{
        maven 'my-maven'
        jdk 'my-jdk'
    }

    stages {
        stage('Git') {
            steps {
                echo 'Pull code from github'
                git url : 'https://github.com/anxgh-n/Book-project-eureka.git',branch:'master'
            }
        }
        stage('Build') {
            steps {
                echo 'Build project using maven'
                bat "mvn clean install -DskipTests"
            }
        }
        stage('Test') {
            steps {
                echo 'Test your application'
                bat "mvn test"
            }
        }
        stage('Deploy'){
            steps{
                echo 'Deploy the project'
                bat 'docker rm -f eurekabook-container || true'
                bat 'docker rmi -f eurekabook-image || true'
                bat 'docker build -t eurekabook-image .'
                bat 'docker run --network eureka-network -p 8761:8761 -d --name eurekabook-container eurekabook-image'
            }
        }
    }
}
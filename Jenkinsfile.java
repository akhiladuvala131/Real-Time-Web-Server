pipeline {
    agent any // Use any available agent/node

    stages {
        stage('Clone Repository') {
            steps {
                echo 'Cloning repository...'
                git branch: 'main', url: 'https://github.com/your-repository.git'
            }
        }
        
        stage('Build') {
            steps {
                echo 'Building application...'
                sh './build.sh' // Replace with your build command
            }
        }
        
        stage('Test') {
            steps {
                echo 'Running tests...'
                sh './run-tests.sh' // Replace with your test command
            }
        }
        
        stage('Deploy') {
            steps {
                echo 'Deploying application...'
                sh './deploy.sh' // Replace with your deploy command
            }
        }
    }

    post {
        success {
            echo 'Pipeline completed successfully!'
        }
        failure {
            echo 'Pipeline failed.'
        }
    }
}

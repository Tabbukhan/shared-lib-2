@Library('comexample@master') _

pipeline {
    agent any

    stages {
        stage('Use Shared Library Step') {
            steps {
                myCustomStep('World')
            }
        }

        stage('Use Shared Library Function') {
            steps {
                script {
                    customLibrary.sayHello('World')
                }
            }
        }
    }
}
